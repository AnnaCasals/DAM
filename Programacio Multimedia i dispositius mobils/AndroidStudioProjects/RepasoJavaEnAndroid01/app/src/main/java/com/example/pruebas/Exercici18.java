package com.example.pruebas;

import android.os.Bundle;
import android.widget.TextView;

public class Exercici18 {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.TextView);

        textView.setText("Ejemplo de una subclase");
        textView.append("\nLa clase Complejo2 extiende la clase Complejo definiendo" +
                "métodos para la suma y producto de números complejos");
        Complejo2 c1 = new Complejo2(1 , 1);
        Complejo2 c2 = new Complejo2(2, 3);
        textView.append("\nc1 = " + c1.getA() + "+i" + c1.getB());
        textView.append("\nc2 = " + c2.getA() + "+i" + c2.getB());

        Complejo c3 = c1.suma(c2);
        textView.append("\nsuma = " + c3.getA() + "+i" + c3.getB());

        c3 = c1.producto(c2);
        textView.append("\nproducto = " + c3.getA() + "+i" + c3.getB());

        c3 = c1.inv();
        textView.append("\n1/c1 = " + c3.getA() + "+i" + c3.getB());

        c3 = c2.inv();
        textView.append("\n1/c2 = " + c3.getA() + "+i" + c3.getB());

        c3 = c1.producto(c1.inv());
        textView.append("\nc1/c1 = " + c3.getA() + "+i" + c3.getB());

        c3 = c2.producto(c2.inv());
        textView.append("\nc2/c2 = " + c3.getA() + "+i" + c3.getB());
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

class Complejo2 extends Complejo {

    Complejo2(double q, double w) {
        super(q, w);
    }

    public Complejo suma(Complejo c2) {
        Complejo c = new Complejo(this.getA() + c2.getA(), this.getB() + c2.getB());
        return c;
    }

    public Complejo producto(Complejo c2) {
        Complejo c = new Complejo((this.getA() * c2.getA() - this.getB() * c2.getB()), (this.getA()*c2.getB() + this.getB() * c2.getA()));
        return c;
    }

    public Complejo inv() {
        double z = this.getA() / (this.getA() * this.getA() + this.getB() * this.getB());
        double x = this.getB() / (this.getA() * this.getA() + this.getB() * this.getB());
        Complejo c = new Complejo(z, -x);
        return c;
    }
}
}
