package com.example.Proves;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Exercici20 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.TextView);

        textView.setText("Ejemplo de arrays");
        int[] array1 = new int[3];
        textView.append("\nLongitud del array = " + array1.length);
        for(int i = 0; i < array1.length; i++) {
            textView.append("\ni = " + i);
            textView.append("\narray1[i] = " + array1[i]);
            switch (i) {
                case 0: array1[i] = 1; break;
                case 1: array1[i] = 2; break;
                case 2: array1[i] = 5; break;
            }
            textView.append("\nValor después = " + array1[i]);
        }

        int[] array2 = {0, 1, 2, 3};
        textView.append("\narray2[] = ");
        for(int j = 0; j < array2.length; j++) {
            textView.append(array2[j] + ", ");
        }
        textView.append("\nsuma = " + suma(array2));
    }
    public double suma(int[] a) {
        double b = 0;
        for(int i = 0; i < a.length; i++) {
            b += a[i];
        }
        return b;
    }
}
