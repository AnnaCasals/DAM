package com.example.paquete1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import static java.lang.Math.sqrt;
import static java.lang.Math.subtractExact;

public class Ejercicio05 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.TextView);
        double x = 2.0;
        double y = 3.0;
        double z = 74.0;
        int i = 1;
        int j = 1;
        textView.setText("Operaciones aritméticas: \n\n");
        textView.append("\n" + x + " + " + y + " = " + (x + y));
        textView.append("\n" + x + " - " + y + " = " + (x - y));
        textView.append("\n" + x + " * " + y + " = " + (x * y));
        textView.append("\n" + x + " / " + y + " = " + (x / y) + "\n");
        textView.append("\n" + z + " / " + y + " da resto = " + (z % y) + "\n");
        i++;
        textView.append("\n I incrementado en uno = " + i);
        i--;
        textView.append("\n I decrementado en uno = " + i + "\n");
        textView.append("\n Operaciones con tipos distintos");
        textView.append("\n" + z + " + " + i + " = " + (double)(z + i));
        textView.append("\n" + z + " + " + i + " = " + (int)(z + i) + "\n");
        double a = (x *  (y + j) / (x * x + 1) - 1 / y) * (i - x) / y;
        textView.append("\n Resultado de la operación compuesta \n "
                + "z = " + a);






    }
}
