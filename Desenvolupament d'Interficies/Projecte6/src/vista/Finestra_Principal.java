/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Controlador;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.util.*;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

import java.net.*;
import javax.help.HelpBroker;
import javax.help.HelpSet;
/**
 *
 * @author alumno
 */
public class Finestra_Principal extends javax.swing.JFrame {
     private static String OS;
     private static String dir;
     
    /**
     * Creates new form Finestra_Principal
     */
    public Finestra_Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        iniciarCombos();
        OS = System.getProperty("os.name").toLowerCase();
        dir = System.getProperty("user.dir");
        voreAjuda();


    }
    
    public void iniciarCombos() {
        ArrayList<String> extraescolars = Controlador.extraescolars();
        for(int i = 0; i < extraescolars.size(); i++) {
            combo1.addItem(extraescolars.get(i));
            combo2.addItem(extraescolars.get(i));
            combo3.addItem(extraescolars.get(i));
            combo4.addItem(extraescolars.get(i));
            combo5.addItem(extraescolars.get(i));
        }
        combo1.setSelectedIndex(0);
        combo2.setSelectedIndex(1);
        combo3.setSelectedIndex(2);
        combo4.setSelectedIndex(3);
        combo5.setSelectedIndex(4);
        
    }
    
    public static boolean isWindows() {
        return (OS.indexOf("win") >= 0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        combo1 = new javax.swing.JComboBox<>();
        txt1 = new javax.swing.JTextField();
        combo2 = new javax.swing.JComboBox<>();
        combo3 = new javax.swing.JComboBox<>();
        combo4 = new javax.swing.JComboBox<>();
        combo5 = new javax.swing.JComboBox<>();
        txt2 = new javax.swing.JTextField();
        txt3 = new javax.swing.JTextField();
        txt4 = new javax.swing.JTextField();
        txt5 = new javax.swing.JTextField();
        bPdf1 = new javax.swing.JButton();
        bPdf2 = new javax.swing.JButton();
        bPdf3 = new javax.swing.JButton();
        bPdf4 = new javax.swing.JButton();
        bPdf5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtDiaSetmana = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        bRepartiment = new javax.swing.JButton();
        bFitxer = new javax.swing.JButton();
        bModificarExtraescolars = new javax.swing.JButton();
        bNoSeleccionats = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        bFitxerMenu = new javax.swing.JMenuItem();
        bAjudaMenu = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        bExtraescolarsMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Activitats extraescolars");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Selecci??", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel5.setText("Extraescolar");

        jLabel6.setText("N?? M??xim");

        bPdf1.setText("pdf");
        bPdf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPdf1ActionPerformed(evt);
            }
        });

        bPdf2.setText("pdf");
        bPdf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPdf2ActionPerformed(evt);
            }
        });

        bPdf3.setText("pdf");
        bPdf3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPdf3ActionPerformed(evt);
            }
        });

        bPdf4.setText("pdf");
        bPdf4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPdf4ActionPerformed(evt);
            }
        });

        bPdf5.setText("pdf");
        bPdf5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPdf5ActionPerformed(evt);
            }
        });

        jLabel1.setText("Escriu el dia de la setmana:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(combo5, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt5))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(combo4, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt4))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(combo3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt3))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(combo1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt1)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(combo2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt2)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bPdf1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bPdf2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bPdf3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bPdf4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bPdf5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(44, 44, 44)
                        .addComponent(txtDiaSetmana)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bPdf1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bPdf2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bPdf3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bPdf4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bPdf5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDiaSetmana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gesti??", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        bRepartiment.setText("Repartiment d'Extraescolars");
        bRepartiment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRepartimentActionPerformed(evt);
            }
        });

        bFitxer.setText("Carrega Fitxer Alumnes");
        bFitxer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFitxerActionPerformed(evt);
            }
        });

        bModificarExtraescolars.setText("Modificar Extraescolars");
        bModificarExtraescolars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bModificarExtraescolarsActionPerformed(evt);
            }
        });

        bNoSeleccionats.setText("Imprimir NO Seleccionats");
        bNoSeleccionats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNoSeleccionatsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bNoSeleccionats, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bModificarExtraescolars, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bRepartiment, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bFitxer, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(bFitxer, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bModificarExtraescolars, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bNoSeleccionats, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bRepartiment, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButton1.setText("Eixir");

        jMenu1.setText("Arxiu");

        bFitxerMenu.setText("Pujar Fitxer Alumnes");
        bFitxerMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFitxerMenuActionPerformed(evt);
            }
        });
        jMenu1.add(bFitxerMenu);

        bAjudaMenu.setText("Ajuda");
        bAjudaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAjudaMenuActionPerformed(evt);
            }
        });
        jMenu1.add(bAjudaMenu);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");

        bExtraescolarsMenu.setText("Modificar Extraescolars");
        bExtraescolarsMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExtraescolarsMenuActionPerformed(evt);
            }
        });
        jMenu2.add(bExtraescolarsMenu);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bFitxerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFitxerActionPerformed
        FileNameExtensionFilter filter = new FileNameExtensionFilter(".csv" , "csv");
        JFileChooser a = new JFileChooser();
        a.setFileSelectionMode(JFileChooser.FILES_ONLY);
        a.setFileFilter(filter);
        int resultat = a.showDialog(a, "Acceptar");
        File fitxer = a.getSelectedFile();
        if((fitxer == null) || fitxer.getName().contentEquals("")) {
            JOptionPane.showMessageDialog(null, "Arxiu inv??lid");
        } else {
            JOptionPane.showMessageDialog(null, "Ha comen??at");
            Controlador.pasarCSV(fitxer);
            JOptionPane.showMessageDialog(null, "Ja ha acabat");
        }
    }//GEN-LAST:event_bFitxerActionPerformed

    private void bRepartimentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRepartimentActionPerformed
        try {
            String opcio = (String) combo1.getSelectedItem();
            int limit = Integer.parseInt(txt1.getText());
            String extra = "primeraextraescolar";
            Controlador.pOpcio(opcio, limit, extra);
            
            opcio = (String) combo2.getSelectedItem();
            limit = Integer.parseInt(txt2.getText());
            extra = "segonaextraescolar";
            Controlador.pOpcio(opcio, limit, extra);
            
            
            opcio = (String) combo3.getSelectedItem();
            limit = Integer.parseInt(txt3.getText());
            extra = "terceraextraescolar";
            Controlador.pOpcio(opcio, limit, extra);
            
            opcio = (String) combo4.getSelectedItem();
            limit = Integer.parseInt(txt4.getText());
            extra = "quartaextraescolar";
            Controlador.pOpcio(opcio, limit, extra);
            
            opcio = (String) combo5.getSelectedItem();
            limit = Integer.parseInt(txt5.getText());
            extra = "quintaextraescolar";
            Controlador.pOpcio(opcio, limit, extra);
            
            Controlador.limits();
            
            Controlador.sOpcio();
            Controlador.tOpcio();
            Controlador.quartaOpcio();
            Controlador.quintaOpcio();
            
            JOptionPane.showMessageDialog(null, "Ja est?? fet el repartiment");

        } catch(NumberFormatException nfe) {
            nfe.printStackTrace();
        }
    }//GEN-LAST:event_bRepartimentActionPerformed

    private void bModificarExtraescolarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModificarExtraescolarsActionPerformed
        Finestra_Activitats a = new Finestra_Activitats();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bModificarExtraescolarsActionPerformed

    private void bNoSeleccionatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNoSeleccionatsActionPerformed
        model.BBDDConnexio.connectar();
        String dia = txtDiaSetmana.getText();
        String ntabla = "No seleccionats";
        
        try {
            Map parametros = new HashMap();
            parametros.put("tabla", ntabla);
            parametros.put("dia", dia);
            
            if (isWindows()) {
                JasperReport informe = (JasperReport) JRLoader.loadObjectFromFile(dir + "\\reports\\reportNoTriats.jasper");
                JasperPrint mostrarInforme = JasperFillManager.fillReport(informe, parametros, model.BBDDConnexio.connectar());
                JasperViewer view = new JasperViewer(mostrarInforme, false);
                view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                view.setVisible(true);
                
            } else {
                JasperReport informe = (JasperReport) JRLoader.loadObjectFromFile(dir + "/reports/reportNoTriats.jasper");
                JasperPrint mostrarInforme = JasperFillManager.fillReport(informe, parametros, model.BBDDConnexio.connectar());
                JasperViewer view = new JasperViewer(mostrarInforme, false);
                view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                view.setVisible(true);
            }
        } catch (JRException ex) {
                //Logger.getLogger(controlador.class.getName()).log(Level.SEVERE, null, ex);
                ex.printStackTrace();
        }
    

        
    }//GEN-LAST:event_bNoSeleccionatsActionPerformed

    private void bPdf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPdf1ActionPerformed
        model.BBDDConnexio.connectar();
        String dia = txtDiaSetmana.getText();
        String ntabla = combo1.getSelectedItem().toString();
        
        try {
            Map parametros = new HashMap();
            parametros.put("tabla", ntabla);
            parametros.put("dia", dia);
            
            if (isWindows()) {
                JasperReport informe = (JasperReport) JRLoader.loadObjectFromFile(dir + "\\reports\\reportPrimeraExtra.jasper");
                JasperPrint mostrarInforme = JasperFillManager.fillReport(informe, parametros, model.BBDDConnexio.connectar());
                JasperViewer view = new JasperViewer(mostrarInforme, false);
                view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                view.setVisible(true);
                
            } else {
                JasperReport informe = (JasperReport) JRLoader.loadObjectFromFile(dir + "/reports/reportPrimeraExtra.jasper");
                JasperPrint mostrarInforme = JasperFillManager.fillReport(informe, parametros, model.BBDDConnexio.connectar());
                JasperViewer view = new JasperViewer(mostrarInforme, false);
                view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                view.setVisible(true);
            }
        } catch (JRException ex) {
                //Logger.getLogger(controlador.class.getName()).log(Level.SEVERE, null, ex);
                ex.printStackTrace();
        }
    }//GEN-LAST:event_bPdf1ActionPerformed

    private void bPdf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPdf2ActionPerformed
        model.BBDDConnexio.connectar();
        String dia = txtDiaSetmana.getText();
        String ntabla = combo2.getSelectedItem().toString();
        
         try {
            Map parametros = new HashMap();
            parametros.put("tabla", ntabla);
            parametros.put("dia", dia);
            
            if (isWindows()) {
                JasperReport informe = (JasperReport) JRLoader.loadObjectFromFile(dir + "\\reports\\reportSegonaExtra.jasper");
                JasperPrint mostrarInforme = JasperFillManager.fillReport(informe, parametros, model.BBDDConnexio.connectar());
                JasperViewer view = new JasperViewer(mostrarInforme, false);
                view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                view.setVisible(true);
                
            } else {
                JasperReport informe = (JasperReport) JRLoader.loadObjectFromFile(dir + "/reports/reportSegonaExtra.jasper");
                JasperPrint mostrarInforme = JasperFillManager.fillReport(informe, parametros, model.BBDDConnexio.connectar());
                JasperViewer view = new JasperViewer(mostrarInforme, false);
                view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                view.setVisible(true);
            }
        } catch (JRException ex) {
                //Logger.getLogger(controlador.class.getName()).log(Level.SEVERE, null, ex);
                ex.printStackTrace();
        }
    }//GEN-LAST:event_bPdf2ActionPerformed

    private void bPdf3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPdf3ActionPerformed
        model.BBDDConnexio.connectar();
        
        String dia = txtDiaSetmana.getText();
        String ntabla = combo3.getSelectedItem().toString();
        
        try {
            Map parametros = new HashMap();
            parametros.put("tabla", ntabla);
            parametros.put("dia", dia);
            
            if (isWindows()) {
                JasperReport informe = (JasperReport) JRLoader.loadObjectFromFile(dir + "\\reports\\reportTerceraExtra.jasper");
                JasperPrint mostrarInforme = JasperFillManager.fillReport(informe, parametros, model.BBDDConnexio.connectar());
                JasperViewer view = new JasperViewer(mostrarInforme, false);
                view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                view.setVisible(true);
                
            } else {
                JasperReport informe = (JasperReport) JRLoader.loadObjectFromFile(dir + "/reports/reportTerceraExtra.jasper");
                JasperPrint mostrarInforme = JasperFillManager.fillReport(informe, parametros, model.BBDDConnexio.connectar());
                JasperViewer view = new JasperViewer(mostrarInforme, false);
                view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                view.setVisible(true);
            }
        } catch (JRException ex) {
                //Logger.getLogger(controlador.class.getName()).log(Level.SEVERE, null, ex);
                ex.printStackTrace();
        }
    }//GEN-LAST:event_bPdf3ActionPerformed

    private void bPdf4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPdf4ActionPerformed
        model.BBDDConnexio.connectar();
        String dia = txtDiaSetmana.getText();
        String ntabla = combo4.getSelectedItem().toString();
        
        try {
            Map parametros = new HashMap();
            parametros.put("tabla", ntabla);
            parametros.put("dia", dia);
            
            if (isWindows()) {
                JasperReport informe = (JasperReport) JRLoader.loadObjectFromFile(dir + "\\reports\\ReportQuartaExtraescolar.jasper");
                JasperPrint mostrarInforme = JasperFillManager.fillReport(informe, parametros, model.BBDDConnexio.connectar());
                JasperViewer view = new JasperViewer(mostrarInforme, false);
                view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                view.setVisible(true);
                
            } else {
                JasperReport informe = (JasperReport) JRLoader.loadObjectFromFile(dir + "/reports/ReportQuartaExtraescolar.jasper");
                JasperPrint mostrarInforme = JasperFillManager.fillReport(informe, parametros, model.BBDDConnexio.connectar());
                JasperViewer view = new JasperViewer(mostrarInforme, false);
                view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                view.setVisible(true);
            }
        } catch (JRException ex) {
                //Logger.getLogger(controlador.class.getName()).log(Level.SEVERE, null, ex);
                ex.printStackTrace();
        }
    }//GEN-LAST:event_bPdf4ActionPerformed

    private void bPdf5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPdf5ActionPerformed
        model.BBDDConnexio.connectar();
        String dia = txtDiaSetmana.getText();
        String ntabla = combo5.getSelectedItem().toString();
        
        try {
            Map parametros = new HashMap();
            parametros.put("tabla", ntabla);
            parametros.put("dia", dia);
            
            if (isWindows()) {
                JasperReport informe = (JasperReport) JRLoader.loadObjectFromFile(dir + "\\reports\\reportQuintaExtra.jasper");
                JasperPrint mostrarInforme = JasperFillManager.fillReport(informe, parametros, model.BBDDConnexio.connectar());
                JasperViewer view = new JasperViewer(mostrarInforme, false);
                view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                view.setVisible(true);
                
            } else {
                JasperReport informe = (JasperReport) JRLoader.loadObjectFromFile(dir + "/reports/reportQuintaExtra.jasper");
                JasperPrint mostrarInforme = JasperFillManager.fillReport(informe, parametros, model.BBDDConnexio.connectar());
                JasperViewer view = new JasperViewer(mostrarInforme, false);
                view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                view.setVisible(true);
            }
        } catch (JRException ex) {
                //Logger.getLogger(controlador.class.getName()).log(Level.SEVERE, null, ex);
                ex.printStackTrace();
        }
    }//GEN-LAST:event_bPdf5ActionPerformed

    private void bFitxerMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFitxerMenuActionPerformed
        FileNameExtensionFilter filter = new FileNameExtensionFilter(".csv" , "csv");
        JFileChooser a = new JFileChooser();
        a.setFileSelectionMode(JFileChooser.FILES_ONLY);
        a.setFileFilter(filter);
        int resultat = a.showDialog(a, "Acceptar");
        File fitxer = a.getSelectedFile();
        if((fitxer == null) || fitxer.getName().contentEquals("")) {
            JOptionPane.showMessageDialog(null, "Arxiu inv??lid");
        } else {
            Controlador.pasarCSV(fitxer);
        }
    }//GEN-LAST:event_bFitxerMenuActionPerformed

    private void bExtraescolarsMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExtraescolarsMenuActionPerformed
        Finestra_Activitats a = new Finestra_Activitats();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bExtraescolarsMenuActionPerformed

    private void bAjudaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAjudaMenuActionPerformed
        voreAjuda();
    }//GEN-LAST:event_bAjudaMenuActionPerformed
    
    public void voreAjuda() {
        try {
            // Carga el fichero de ayuda
            File fichero = null;
            URL hsURL = null;
            
            if(isWindows()) {
                fichero = new File(dir + "\\help\\help_set.hs");
                hsURL = fichero.toURI().toURL();
            } else {
                fichero = new File(dir + "/help/help_set.hs");
                hsURL = fichero.toURI().toURL();
            }
            // Crea el HelpSet y el HelpBroker
            HelpSet helpset = new HelpSet(getClass().getClassLoader(), hsURL);
            HelpBroker hb = helpset.createHelpBroker();

            // Pone ayuda a item de menu al pulsarlo y a F1 en ventana
            // principal y secundaria.
            hb.enableHelpOnButton(bAjudaMenu, "aplicacion", helpset);
            hb.enableHelpKey(getRootPane(), "ventana_principal", helpset);
            hb.enableHelpKey(this, "ventana_secundaria", helpset);

        } catch (Exception e) {
            e.printStackTrace();
	}
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Finestra_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Finestra_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Finestra_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Finestra_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Finestra_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem bAjudaMenu;
    private javax.swing.JMenuItem bExtraescolarsMenu;
    private javax.swing.JButton bFitxer;
    private javax.swing.JMenuItem bFitxerMenu;
    private javax.swing.JButton bModificarExtraescolars;
    private javax.swing.JButton bNoSeleccionats;
    private javax.swing.JButton bPdf1;
    private javax.swing.JButton bPdf2;
    private javax.swing.JButton bPdf3;
    private javax.swing.JButton bPdf4;
    private javax.swing.JButton bPdf5;
    private javax.swing.JButton bRepartiment;
    private javax.swing.JComboBox<String> combo1;
    private javax.swing.JComboBox<String> combo2;
    private javax.swing.JComboBox<String> combo3;
    private javax.swing.JComboBox<String> combo4;
    private javax.swing.JComboBox<String> combo5;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextField txt5;
    private javax.swing.JTextField txtDiaSetmana;
    // End of variables declaration//GEN-END:variables
}
