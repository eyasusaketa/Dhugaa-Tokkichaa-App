package com.example.eyasu.dhugaatokkicha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class hojiig extends AppCompatActivity {
    final static float STEP = 200;
    float mRatio = 1.0f;
    int mBaseDist;
    float mBaseRatio;
    float fontsize = 13;

    public boolean onTouchEvent(MotionEvent event) {
        if (event.getPointerCount() == 2) {
            int action = event.getAction();
            int pureaction = action & MotionEvent.ACTION_MASK;
            if (pureaction == MotionEvent.ACTION_POINTER_DOWN) {
                mBaseDist = getDistance(event);
                mBaseRatio = mRatio;
            } else {
                float delta = (getDistance(event) - mBaseDist) / STEP;
                float multi = (float) Math.pow(2, delta);
                mRatio = Math.min(1024.0f, Math.max(0.1f, mBaseRatio * multi));
                textView.setTextSize(mRatio + 13);
            }
        }
        return true;
    }

    int getDistance(MotionEvent event) {
        int dx = (int) (event.getX(0) - event.getX(1));
        int dy = (int) (event.getY(0) - event.getY(1));
        return (int) (Math.sqrt(dx * dx + dy * dy));
    }

    public boolean onTouch(View v, MotionEvent event) {
        return false;
    }
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hojiig);
        textView=(TextView)findViewById(R.id.textView4);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText(
                "Amantii Qofaan Qajeelaa ta'uun Hojii gaariin ammoo Qajeelummaa ofii mul'isu!!\n" +
                "Foormulaa Phaawulos fayyadame: Amantii -Hojii gaarii =Qajeelummaa. Yaa'iqoob ammoo isuma kana karaa biraa yoo fayyadamu, Amantiin = Qajeelummaa +Hojii gaariiti jedha. Lachuu bu'uura tokko qabu. Macaafni Qulqulluun wal tumsa malee kan wal dhiitu miti. Yaq2:24 amantii qofaan hin fayyinu jechuun barsiisaa hin jiru. Garuu amantiin fayyisu hojii gaariin mul’achuu qabaadha. \n" +
                "Jechi ‘’By works a man is justified’’ jedhu (Yaq2:24) fi ‘’Rightenousness without works’’ Rom 4:6 jedhu kana yoo ilaalle namni hojii gaarii ofii isaan qajeelaa ta’a Yaq2:24 fi hojii gaarii osoo hin qabaatin qajeelaa ta’a Rom4:6 waan jedhu fakkaata.Kun ammoo waldhiita Garuu jechi ‘’justified’’ jedhu hiika hedduu qaba isaan keessaa:\n" +
                "1 Qajeelaa taasisuu\n" +
                "2 Qajeelummaa Labsuu.\n" +
                "Fakkeenyaaf, Luq7:35 ‘Wisdom is justified of all her children’ jedha. Luq7:29 ammoo ‘they justified God jedha, kun immoo utuu kallattumaan hiika tokkichaan hiikama ta'ee, Isaan Waaqayyoon qajeelaa taasisan jechuu ta’a, kun immo gonkumaa hin dandaa’amu. Kanaafuu qajeelaa ta’uu Waaqayyoo labsan jechuudha. Haaluma kanaan Yaa’iqob namni amantii qofaan fuula Waaqayyootti qajeelaa ta’e hojii gaariin ammo qajeelummaa isaa mul’isuu qaba jechuun barsiisa. Kanas Abirahaamii fi Rahaabiin fakkeenya fudhachuun barsiisa.Abirahaam Yihuudota bakka bu’a.Rahaab ammoo Ormoota bakka buuti. Kunis Abirahaam Uma15:6 irratti amantii qofaan qajeelaa; ta’ee Uma22 irratti qajeelummaa isaa immoo ilma tokkicha aarsaa gochuu isaan qajeelummaa isaa mul’iseera. Rahaabis dura gaarii hojjette osoo hin taane dura Waaqayyo jara waliin jirutti amante. Rahaab hojii isheen fayyite akka hin jenneef, jarreen dhoksitee sobdee sokkaniiru jette, Sobimmoo cubbuudha malee hojii gaarii nama fayyisu miti. Kanaafuu Hafuurri Qulqulluun karaa Phaawulosii fi Yaa'iqoob yaada waltumsu barsiisaa jira.\n" +
                "Amantii Qofaan Qajeelaa ta'uun Hojii gaariin ammoo Qajeelummaa ofii mul'isu!!\n" +
                "\n" +
                "\n" +
                "2 [Forwarded from Kanhafetucaala Chala]\n" +
                "Mat 27:52-53 ‘’Awwaalonni immoo banamanii warri qulqulloonni dur du'an in kaafaman; isaanis awwaalota keessaa ba'anii du'aa ka'uu Yesuus booddee mandara Yerusaalem qulqulla'aatti lixanii namoota baay’eetti mul'atan’’ \n" +
                "Mee ibsa xiqqoo ishee naa kennaa namoonni kun deebi'anii hin du'anii?, Amma akkamitti jiruu?, Gaafa Yesuus deebi'ee dhufu namoonni kun qaama akkamii uffatanii Yesuusiin simatu?\n" +
                "Kutaan kun Agarsiiftuu du'aa ka'uu amantootaa fi Jijjiiramuu bakkaa lubbuu fi hafuura amantoota kakuu moofaa kan agarsiisuudha. Jarri akkam tahan kan jedhuuf immoo macaafni homaayyuu hin dubbanne,yoo macaafni callise callisuun Ogummaadha.Garuu du'aa ka'uun kun Akkuma du'aa ka’uu Alaazar eenyummaa Kiristoos mul’isuuf kan tahe waan ta’eef du'aa ka'uu isa dhumaa tahuu hin danda'u.  Garuu amantoonni Kakuu moofaa abdiin fayyan sun qaamaan Kiristoosiin arganii akka waldaa kiristaanaatti dabalamanittan amanna! Du'aa ka'uu akaakuu lama qofti waan jiruuf,kun ergaa olitti ibsuuf yaaleen alatti hiikoo caalu qabaachuu hin danda’u! Efe 4:7-8, Luq16:21, 1Pet 3:19, 2Qor12:4, Filp1:23.\n" +
                "Hoe2:30 Awwaalli Daawwit as jira jedhee jira kana irraa immoo yaada deebi'anii du'uu isaanii deeggaru ni arganna.kanaafuu du'aa kahuun kun agarsiiftuudha.\n");

        textView.setTextSize(mRatio + 13);

    }
}
