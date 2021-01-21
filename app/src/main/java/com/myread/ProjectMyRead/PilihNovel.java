package com.myread.ProjectMyRead;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PilihNovel extends AppCompatActivity implements View.OnClickListener {
    private Button btnRomance;
    private Button btnHorror;
    private Button btnComedy;
    private Button btnAventurer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilih_novel);

        btnRomance = (Button)findViewById(R.id.btn_romance);
        btnRomance.setOnClickListener(this);

        btnHorror = (Button)findViewById(R.id.btn_Horror);
        btnHorror.setOnClickListener(this);

        //btnComedy = (Button)findViewById(R.id.btn_comedy);
        //btnComedy.setOnClickListener(this);

        btnAventurer = (Button)findViewById(R.id.btn_adventure);
        btnAventurer.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_romance:
                Intent moveNovel = new Intent(PilihNovel.this, MenuRomance.class);
                startActivity(moveNovel);
                break;

            case R.id.btn_Horror:
                Intent moveHorror = new Intent(PilihNovel.this, MenuHorror.class);
                startActivity(moveHorror);
                break;

            //case R.id.btn_comedy:
              //  Intent moveComedy = new Intent(PilihNovel.this, MenuComedy.class);
              //  startActivity(moveComedy);
             //   break;

            case R.id.btn_adventure:
                Intent moveAdventure = new Intent(PilihNovel.this, MenuAdventure.class);
                startActivity(moveAdventure);
                break;
        }
    }
}