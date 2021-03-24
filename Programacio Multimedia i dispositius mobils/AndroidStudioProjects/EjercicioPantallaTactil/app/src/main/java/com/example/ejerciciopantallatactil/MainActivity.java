package com.example.ejerciciopantallatactil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView entrada = findViewById(R.id.TextViewEntrada);
        entrada.setOnTouchListener(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onTouch(View vista, MotionEvent evento) {
        TextView salida = findViewById(R.id.TextViewSalida);
        // salida.append(evento.toString()+"\n");
        String acciones[] = { "ACTION_DOWN", "ACTION_UP", "ACTION_MOVE", "ACTION_CANCEL",
                "ACTION_OUTSIDE", "ACTION_POINTER_DOWN", "ACTION_POINTER_UP" };
        int accion = evento.getAction();
        int codigoAccion = accion & MotionEvent.ACTION_MASK;
        salida.append(acciones[codigoAccion]);
        for (int i = 0; i < evento.getPointerCount(); i++) {
            salida.append(" puntero:" + evento.getPointerId(i) +
                    " x:" + evento.getX(i) + " y:" + evento.getY(i));
        }
        salida.append("\n");

        return true;
    }
}
