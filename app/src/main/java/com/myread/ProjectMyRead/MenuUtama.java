package com.myread.ProjectMyRead;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuUtama extends AppCompatActivity implements View.OnClickListener{

    private Button btnNovel;
    private Button btnCerpen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);

        btnNovel = (Button)findViewById(R.id.btn_novel);
        btnNovel.setOnClickListener(this);
        btnCerpen = (Button)findViewById(R.id.btn_cerpen);
        btnCerpen.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_cerpen:
                Intent moveCerpen = new Intent(MenuUtama.this, PilihCerpen.class);
                startActivity(moveCerpen);
                break;

            case R.id.btn_novel:
                Intent moveNovel = new Intent(MenuUtama.this, PilihNovel.class);
                startActivity(moveNovel);
                break;
        }
    }

}