package com.example.eyasu.dhugaatokkicha;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public  class MainActivity extends AppCompatActivity {
    GridView grid;
    String[] web = {
            "Seensa",
            "Gaaffiif deebii Macaafa Qulqulluu",
            "Utubaalee Haara'umsaa protestaantii"};
    int[] imageId = {
            R.drawable.sensa,
            R.drawable.i,
            R.drawable.bible};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CustomGrid adapter = new CustomGrid(MainActivity.this, web, imageId);
        grid = (GridView) findViewById(R.id.grid);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                //  Toast.makeText(MainActivity.this, "You Clicked at " +web[+ position], Toast.LENGTH_SHORT).show();
                String click = web[+position];
                switch (click) {
                    case "Seensa":
                        Intent sh = new Intent(MainActivity.this, sensa.class);
                        startActivity(sh);
                        break;
                    case "Gaaffiif deebii Macaafa Qulqulluu":
                        Intent sha = new Intent(MainActivity.this, gaffii.class);
                        startActivity(sha);
                        break;
                    case "Utubaalee Haara'umsaa protestaantii":
                        Intent shan = new Intent(MainActivity.this, Protes.class);
                        startActivity(shan);
                        break;

                }

            }
        });

    }
}