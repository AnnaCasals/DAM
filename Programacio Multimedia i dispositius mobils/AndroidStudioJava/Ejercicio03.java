package com.example.pruebas;

import android.os.Bundle;
import android.widget.TextView;

public class Ejercicio03 {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.TextView);
        int i = 123;
        double x = 0.5123;
        double y = 1.0;
        double a = 123.0;
        double b = 3.1416E-10;
        char caracter = 'a';
        boolean esFalso = true;
        String cadena = "Esto es una cadena";
        textView.setText("Declaración e inicialización de variables: ");
        textView.append("\ni = " + i);
        textView.append("\nx = " + x + ", y = " + y);
        textView.append("\na = " + a + ", b = " + b);
        textView.append("\ncaracter = " + caracter);
        textView.append("\nesFalso = " + esFalso);
        textView.append("\ncadena = " + cadena);
    }
}
