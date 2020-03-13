package com.example.parcial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button verde;
    private Button rojo;
    private Button amari;
    private EditText editX;
    private EditText editY;
    private Button vista;
    private Button confirmar;
    private EditText recordar;

    private boolean verdes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ComunicacionTCP comm = new ComunicacionTCP(this);

        comm.solicitarConexion();


        verde = findViewById(R.id.verde);
        rojo = findViewById(R.id.rojo);
        amari = findViewById(R.id.amari);
        editX = findViewById(R.id.editX);
        editY = findViewById(R.id.editY);
        vista = findViewById(R.id.vista);
        confirmar = findViewById(R.id.confirmar);
        recordar = findViewById(R.id.recordar);
        verdes=false;

        verde.setOnClickListener(
                (v)->{
                    verdes=true;
                    comm.mandarMensaje("VERDE");
                }
        );

        amari.setOnClickListener(
                (v)->{
                    amari.setText("AMARILLO");
                    comm.mandarMensaje("AMARILLO");
                }
        );

        rojo.setOnClickListener(
                (v)->{
                    rojo.setText("ROJO");
                    comm.mandarMensaje("ROJO");
                }
        );







    }
}
