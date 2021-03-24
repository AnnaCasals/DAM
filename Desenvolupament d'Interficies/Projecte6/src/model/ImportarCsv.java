/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import net.sf.jasperreports.engine.JRException;

/**
 *
 * @author alumno
 */
public class ImportarCsv {
    
    public static void importar(String url) {
        Connection connexio = BBDDConnexio.connectar();
        String sql = url;
        
        try {
            Statement pes = connexio.createStatement();
            PreparedStatement ps = connexio.prepareStatement("LOAD DATA LOCAL INFILE ? INTO TABLE opcions FIELDS TERMINATED BY ',' ENCLOSED BY '\' LINES TERMINATED BY '\\r\\n' " );
            ps.setString(1, sql);
            System.out.println(ps);
            ps.executeUpdate();
        } catch(SQLException sqle) {
            sqle.printStackTrace();
        }
    }
    
    public static void importarExcel(String url) {
        Connection connexio = BBDDConnexio.connectar();
        String sql = url;
        
        try {
            PreparedStatement psvaciar = connexio.prepareStatement("DELETE from opcions");
            psvaciar.execute();
        
            BufferedReader br = null;
            String line = "";
            String csvSplitBy = ",";
            int currentLine = 0;
            br = new BufferedReader(new FileReader(sql));
            PreparedStatement prep = connexio.prepareStatement("INSERT INTO opcions(nom , curs, p_opcio, s_opcio, t_opcio, quarta_opcio, quinta_opcio) values (?,?,?,?,?,?,?)");
            
            while((line = br.readLine()) != null) {
                if(currentLine >= 0) {
                    String[] table = line.split(csvSplitBy);
                    int tamanyo = table.length;
                    int j = 0;
                    for(int i = 0; i < tamanyo; i++) {
                        j = i + 1;
                        prep.setString(j, (table[i]));
                    }
                    prep.execute();
                    for(int i = 0; i < tamanyo; i++) {
                        j = i + 1;
                        prep.setString(j, null);
                    }
                }
                currentLine++;
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch(SQLException ex) {
            ex.printStackTrace();
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }
        BBDDConnexio.desconnectar();
    }
}
/*
    view.setDefaulrCloseOperation(DISPOSE_ON_CLOSE);
    view.setVisible(true);
    } catch(JRException ex) {
        ex.printStackTrace();
    }
}
*/
