package com.example.paquete1;

import android.os.Bundle;
import android.widget.TextView;

public class Ejercicio06 {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.TextView);

        double x = Math.PI;
        double y = -1.0;

        textView.setText("x = PI = " + x + "\n y = " + y);
        textView.append("\nValor absoluto de y = " + Math.abs(y));
        textView.append("\nRaiz cuadr. de x = " + Math.sqrt(x));
        textView.append("\nLogaritmo de x = " + Math.log(x));
        textView.append("\nExponencial(x) = " + Math.exp(x));
        textView.append("\nx al cubo = " + Math.pow(x, 3));
        textView.append("\nCoseno de x = " + Math.cos(x));
        textView.append("\nSeno de x = " + Math.sin(x));
        textView.append("\nTangente(x) = " + Math.tan(x));
        textView.append("\nArcocoseno(y) = " + Math.acos(y));
        textView.append("\n Arcoseno(y) = " + Math.asin(y));
        textView.append("\nArcotangente(y) = " + Math.atan(y));
        textView.append("\nMáximo de x e y = " + Math.max(x, y));
        textView.append("\nEl resto de entre x entre y es = " + (x % y));
        textView.append("\nExpresado en grados x = " + Math.toDegrees(x));
        textView.append("\nExpresado en radianes y = " + Math.toRadians(y));
    }

}
