package com.example.pruebas;

import android.os.Bundle;
import android.widget.TextView;

public class Exercici14 {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.TextView);

        textView.setText("Método void para imprimir");
        print(textView, 20);
    }

    public void print(TextView tx, int a) {
        for(int i = 0; i < a; i++) {
            tx.append("\nMétodo print "  + (i*i));
        }
    }
}
