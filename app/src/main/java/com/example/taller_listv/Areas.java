package com.example.taller_listv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Areas extends AppCompatActivity {
    private ListView lista_area;
    private String area[];

    private ArrayAdapter<String>adapter;
    private Intent intent;

    public Areas(ListView lista_area) {
        this.lista_area = lista_area;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_areas);

        lista_area= findViewById(R.id.lstArea);
        area= getResources().getStringArray(R.array.area);

        adapter= new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, area);
        lista_area.setAdapter(adapter);
        lista_area.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        intent= new Intent(Areas.this,Calcular.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent= new Intent(Areas.this,CalcularR.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent= new Intent(Areas.this,CalcularT.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent= new Intent(Areas.this,CalcularC.class);
                        startActivity(intent);
                        break;

                }
            }
        });
    }
}