package com.example.taller_listv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView lista_opciones;
    private String opcion[];

    private ArrayAdapter<String>adapter;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista_opciones= findViewById(R.id.lstOpciones);
        opcion= getResources().getStringArray(R.array.opcion);

        adapter= new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, opcion);
        lista_opciones.setAdapter(adapter);

        lista_opciones.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        intent= new Intent(MainActivity.this,Areas.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent= new Intent(MainActivity.this,Volumenes.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent= new Intent(MainActivity.this,Operaciones.class);
                        startActivity(intent);
                        break;
                }
            }
        });
    }
}