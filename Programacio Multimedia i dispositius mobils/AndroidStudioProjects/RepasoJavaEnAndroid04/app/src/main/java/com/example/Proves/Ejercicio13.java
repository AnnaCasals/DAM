package com.example.Proves;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import static java.lang.Math.sqrt;
import static java.lang.Math.subtractExact;

public class Ejercicio13 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.TextView);

        textView.setText("Ejemplo de arrays");
        int[][] array1 = {{0, 1},{10, 11},{20, 21}};
        double[][] array2 = {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}};
        double[][] array3 = {{0.0}, {10.0, 11.0}, {20.0, 21.0, 22.0}};
        double[][] array4 = {{1.0, 2.0}, {3.0, 4.0, 5.0}, {6.0}, {7.0, 8.0, 9.0, 0.0}};

        textView.append("\nArray1");
        textView.append("\nfilas = " + array1.length + ", columnas = " + array1[0].length);
        for (int i = 0; i < array1.length; i++) {
            textView.append("\nFila ");
            for (int j = 0; j < array1[i].length; j++) {
                textView.append(array1[i][j] + ", ");
            }
        }
        textView.append("\n\nArray2");
        textView.append("\nfilas = " + array2.length + ", columnas = " + array2[0].length);
        files(array2, textView);

        textView.append("\n\nArray3");
        files(array3, textView);

        textView.append("\n\narray4");
        files(array4, textView);
    }

    public void files(double[][] a, TextView tv) {
        for(int i = 0; i < a.length; i++) {
            tv.append("\nFila ");
            for (int j = 0; j < a[i].length; j++) {
                tv.append(a[i][j] + ", ");
            }
        }
    }
}