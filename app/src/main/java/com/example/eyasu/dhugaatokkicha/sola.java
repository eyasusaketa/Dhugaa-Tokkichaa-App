package com.example.eyasu.dhugaatokkicha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Switch;

public class sola extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sola);

        String sola[]={"MACAAFA QULQULLUU QOFA ( SOLA SCRIPTURA)- SCRIPTURE ALONE","AYYAANA WAAQAYYOO QOFA (GRACE ALONE)-SOLA GRACIA"," AMANTII QOFA (FAITH ALONE)- SOLA FIDE","KIRISTOOS QOFA (CHRIST ALONE)- SOLA CHRISTUS"," ULFINA WAAQAYYOOTIIF QOFA (FOR THE GLORY OF GOD ALONE) - SOLA DEO GLORIA"};
        final ListView listView=(ListView)findViewById(R.id.list);
        ArrayAdapter adapter=new ArrayAdapter(this,R.layout.let,R.id.textView10,sola);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String step=(String)listView.getItemAtPosition(i);
                switch(step) {
                    case "MACAAFA QULQULLUU QOFA ( SOLA SCRIPTURA)- SCRIPTURE ALONE":
                        Intent shl81 = new Intent(sola.this,Protes.class);
                        startActivity(shl81);
                        break;
                    case "AYYAANA WAAQAYYOO QOFA (GRACE ALONE)-SOLA GRACIA":
                        Intent shl1 = new Intent(sola.this,solafrst.class);
                        startActivity(shl1);
                        break;
                    case " AMANTII QOFA (FAITH ALONE)- SOLA FIDE":
                        Intent shl = new Intent(sola.this,solasnd.class);
                        startActivity(shl);
                        break;

                    case  "KIRISTOOS QOFA (CHRIST ALONE)- SOLA CHRISTUS":
                        Intent shl2 = new Intent(sola.this,solasrd.class);
                        startActivity(shl2);
                        break;
                    case  " ULFINA WAAQAYYOOTIIF QOFA (FOR THE GLORY OF GOD ALONE) - SOLA DEO GLORIA":
                        Intent sl = new Intent(sola.this,Main3Activity.class);
                        startActivity(sl);
                        break;
                }
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main9, menu);
        return true;
    }
}
