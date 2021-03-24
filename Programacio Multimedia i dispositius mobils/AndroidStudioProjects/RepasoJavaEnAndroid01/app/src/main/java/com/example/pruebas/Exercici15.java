package com.example.pruebas;

import android.os.Bundle;
import android.widget.TextView;

public class Exercici15 {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.TextView);

        textView.setText("Clase que contiene tres datos numéricos");
        textView.append("\nSe accede a las variables de la clase mediante el nombre del" +
            "objeto seguido de un puntto y el nombre de la variable");
        Dato miDato = new Dato();
        textView.append("\nmiDato.i = " + miDato.i);
        textView.append("\nmiDato.f = " + miDato.f);
        textView.append("\nmiDato.d = " + miDato.d);
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
}

