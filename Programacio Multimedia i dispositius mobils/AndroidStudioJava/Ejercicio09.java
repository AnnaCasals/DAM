package com.example.paquete1;

import android.os.Bundle;
import android.widget.TextView;

public class Ejercicio09 {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.TextView);
        textView.setText("Bucle for");
        double x = 10, y = 0;
        for (int i = 0; i < x; i++) {
            y = Math.sin(i / x);
            textView.append("\n" + i + ".sin(i / x) = " + y);
        }
        textView.append("\nFin del bucle for, i no está definida \n y = " + y);
    }
}
