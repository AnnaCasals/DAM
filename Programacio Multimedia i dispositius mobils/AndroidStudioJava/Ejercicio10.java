package com.example.paquete1;

import android.os.Bundle;
import android.widget.TextView;

public class Ejercicio10 {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.TextView);
        textView.setText("Bucle while");
        int i = 0;
        double y = 0;
        while (i < 10) {
            y = Math.random();
            textView.append("\n" + i + ".random() = " + y);
            i++;
        }
        textView.append("\nFin del bucle while, i = " + i);
    }
}
