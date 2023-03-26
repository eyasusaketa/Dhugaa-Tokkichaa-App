package com.example.eyasu.dhugaatokkicha;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import java.util.HashSet;

public class Noteediter extends AppCompatActivity {
EditText editText;
int nodeId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noteediter);
        editText=(EditText)findViewById(R.id.editText);
        Intent intent=getIntent();
        nodeId=intent.getIntExtra("noteId",-1);
        if(nodeId!=-1)
        {
            editText.setText(newnot.list.get(nodeId));

        }else
            {
                newnot.list.add("");
                nodeId=newnot.list.size()-1;
                newnot.adapter.notifyDataSetChanged();


            }

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

             @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                newnot.list.set(nodeId,String.valueOf(charSequence));
                newnot.adapter.notifyDataSetChanged();
                SharedPreferences sharedPreferences=getApplicationContext().getSharedPreferences("com.example.eyasu.dhugaatokkicha", Context.MODE_PRIVATE);
               HashSet<String> set=new HashSet<>(newnot.list);
               sharedPreferences.edit().putStringSet("list", set).apply();


            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });


    }
}
