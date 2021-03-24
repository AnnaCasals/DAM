package com.example.Proves;

import android.os.Bundle;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

import androidx.appcompat.app.AppCompatActivity;

public class Exercici22 extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.TextView);
        textView.setText("Decimal format");

        double x, y, z;
        DecimalFormat df1;
        x = 12345.6789;
        textView.append("\nSin formato x = " + x);
        df1 = new DecimalFormat("####.#");
        textView.append("\nUna cifra decimal: " + df1.format(x));
        df1 = new DecimalFormat("####.##");
        textView.append("\nDos cifras decimales: " + df1.format(x));
        df1 = new DecimalFormat("####.###");
        textView.append("\nTres cifras decimales: " + df1.format(x));

        df1 = new DecimalFormat("#,###.##");
        textView.append("\nAgrupar por miles: " + df1.format(x));

        DecimalFormatSymbols simbolos = new DecimalFormatSymbols();
        simbolos.setDecimalSeparator(',');
        df1 = new DecimalFormat("####.###", simbolos);
        textView.append("\n\nPunto decimal = ." + df1.format(x));

        y = 1.234;
        z = -1.234;
        textView.append("\n\nRellenar con ceros a derecha e izquierda: ");
        textView.append("\nsin formato y = " + y);
        textView.append("\nsin formato z = " + z);
        simbolos = new DecimalFormatSymbols();
        simbolos.setMinusSign('m');
        df1 = new DecimalFormat("00.0000", simbolos);
        textView.append("\n" + df1.format(y));
        textView.append("\n" + df1.format(z));

        textView.append("\n\nNotación científica");
        df1 = new DecimalFormat("0E0");
        textView.append("\n" + df1.format(y));
        df1 = new DecimalFormat("#.#E00");
        textView.append("\n" + df1.format(y));
        df1 = new DecimalFormat("00.00E00");
        textView.append("\n" + df1.format(y));
        df1 = new DecimalFormat(".00E0");
        textView.append("\n" + df1.format(y));


    }
}
