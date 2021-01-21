package com.myread.ProjectMyRead;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MenuComedy extends AppCompatActivity {

    private ComedyAdapter adapter;
    private String[] dataNamec;
    private String[] dataDescriptionc;
    private TypedArray dataPhotoc;
    private ArrayList<Comedy> comedys;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_comedy);
        ListView listView = findViewById(R.id.lv_listcomedy);

        adapter = new ComedyAdapter(this);
        listView.setAdapter(adapter);

        prepare();
        addItem();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                Toast.makeText(MenuComedy.this, comedys.get(i).getNamec(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    private  void  prepare() {
        dataNamec = getResources().getStringArray(R.array.data_namecomedy);
        dataDescriptionc = getResources().getStringArray(R.array.data_descriptioncomedy);
        dataPhotoc = getResources().obtainTypedArray(R.array.data_photocomedy);
    }
    private  void addItem() {
        comedys = new ArrayList<>();
        for (int i = 0; i < dataNamec.length; i++) {
            Comedy comedy = new Comedy();
            comedy.setPhotoc(dataPhotoc.getResourceId(i, -1));
            comedy.setNamec(dataNamec[i]);
            comedy.setDescriptionc(dataDescriptionc[i]);
            comedys.add(comedy);
        }
        adapter.setComedy(comedys);
    }


}