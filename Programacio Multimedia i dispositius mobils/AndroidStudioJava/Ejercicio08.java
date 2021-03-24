package com.example.paquete1;

import android.os.Bundle;
import android.widget.TextView;

public class Ejercicio08 {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.TextView);
        textView.setText("Bloque if-else\n");
        double x = 2;
        double y = 3;
        boolean a, b;
        textView.append("\n" + x + " < " + y + "\n");
        textView.append("\nOperadores booleanos");
        if (x > 1) {
            a = x > 1;
            textView.append("\nCondición1 és = " + a);
        } else {
            textView.append("\nCondició1 no es cumpleix");
        }
        if (x < 5) {
            b = x < 5;
            textView.append("\nCondició2 és = " + b);
        } else {
            textView.append("\nCondició2 no es cumpleix");
        }
        textView.append("\nLes dos son simultàniament" + x + " > 1 y " + y + " < 10");
    }

}
