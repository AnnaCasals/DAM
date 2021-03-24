package com.example.pruebas;

import android.os.Bundle;
import android.widget.TextView;

public class Exercici17 {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.TextView);

        textView.setText("Clase de números Complejos \n");

        Complejo c1 = new Complejo(1 , 1);
        Complejo c2 = new Complejo(2, 3);
        textView.append("\nc1 = " + c1.a + "+i" + c1.b);
        textView.append("\nc2 = " + c2.a + "+i" + c2.b + "\n");

        textView.append("\nc1 = " + c1.getA() + "+i" + c1.getB());
        textView.append("\nc2 = " + c2.getA() + "+i" + c2.getB() + "\n");

        textView.append("\nmodulo de c1 = " + c1.modulo());
        textView.append("\nmodulo de c2 = " + c2.modulo());
    }
}
class Complejo {
    double a;
    double b;

    Complejo(double q, double w) {
        a = q;
        b = w;
    }

    public double getA() { return a; }
    public double getB() { return b; }

    public double modulo() {
        return Math.sqrt(a * a + b * b);
    }
}