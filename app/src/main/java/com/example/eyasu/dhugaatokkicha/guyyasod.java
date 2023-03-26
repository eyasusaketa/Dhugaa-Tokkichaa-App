package com.example.eyasu.dhugaatokkicha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class guyyasod extends AppCompatActivity {
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guyyasod);
        textView=(TextView)findViewById(R.id.textView6);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("Milk 4:5 ‘’guyyaa sodaachisaan sun utuu hin dhufin ani eeliyaas raajicha isiniif nan erga’’ \n" +
                "1 Guyyaa sodaachisaa inni jedhu kun dhufa Yesuus?\n" +
                "2 Eeliyaas immoo Yesus dura deebi'ee dhufaa?\n" +
                "Dhufaatiin Kiristoos 2ffaan taatee lama qaba inni duraa Butamuu Waldaa kiristiyaanaati kun qilleensa keessatti kan simatamuudha.1tas4:15-18,1Qor15:51-55,\n" +
                "Taatee 2ffaan ammoo isa inni Qaamaan lafa irratti mul'atuudha,yommus Qulqulloonni waliin ni dhufu miilli isaas tulluu ejersaa irra ni dhaabbata.Zakk 14:4,Mul19:11-14 inni kun Guyyaa sodaachisaa jedhamee beekama!!\n" +
                "Waa'ee Eliyaas ammoo Qaamaan Eliyaas dhufaa osoo hin taane tajaajila Eliyas kan qabu ni ka'aadha fkn mat17:11--Eliyas kanumaan dura dhufeera kan jedhu Yohannis Cuuphaa ture.mul11 keessatti immoo musee fi Eliyaas kan jedhu seerrii fi Raajiin Isra'el gidduutti akka deebi'ee hojiirra oolu bara dhiphina waggaa torbaa keessa  namootni lama akka ka'aniidha.booda Kiristoos Qaamaan ni dhufa!!\n");
    }
}
