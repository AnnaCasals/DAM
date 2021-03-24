package com.example.Proves;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Exercici19 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.TextView);

        textView.setText("Variables y métodos final y/o static");
        textView.append("\nstatic aa = " + Abc.aa);
        textView.append("\nstatic final bb = " + Abc.bb);
        textView.append("\nstatic final cc = " + Abc.cc);
        Abc a = new Abc();
        textView.append("\nFunción static f(x) = " + a.calculo());
        for(int i = 1; i < 10; i++) {
            a.escribir(textView);
            a = new Abc();

        }
        textView.append("\nFuera del bucle");
        textView.append("\nVariable static aa = " + Abc.aa);
    }

}
class Abc {
    public static int aa = 0;
    public static final int bb = 555;
    public static final int cc = 777;
    public double x = 1.5;

    Abc() {
        aa++;
    }

    public void escribir(TextView tv) {
        tv.append("\nVariable static aa = " + aa);
    }

    public double calculo() {
        x = bb + cc * x;
        return x;
    }
}

