package com.example.pruebas;

import android.os.Bundle;
import android.widget.TextView;

public class Exercici13 {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.TextView);

        textView.setText("Método factorial");
        for(int i = 0; i < 20; i++) {
            textView.append("\n" + i + "! = " + factorial(i));
        }
    }

    public double factorial(int i) {
        int f = 1;
        if(i == 0) return f;
        for(int k = 1; k <= i; k++) {
            f = f * k;
        }
        return f;
    }
}

