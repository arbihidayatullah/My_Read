package com.myread.ProjectMyRead;

//import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;

public class MainActivity extends Activity {

    //private Button btnMasukMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread thread = new Thread(){
            public void run(){
                try{
                    sleep(3000); // set Waktu Pending selama 2 detik
                }catch(InterruptedException ex){
                    ex.printStackTrace();
                }finally {
                    startActivity(new Intent(MainActivity.this, MenuUtama.class));
                    finish(); // Menutup Activity
                }
            }
        };
        thread.start();
    }


        //btnMasukMenu = (Button)findViewById(R.id.btn_masuk_menu);
        //btnMasukMenu.setOnClickListener(this);

   // }
   /* public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_masuk_menu:
                Intent moveMenu = new Intent(MainActivity.this, MenuUtama.class);
                startActivity(moveMenu);
            break;
        }
    }

    */

}