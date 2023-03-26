package com.example.eyasu.dhugaatokkicha;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.github.clans.fab.FloatingActionMenu;

public class Main9Activity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    GridView grid;
    String[] web = {
            "Seensa",
            "Gaaffii fi deebii Macaafa Qulqulluu",
            "Utubaalee Haara'umsaa protestaantii",

    };
    int[] imageId = {
            R.drawable.sensa,
            R.drawable.gd,
            R.drawable.soli,
    };
    FloatingActionMenu fam1;
    FloatingActionButton wangela,telegram,note;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        fam1=(FloatingActionMenu)findViewById(R.id.fab_menu);
        //wangela=(FloatingActionButton)findViewById(R.id.fab1);
        //telegram=(FloatingActionButton)findViewById(R.id.fab2);
        //note=(FloatingActionButton)findViewById(R.id.fab3);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        CustomGrid adapter = new CustomGrid(Main9Activity.this, web, imageId);
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
                        Intent sh = new Intent(Main9Activity.this, sensa.class);
                        startActivity(sh);
                        break;
                    case "Gaaffii fi dee0bii Macaafa Qulqulluu":
                        Intent sha = new Intent(Main9Activity.this, gaffii.class);
                        startActivity(sha);
                        break;

                    case "Utubaalee Haara'umsaa protestaantii":
                        Intent shan1 = new Intent(Main9Activity.this, sola.class);
                        startActivity(shan1);
                        break;


                }
            }
        });
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main9, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Toast.makeText(this,"Ganaadha,",Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            Intent intent=new Intent(Main9Activity.this,newnot.class);
            startActivity(intent);
        } else if (id == R.id.nav_gallery){
            try{
             //   Intent i=getPackageManager().getLaunchIntentForPackage("com.nippt.oromo.bible");
           // startActivity(i);
            }
            catch (Exception e){

                Toast.makeText(this," Dhiifama Applicationi macaafa Qulqulluu hin qabdan",Toast.LENGTH_SHORT).show();

            }
            finally{

            }

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://t.me/Kiristosdhugicha/9450"));
            startActivity(intent);
        } else if (id == R.id.nav_send) {
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
