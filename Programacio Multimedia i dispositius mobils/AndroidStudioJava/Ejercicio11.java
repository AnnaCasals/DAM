package com.example.paquete1;

import android.os.Bundle;
import android.widget.TextView;

public class Ejercicio11 {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.TextView);
        textView.setText("Bucle while");
        int i = 0;
        double y = 0;
        while (i < 10) {
            y = sqrt(i);
            if (i == 5) {
                i++;
                continue;
            } else {
                textView.append("\n" + i + ". sqrt() = " + y);
                i++;
            }
        }
        textView.append("\nFin del bucle, i = " + i);
    }
}
