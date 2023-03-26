package com.example.eyasu.dhugaatokkicha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class selectactiviy extends AppCompatActivity {
Button offline,online;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selectactiviy);
    offline=(Button)findViewById(R.id.offline);
        online=(Button)findViewById(R.id.online);
    offline.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent offline=new Intent(selectactiviy.this,Main9Activity.class);
            startActivity(offline);
        }
    });
        online.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent online=new Intent(selectactiviy.this,Main4Activity.class);
                startActivity(online);
            }
        });
    }
}
