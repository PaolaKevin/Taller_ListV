package com.example.taller_listv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView opciones;
    private ListView areas;
    private ListView volumenes;

    public MainActivity(ListView opciones) {
        this.opciones = opciones;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}