package com.example.pruebas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Ejercicio02 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.TextView);
        textView.setText("El programa más básico de Java con Android"
                    + "escribe un texto en la pantalla con setText.");
        textView.append("Así se añade más texto con el método append");
        textView.append("\nAsí se escribe una segunda línea");

    }
}
