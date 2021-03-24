package com.example.pruebas;

import android.os.Bundle;
import android.widget.TextView;

public class Exercici16 {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.TextView);

        textView.setText("Clase que contiene tres datos numéricos: ");
        textView.append("\nSe accede a las variables de clase mediante el nombre del objeto " +
            "seguido de un punto y uno de los métodos get()");
        Dato miDato = new Dato();
        textView.append("\nmiDato.i = " + miDato.i);
        textView.append("\nmiDato.f = " + miDato.f);
        textView.append("\nmiDato.d = " + miDato.d);

        textView.append("\nmiDato.getI() = " + miDato.getI());
        textView.append("\nmiDato.getF() = " + miDato.getF());
        textView.append("\nmiDato.getD() = " + miDato.getD());

        textView.append("\n\nDespués de modificar las variables con SET: ");
        miDato.setI(200);
        miDato.setF((float) 1.23456);
        miDato.setD(1.111e-24);
        textView.append("\nmiDato.getI() = " + miDato.getI());
        textView.append("\nmiDato.getF() = " + miDato.getF());
        textView.append("\nmiDato.getD() = " + miDato.getD());
    }
}

class Dato {
    int i;
    float f;
    double d;
    Dato() {
        i = 1;
        f = (float) 1.35;
        d = 2.3e2;
    }

    public int getI() { return i; }
    public float getF() { return f; }
    public double getD() { return d; }

    public void setI(int a) { i = a; }
    public void setF(float a) { f = a; }
    public void setD(double a) { d = a; }
}
