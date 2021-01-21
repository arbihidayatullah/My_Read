package com.myread.ProjectMyRead;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class PilihCerpen extends AppCompatActivity implements View.OnClickListener{
    private Button btnFabel;
    private Button btnLegenda;
    private Button btnJenaka;
    private Button btnPendidikan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilih_cerpen);

        btnFabel = (Button)findViewById(R.id.btn_fabel);
        btnFabel.setOnClickListener(this);

        btnLegenda = (Button)findViewById(R.id.btn_legenda);
        btnLegenda.setOnClickListener(this);

        //btnJenaka = (Button)findViewById(R.id.btn_jenaka);
        //btnJenaka.setOnClickListener(this);

        btnPendidikan = (Button)findViewById(R.id.btn_pendidikan);
        btnPendidikan.setOnClickListener(this);


    }
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_fabel:
                Intent moveFabel = new Intent(PilihCerpen.this, MenuFabel.class);
                startActivity(moveFabel);
                break;

            case R.id.btn_legenda:
                Intent moveLegenda = new Intent(PilihCerpen.this, MenuLegenda.class);
                startActivity(moveLegenda);
                break;

            //case R.id.btn_jenaka:
             //   Intent moveJenaka = new Intent(PilihCerpen.this, MenuJenaka.class);
              //  startActivity(moveJenaka);
             //   break;

            case R.id.btn_pendidikan:
                Intent movePendidikan = new Intent(PilihCerpen.this, MenuPendidikan.class);
                startActivity(movePendidikan);
                break;
        }
    }

}