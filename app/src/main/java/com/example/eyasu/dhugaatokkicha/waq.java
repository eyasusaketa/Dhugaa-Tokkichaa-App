package com.example.eyasu.dhugaatokkicha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class waq extends AppCompatActivity {
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waq);
        textView=(TextView)findViewById(R.id.textView8);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("Kana jechuu Amala eenyummaa waaqummaa agarsiisuun fkn barabaraa hamma barabaraattijiraachuu,Hunda danda'uu, Hunda beekuu ,Iddoo hundatti yeroo tokkicha argamuu fi kkf. Kun essence jedhama.fkn Namni Amala namaa kanneen keessoo kan akka Gene agarsiisuun tokko.\n" +
                "Waaqayyo Eenyummaa(person) Sadiidha. Kunis Waaqayyo Abbaa, Waaqayyo Ilma, Waaqayyo Hafuura Qulqulluu dha. Sadanummaa-Tokkummaa jedhama. Macaafni Qulqulluun Kakuu moofaatti bifa dhokataan, Kakuu Haaraatti ammoo mul’inaan barsiisa. Um 1:26-27, 3:22-24, 11:7 Kottaa,Nu jechuun plural fayyadama \n" +
                "Elohim Maqaa danooma agarsiisuudha. Mat28:19.\n");
    }
}
