package com.example.eyasu.dhugaatokkicha;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class gaffii extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gaffii);

        listView=(ListView)findViewById(R.id.list);
        String[] gaffi={"Waa'ee hojii gaarii, amantii fi qajeelummaa ilaalchisee ?","Maariyaam haati Yesuus, Yesuus malee ijoollee biraa qabdii?","Gooftaan keenyi Yesuus Kiristoos har'a eessa jira fooniin moo hafuuraan jira ?","Mat 12:40 irra kan jiru Yesus Kiristoos jecha ofii isaatii hojiirra oolcheeraa?"
       ,"Guyyaan sanbataa isa kam ?","Erga karaa Kiristoos cubbuu irraa fayyinee deebinee waayee cubbuu kenyaaf kadhachuun hin barbachisuu?","Ragaan dhugummaa Macaafa Qulqulluu 66n maali?",
        "Cubbuun dhifama argate kami? Namni deebi’ee cubbuu hojjete hoo  maal jedhama?","123"};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.back,R.id.textView2,gaffi);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String itemValue=(String)listView.getItemAtPosition(position);
                switch (itemValue){
                    case"Cubbuun dhifama argate kami? Namni deebi’ee cubbuu hojjete hoo  maal jedhama?":
                        Intent shl81=new Intent(gaffii.this,dhifama.class);
                        startActivity(shl81);
                        break;
                    case "Erga karaa Kiristoos cubbuu irraa fayyinee deebinee waayee cubbuu kenyaaf kadhachuun hin barbachisuu?":
                        Intent shl8=new Intent(gaffii.this,cubburra.class);
                        startActivity(shl8);
                        break;
                    case "Waa'ee hojii gaarii, amantii fi qajeelummaa ilaalchisee ?":
                        Intent shl=new Intent(gaffii.this,hojiig.class);
                        startActivity(shl);
                        break;

                    case "guyyaa sodaachisaan sun utuu hin dhufin ani eeliyaas raajicha isiniif nan erga (Milk 4:5)?":
                        Intent sh8=new Intent(gaffii.this,guyyasod.class);
                        startActivity(sh8);
                        break;
                    case "Maariyaam haati Yesuus, Yesuus malee ijoollee biraa qabdii?":
                        Intent sh41=new Intent(gaffii.this,desse.class);
                        startActivity(sh41);
                        break;
                    case  "Ragaan dhugummaa Macaafa Qulqulluu 66n maali?":
                        Intent sh111=new Intent(gaffii.this,duef.class);
                        startActivity(sh111);
                        break;
                    case "Gooftaan keenyi Yesuus Kiristoos har'a eessa jira fooniin moo hafuuraan jira ?":
                        Intent s=new Intent(gaffii.this,essajira.class);
                        startActivity(s);
                        break;
                    case "Mat 12:40 irra kan jiru Yesus Kiristoos jecha ofii isaatii hojiirra oolcheeraa?":
                        Intent sa=new Intent(gaffii.this,hojigofta.class);
                        startActivity(sa);
                        break;
                    case "Guyyaan sanbataa isa kam ?":
                        Intent sa1=new Intent(gaffii.this,hojigofta.class);
                        startActivity(sa1);
                        break;
                    case "123":
                        Intent sa11=new Intent(gaffii.this,Main2Activity.class);
                        startActivity(sa11);
                        break;

                }

            }
        });



    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main9, menu);
        return true;
    }
}
