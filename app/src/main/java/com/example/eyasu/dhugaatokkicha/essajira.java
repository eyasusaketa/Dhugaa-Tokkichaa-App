package com.example.eyasu.dhugaatokkicha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class essajira extends AppCompatActivity {
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_essajira);
        textView=(TextView)findViewById(R.id.textView9);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("2ffaa Kiristoos dhaqna du'aa ka'uun (resurrection body) du'aa ka'e \n" +
                "Dhaqni du'aa ka'uu amala addaa agarsiisa. Dhaqna hafuuraa jedhama.\n" +
                "Kiristoos Kafana achitti dhiisee Dhagaas osoo gala hin galchin ka'e \n" +
                "Mat28:1-10,Marq16:1----,\n" +
                "Isoo balbala hin banin du'aa ka'uu booda manatti ol seenee bartootaan nagaan isiniif haa tahu jedhe. Harkisa dachee malee Ol butamuun saminis saaqamee isa simate. Dhaqnuma kanaan Mirga Waaqayyoo taa'ee jira \n" +
                "Nuti Qulqulloonni Gooftaas dhaqna ulfinaa kana uffachuuf jirra .Filp3:21,  1Qor15: 35-50. \n" +
                "Dhaqni kun dhaqna ulfinaa jedhama. Gadi hin dhumu hin dadhabu, hin dulloomu,hin du'u, hin beela'u garuu yoo barbaachise ni nyaata!!etc\n");
    }
}
