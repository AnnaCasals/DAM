package com.example.paquete1;

import android.os.Bundle;
import android.widget.TextView;

public class Ejercicio07 {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.TextView);
        textView.setText("Números aleatorios y métodos de redondeo \n"
                + "Un número aleatorio entre 0 y 2");
        double x = Math.random() * 2;
        textView.append("\nx = " + x);
        textView.append("\nceil(x) = " + Math.ceil(x));
        textView.append("\nfloor(x) = " + Math.floor(x));
        textView.append("\nround(x) = " + Math.round(x) + "\n");
        textView.append("\nRedondeos hasta cualquier cifra decimal");
        textView.append("\nredondeo a la segunda cifra " + Math.round(x * Math.pow(10, 2)) / Math.pow(10, 2));
        textView.append("\nredondeo a la tercera cifra " + Math.round(x * Math.pow(10, 3)) / Math.pow(10, 3));
        textView.append("\nredondeo a la cuarta cifra " + Math.round(x * Math.pow(10, 4)) / Math.pow(10, 4));
        textView.append("\nredondeo a la quinta cifra " + Math.round(x * Math.pow(10, 5)) / Math.pow(10, 5));
    }

}
