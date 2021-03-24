package com.example.pruebas;

import android.os.Bundle;
import android.widget.TextView;

public class Ejercicio04 {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.TextView);
        int i = 125;
        double d = 12.3456789;
        textView.setText("Conversión de variables");
        textView.append("\nConversión de int a float a double");
        textView.append("\n i = " + i + "\n x = " + (float) i + "\nd = " + (double) i);
        textView.append("\n\nConversión de double a float a int");
        textView.append("\nd = " + d + "\nx = " + (float) d + "\ni = " + (int) d);
    }
}
