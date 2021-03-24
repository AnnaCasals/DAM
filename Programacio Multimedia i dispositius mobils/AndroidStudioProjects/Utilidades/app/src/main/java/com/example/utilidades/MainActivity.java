package com.example.utilidades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button bLletraDNI;
    private Button bCalcular;
    private Button bArrel;
    private Button bConversor;

    private EditText txtDNI;
    private EditText txtNIF;

    private EditText txtArrel;
    private TextView resultatArrel;

    private String[] monedes = {"Euro", "Dólar", "Libra", "Yen"};
    private Spinner monUsu;
    private Spinner monRes;

    private TextView lblResultat;
    private EditText txtUsuari;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bLletraDNI = findViewById(R.id.botoCalcularDNI);
        bArrel = findViewById(R.id.bCalcularArrel);
        bConversor = findViewById(R.id.bConversor);

    }

    public void lanzarLletraDNI(View view) {
        setContentView(R.layout.lletra_dni);
    }
    public void lanzarArrel(View view) { setContentView(R.layout.calcular_arrel); }
    public void lanzarConversor(View view) {
        setContentView(R.layout.conversor);
        monUsu = findViewById(R.id.spUsu);
        monRes = findViewById(R.id.spRes);

        monUsu.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, monedes));
        monRes.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, monedes));
    }
    public void lanzarAtras(View view) {
        setContentView(R.layout.activity_main);
    }
    public void calcular(View view) {
        txtDNI = (EditText) findViewById(R.id.txtDNI);
        txtNIF = (EditText) findViewById(R.id.txtResultat);

        String a = txtDNI.getText().toString();

        char[] letrasNIF = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E', 'T'};
        int pos = -1;
        try {
            int dni = Integer.parseInt(a);
            pos = dni % 23;

        } catch (NumberFormatException e) {
            e.getStackTrace();
        }
        txtNIF.setText(String.valueOf(a) + String.valueOf(letrasNIF[pos]));
    }

    public void calcularArrel(View view) {
        txtArrel = findViewById(R.id.txtArrel);
        resultatArrel = findViewById(R.id.lblResultat);
        try {
            double a = Double.parseDouble(txtArrel.getText().toString());
            resultatArrel.setText(" " + Math.sqrt(a));

        } catch (NumberFormatException e) {
            e.getStackTrace();
        }
    }

    public void conversor(View view) {
        String monUsuari = (String) monUsu.getSelectedItem();
        String monResultat = (String) monRes.getSelectedItem();

        lblResultat = findViewById(R.id.txtRes);
        txtUsuari = findViewById(R.id.txtUsuari);

        Double usu = Double.parseDouble(txtUsuari.getText().toString());;
        Double res;

        switch (monUsuari) {
            case "Euro":
                switch(monResultat) {
                    case "Euro":
                        lblResultat.setText(String.valueOf(usu));
                        break;
                    case "Yen":
                        res = usu * 119.735001;
                        lblResultat.setText(String.valueOf(res));
                        break;
                    case "Libra":
                        res = usu * 0.858700;
                        lblResultat.setText(String.valueOf(res));
                        break;
                    case "Dólar":
                        res = usu * 1.101500;
                        lblResultat.setText(String.valueOf(res));
                        break;
                }
                break;
            case "Yen":
                switch(monResultat) {
                    case "Euro":
                        res = usu * 0.008352;
                        lblResultat.setText(String.valueOf(res));
                        break;
                    case "Yen":
                        lblResultat.setText(String.valueOf(usu));
                        break;
                    case "Libra":
                        res = usu * 0.007177;
                        lblResultat.setText(String.valueOf(res));
                        break;
                    case "Dólar":
                        res = usu * 0.009206;
                        lblResultat.setText(String.valueOf(res));
                        break;
                }
                break;
            case "Libra":
                switch(monResultat) {
                    case "Euro":
                        res = usu * 1.164500;
                        lblResultat.setText(String.valueOf(res));
                        break;
                    case "Yen":
                        res = usu * 139.437515;
                        lblResultat.setText(String.valueOf(res));
                        break;
                    case "Libra":
                        lblResultat.setText(String.valueOf(usu));
                        break;
                    case "Dólar":
                        res = usu * 1.283300;
                        lblResultat.setText(String.valueOf(res));
                        break;
                }
                break;
            case "Dólar":
                switch(monResultat) {
                    case "Euro":
                        res = usu * 0.907853;
                        lblResultat.setText(String.valueOf(res));
                        break;
                    case "Yen":
                        res = usu * 108.625000;
                        lblResultat.setText(String.valueOf(res));
                        break;
                    case "Libra":
                        res = usu * 0.779241;
                        lblResultat.setText(String.valueOf(res));
                        break;
                    case "Dólar":
                        lblResultat.setText(String.valueOf(usu));
                        break;
                }
                break;
        }
    }
}
