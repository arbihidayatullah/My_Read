package com.myread.ProjectMyRead;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MenuJenaka extends AppCompatActivity {

    private JenakaAdapter adapter;
    private String[] dataNamej;
    private String[] dataDescriptionj;
    private TypedArray dataPhotoj;
    private ArrayList<Jenaka> jenakas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_jenaka);

        ListView listView = findViewById(R.id.lv_listjenaka);
        adapter = new JenakaAdapter(this);
        listView.setAdapter(adapter);

        prepare();
        addItem();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                Toast.makeText(MenuJenaka.this, jenakas.get(i).getNamej(), Toast.LENGTH_SHORT).show();
            }
        });
    }
    private  void  prepare() {
        dataNamej = getResources().getStringArray(R.array.data_namejenaka);
        dataDescriptionj = getResources().getStringArray(R.array.data_descriptionjenaka);
        dataPhotoj = getResources().obtainTypedArray(R.array.data_photojenaka);
    }
    private  void addItem() {
        jenakas = new ArrayList<>();
        for (int i = 0; i < dataNamej.length; i++) {
            Jenaka jenaka = new Jenaka();
            jenaka.setPhotoj(dataPhotoj.getResourceId(i, -1));
            jenaka.setNamej(dataNamej[i]);
            jenaka.setDescriptionj(dataDescriptionj[i]);
            jenakas.add(jenaka);
        }
        adapter.setJenakas(jenakas);
    }
}