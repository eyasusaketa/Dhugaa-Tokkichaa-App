package com.example.eyasu.dhugaatokkicha;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import java.io.IOException;
import java.io.InputStream;

public class Main2Activity extends AppCompatActivity {
EditText editText;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        String text="";
        editText=(EditText)findViewById(R.id.textView2);
        try {
            InputStream  ass=getAssets().open("");
            int size=ass.available();

            byte[] buffer=new byte[size];
            ass.read(buffer);
            ass.close();
            text=new String(buffer);

        } catch (IOException e) {
            e.printStackTrace();
        }
editText.setText(text);

    }
}
