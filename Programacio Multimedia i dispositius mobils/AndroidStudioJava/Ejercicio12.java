package com.example.paquete1;

import android.os.Bundle;
import android.widget.TextView;

public class Ejercicio12 {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.TextView);
        textView.setText("Bucle switch");
        int i;
        for (i = 0; i < 20; i++) {
            switch (i) {
                case 5:
                    textView.append("\npasa por " + i);
                    break;
                case 10:
                    textView.append("\npasa por " + i);
                    break;
                case 15:
                    textView.append("\npasa por " + i);
                    break;
                default:
                    textView.append("\ni = " + i);
            }
        }
    }
}
