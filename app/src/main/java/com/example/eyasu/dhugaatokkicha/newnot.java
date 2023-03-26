package com.example.eyasu.dhugaatokkicha;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashSet;

public class newnot extends AppCompatActivity {
ListView listView;
static ArrayList<String>  list=new ArrayList<>();
static  ArrayAdapter adapter;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.add_note_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);
        if (item.getItemId()==R.id.add_note) {

            Intent intent = new Intent(getApplicationContext(), Noteediter.class);
            startActivity(intent);
            return true;
        }
        return false;


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newnot);
        listView=(ListView)findViewById(R.id.frist);
        SharedPreferences sharedPreferences=getApplicationContext().getSharedPreferences("com.example.eyasu.dhugaatokkicha", Context.MODE_PRIVATE);
       HashSet<String> set=(HashSet<String>) sharedPreferences.getStringSet("list",null);

        //Log.i("test", set.toString());
        if(set==null){


       }else{

           list=new ArrayList<>(set);
       }


         adapter=new ArrayAdapter(this,R.layout.notelatout,R.id.note,list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent=new Intent(getApplicationContext(),Noteediter.class);
                intent.putExtra("noteId",i);
                startActivity(intent);
            }
        });
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                final int itemdelete=i;
                new AlertDialog.Builder(newnot.this)
                        .setIcon(android.R.drawable.ic_dialog_alert)
                        .setTitle("Are you sure ?")
                        .setMessage("Balleessuu Barbaaddeetii ?")
                        .setPositiveButton("Eyyee", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                list.remove(itemdelete);
                                adapter.notifyDataSetChanged();
                                SharedPreferences sharedPreferences=getApplicationContext().getSharedPreferences("com.example.eyasu.dhugaatokkicha", Context.MODE_PRIVATE);
                                HashSet<String> set=new HashSet<>(newnot.list);
                                sharedPreferences.edit().putStringSet("list", set).apply();
                            }
                        })
                        .setNegativeButton("Lakki",null)

                        .show();
                return true;
            }
        });


    }
}
