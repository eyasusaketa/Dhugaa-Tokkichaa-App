package com.example.eyasu.dhugaatokkicha;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.example.eyasu.dhugaatokkicha.adapter.Noteadapter;
import com.example.eyasu.dhugaatokkicha.model.Note;
import java.util.ArrayList;
import java.util.Date;
public class ajanda extends AppCompatActivity {
private RecyclerView recyclerView;
private ArrayList<Note>  notes;
private Noteadapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajanda);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        recyclerView=(RecyclerView)findViewById(R.id.rre);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        LoadNote();
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               onaddNewnote();
            }
        });
    }
    private void onaddNewnote()
    {


    }
    private void LoadNote()
    {
        this.notes=new ArrayList<>();
        for(int i=0;i<=12;i++)
        {


            notes.add(new Note("Dhugaa Tokkicha",new Date().getTime()));
        }
        adapter=new Noteadapter(this,notes);
        recyclerView.setAdapter(adapter);
       // adapter.notifyDataSetChanged();

    }
//public  boolean onCreateOptionmenu(Menu menu){}


    @Override
    protected void onResume()
    {
        super.onResume();
        LoadNote();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        return super.onOptionsItemSelected(item);
    }
}
