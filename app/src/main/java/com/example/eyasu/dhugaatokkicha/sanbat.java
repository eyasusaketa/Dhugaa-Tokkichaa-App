package com.example.eyasu.dhugaatokkicha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.widget.TextView;

public class sanbat extends AppCompatActivity {
    TextView textView;
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main9, menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sanbat);
        textView = (TextView) findViewById(R.id.textView4);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("Jechi sanbata jedhu jecha Ibrootaa 'shabbat' jedhurraa kan dhufeedha.\n" +
                        "Hiikaan isaas Boqochuu ykn hojjechuu dhaabuu jechuudha.\n" +
                        "Jechi kun jecha lakkoofsa torbaa waliin hariiroo kallattii ni qaba. seera umamaa Boq 2 irraa Waaqayyo guyyaa 7ffaa irra ni boqote jedha.\n" +
                        "Waaqayyo kan boqote waan dadhabeef osoo hin taane waan xumureefidha, Waaqayyo hin dadhabu waan ta’eef.\n" +
                        "\" Ati hin beeknee ree? Hin dhageenyeesii ree? Waaqayyo, gooftaa bara baraan jiraatuu dha, inni isa guutummaa biyya lafaa uumee dha; inni hin mudhuku, hin dadhabu, hubannaa isaas namni qoree bira hin ga'u;\"  Isa 40: 28\n" +
                        "Hojii karaa Waaqayyo Ilmaa xumurametti gammaduu isaa agarsiisa.Uma1:31, Far121:4.\n" +
                        "Sanbanni Waaqayyoo Seera Uumamaa keessattii, jechuunis Guyyaa torbaffaan ganamaa fi galgalli isaa hin beekamne.kunis Boqonnaan Waaqayyoo kan daangaa hin qabne,kan barabaraa ta'uu agarsiisa.Sanbanni Uma 2:1-3 erga caqasamee deebi’ee hanga Bau16:23 waa’ee maannaatti deebi’ee hin kaane.Booda Bau 20:8-11 fi Bau23:12  keessatti akka seeraatti kakuu seeraa waliin saba Israa’eliif kenname.Sanbatni kun gaaddidduu Kiristoos waan tureef, Kakuu haaraatti Kiristoos qaama boqonnaa dhugaa tahuun fiixaan baase.Qol 2:16-17\n" +
                        "Sanbanni kun Guyyaa torbaffaa jedhama. Sanbanni kun namaaf Guyyaa jalqabaa ture. \n" +
                        "Sanbatoota Macaafa Qulqulluu keenya keessa jiran:-\n" +
                        "1 Boqonnaa(Rest),Ibr 4:1-11\n" +
                        "Waaqayyo hojii uumuu raawwachuu isaan Uma 2:1-3, Ibr 4:1-11\n" +
                        "Sabni Israa’el kana’aanitti galuu isaaniin Kes 12:9-10\n" +
                        "Amantootni amantiin Yesuusitti boqochuu isaaniin Mat11:28-29 kunis sadarkaalee armaan gadii qaba:-\n" +
                        "*Kiristiyaanonni hafuuraan yeroo biyya lafaa irra jiran.\n" +
                        "* Amantoota Boqonnnaa Waggaa 1000 keessatti\n" +
                        "* Uumama haaraa Boqonnaa samii haaraa fi lafa haaraa, boqonnaa bara baraa keessatti.\n" +
                        "Boqonnaan kakuu haaraa guyyaa irratti osoo hin taane Gooftaa irratti.\n" +
                        "    Mat11:28\n" +
                        "*guyyaa faasikaatti aansee kan dhufu guyyaa jalqaba Ayyaana maxinoo guyyaa boqonnaati.Lew23:5-8\n" +
                        "           2.Sanbata seeraa\n" +
                        "Sanbatni kakuu moofaa Guyyaa 7ffaa ture.\n" +
                        "Bau20:8-11, Kes5:12-15\n" +
                        "Erm 23:12,Mark2:27-28\n" +
                        "Sanbatni guyyaa 7ffaa kakuu seeraa fi uumama moofaa agarsiisa. Bau31:13-17 . \"Saba Israa'eliin, 'Sanbatoota koo eegi! Ani Waaqayyo isa si qulqulleessu akkan ta'e akka beektuuf, dhaloota hundumaa keessatti Sanbanni kun anaa fi si gidduutti milikkita' jedhi! \n" +
                        "Guyyaa Sanbataa eegi inni siif qulqullaa'aa dha; namni qulqullinatti isa hin eegne haa ajjeefamu! Namni guyyaa sanatti hojii hojjete hundinuu saba isaa keessaa haa balleeffamu!\"\n" +
                        "Ba'u 31:13-14\n" +
                        "* Sanbatni saba Israelii fi Waaqayyo gidduutti mallattoo kakuuti.\n" +
                        "\" Ani Waaqayyo guyyaa ja'a keessatti bantii waaqaa fi lafa uumee, guyyaa torbaffaatti immoo waanan hojjechaa ture hundumaattii boqodheen aara galfadhe; kun anaa fi saba Israa'el gidduutti bara baraan milikkita in ta'a\" jedhe.\" Ba'uu 31: 17\n" +
                        "Sanbanni Guyyaa 7ffaa kakuu seeraa waliin saba Israa'el qofaaf kenname.Ba'u20:8-11,Far147:19-20, Rom9:3-4.\n" +
                        "Kakuun kunis kakuu isa moofaa isa dulloomee badduu baheedha.\n" +
                        "Ibr 8:7-13\n" +
                        "\"Yesus hojii lubummaa isa kan isaanii irra fagoo caalu fudhate; hammuma hojiin isaa caalu immoo, kakuun inni Yesus Waaqayyoo fi namoota gidduu dhaabe, inni abdii caalu irra dhaabatu sun guddaa in caala. \n" +
                        "Kakuun inni duraa hir'ina hin qabu utuu ta'ee, isa lammaffaa iddoo buusuun hin barbaachisu ture.\"   Rom 8:6-7\n" +
                        "\" Waa'ee kakuu haaraa dubbachuun isaa inni duraa moofa'eera jechuu isaa ti; wanti moofa'e, wanti dulloomes badduu ba'uu ga'eera.\" \n" +
                        "(Ibroota 8: 13)\n" +
                        "*Amantoonni Kiristoos qaamicha waan seenaniif boqonnaa Guyyaa isa gaaddidduu keessa osoo hin taane Kiristositti Guyyaa hundumaa boqotu\n" +
                        "\"Kanaafis waa'ee nyaataa fi dhugaatiitti, waa'ee guyyaa ayyaanaatti, waa'ee baatii lakkaa'uutti yookiis waa'ee Sanbata eeguutti, namni tokko illee isinitti hin faradin!\n" +
                        "Isaan kun gaadidduu wanta dhufuuf jiru sanaa duwwaa dha; wantichi inni dhugaan garuu kan Kristos.\" Qol 2:16-17\n" +
                        " *Amantootni seera jala waan hin jirreef sanbata eeguun akka waanjootti isaanitti hin kennamne.\n" +
                        "2Qor5:17,Gal5:1,Hoe20:32,1Qor1:18\n" +
                        "Qol1:12,Rom8:1-3,Rom14:4-13\n" +
                        "Gal4:9-11\n" +
                        "*Amantootni seera museettii hiikamaniiru.Rom7 :1-6,2Qor 3:6-7\n" +
                        "*Amantootni Seera gararraa Ayyaana jala jiraatu.Rom 6:14\n" +
                        "Amantootaaf guyyaan hundumtuu Guyyaa sanbataati(boqonnaati)\n" +
                        "Ibr4:14-17\n" +
                        "Tokkummaan amantootaa waldaa Kiristiyaanaaf bu’uura. Kanaaf amantootni bara ergamootaa Guyyaa hundumaa yoo wal argan illee jalqaba torbanii Guyyaa sanbata guddaa addatti Irbaata cabsachuu fi Gooftaa Yaadachuuf walitti qabamu turan.\n" +
                        "Guyyaan sanbata guddaa ykn jalqabni torbanii Guyyaa 7ffaa bakka hin buune. Guyyaa 7ffaan karaa Kiristoos fiixaan bahe. Yoh19:29-30,Qol 2:16-17\n" +
                        "Gammachuu fi Boqonnaan Waaqayyoos Kiristoositti raawwate Mat3:17.\" Utuu inni kana dubbachaa jiruu, kunoo, duumessi ifa of keessaa qabu tokko isaaniitti uffise. Sagaleenis duumessicha keessaa dubbatee, \" Kun Ilma koo isa an jaalladhu, gammachuun koos isatti in raawwatama; isa dhaga'aa!\" jedhe.\" (Maatewos 17: 5)\n" +
                        "*Garuu Guyyaa 1ffaan ykn sanbanni guddaan Guyyaa Gooftaa jedhamuun beekama\n" +
                        "Hoe20:7,1Qor16:1-3,Mul1:10\n" +
                        "*Inni Guyyaa itti Kiristoos du’aa ka’eedha. Mat28:1\n" +
                        "*Jalqabbii haaraa fi Waggaa haaraa agarsiisa.\n" +
                        "Guyyaa itti Hafuurri Qulqulluun bu’eedha.\n" +
                        "Guyyaan jalqaba torbanii jalqabbii haaraa fi waggaa haaraa agarsiisa Lew23:10-11,15\n" +
                        "Kennaan bissii ija midhaan jalqabaa kan fuula Waaqayyootti mul’ifame Guyyaa jalqaba torbanii ture.\n" +
                        "Kiristoos isa jalqabaa ta’uun warra du’an keessa angafa ta’ee ka’e 1Qor15:20,23\n" +
                        "Guyyaa 7ffaa booda du’aa ka’e, Uumama haaraa fi jireenya haaraa Amantootaa ta'uu isaa agarsiisa.\n" +
                        "Kakuu Haaraatti Amantootaaf, guyyaa addaa osoo hin taane Gooftaa addaatu jira.\n" +
                        "Boqonnaan Kiristiyaanota sa'a 24 guutuu,torban guutuu fi waggaa guutuu Kiristoos isa hojii fayyinaa fiixaan baase irratti malee Hojii hiikuun miti.\n" +
                        "Sanbata guddaan waan seera taheef osoo hin taane guyyaa Gooftaa waan taheef, guyyicha irra dhiphina,du'uu fi du'aa kahuu isaa yaadachaa deebi'ee dhufuu isaan waljajjabeessaa guyyaa waaqeffannuudha.\n" +
                        "Waa'ee guyyaa kanaaf garuu  walitti faraduun garmalee wal qeequun nurraa hin eegamu.\" Namni guyyaa tokko guyyoota warra kaan irra caalchifatu jira; inni kaan immoo guyyoota hundumaa wal qixxeetti ilaala. Kana irratti namni adduma addaan akkuma fudhatetti yaada isaa gar tokkotti haa kutatu!\" \n" +
                        "(Roomaa 14: 5)\n"+
                "\n" +

                        "Dhaloota kakuu haaraatif sanbatni maali jechuu dandenya? Akkasumas guyyaa sanbataa qulleesi inni jedhus akkamin hikama?\n" +
                        "Sanbanni kakuu Haaraa Kiristoosiidha. Qol 2:16-17.\n" +
                        "Guyyaa Sanbataa Qulqulleessi Kan jedhuuf ammoo Abboommichi kan guyyaa 7ffaa ykn sanbata duraa(Saturday) ture.Kakuu Haaraatti Iddoodhuma tokkottillee deebisee Guyyaa Sanbata guddaatti jijjirameera hin jedhu.Kanaaf Amantiotni Kakuu Haaraa torbanitti  Guyyaa tokko Qulqullummaan Eeguun Waaqayyoof jiraatu Osoo hin taane,ofiima isaaniitii mana qulqullummaa Waaqayyoo tahaniiru.Waaqayyo yeroo hundumaa Amantoota keessatti Kabajama.1Qor3:16-17,6:19-20,Gal2:20.Kanaafuu Dhiiga Kiristoosiin Kan Qulqulleeffaman Jireenya qulqullummaa yeroo hundumaa jiraatu.Qulqullummaan jechuun addaan baasuu jechuudha.Kakuu Haaraatti Waaqayyo Guyyaa Osoo hin taane nama dhiiga kiristoosiin addaan baafatee,kan ofii isaa godhate.Waaqayyo Wiixataa hanga Wiixataatti guyyoota jiran hunda walqixxeetti ilaala.Tokkummaan Amantootaa Guyyaa Sanbata guddaa ammoo guddina jireenya hafuuraa Amantootaaf waan taheef Akka Seeraatti osoo hin taane akka nama Ayyaanome tokkootti itti gargaaramna.\n" +
                        "Yoo Seera guyyaa sanbata duraatu(guy7ffaa) gara sanbata guddaa(guy1ffaa)tti jijjiirame janna taheef ammoo\n" +
                        "   1)bu'uura M/qulqulluu hin qabnu.\n" +
                        "2)waldaa dhaquu qofa osoo hin taane,Qidaamee galgala sa'a 12:00 kaasee hanga sanbata guddaa sa'a 12:00 tti hojii tokkollee hin hojjetan, nyaatii fi bunni hin qopheefamu.Horii fi galaa mana ofiillee boqochiisuu qabu.Kakuu haaraatti garuu kun Amantootarraa hin eegamu,Hojii gaarii koonan fayyaa irraa fiixaan baasuu kiristoositti boqotanii guyyaa hundumaa hojii gaarii keessa waan jiraataniif.\n" +
                        "\n" );
    }
}
