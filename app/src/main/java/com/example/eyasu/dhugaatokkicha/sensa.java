package com.example.eyasu.dhugaatokkicha;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.provider.Settings;
import android.support.annotation.RequiresApi;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.View;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;


public class sensa extends AppCompatActivity {

    FloatingActionButton floatingActionButton;
    TextView textView;
    private static final String SCREEN_BRIGHTNESS_VALUE_PREFIX = "Current device screen brightness value is ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensa);

        textView=(TextView)findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
floatingActionButton=(FloatingActionButton)findViewById(R.id.floatingActionButton);
        final SeekBar sk=(SeekBar)findViewById(R.id.seekBar2);
        sk.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
            int p=0;
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
               p=progress;
               textView.setTextSize(p+18);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                if(p<30){
                    sk.setProgress(p);

                }

            }
        });


floatingActionButton.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

        Intent intent=new Intent(sensa.this,newnot.class);
        startActivity(intent);
    }
});

        Typeface fo=Typeface.createFromAsset(getAssets(),"Gabriola.ttf");

textView.setTypeface(fo);

                String T1="     SEENSA\n                ",par1,par2,par3,par4,T2,T3,T4,S="\n\n\n";
                par1= "\n\n     Addunyaa_har'aa_kana_keessatti_namni_hedduun guungummii,komii fi waakkii waa'ee dhugaa ofii isaatii ni qabaata.Kaan dhugaa isaatu duraa qal'ata;kaan dhugaa isaatu duraa dhokata;kaan immoo dhugaa isaatu duraa bada.Addunyaa Amantootaa keessatti dhugaan Kiristaanotaa dhugaa eenyuunuu qal'achuu ukkaamfamuu,dhokachuu fi baduu hin dandeenye; yaadaa fi wantoota osoo hintaane, Dhugicha Aangoo du'aa diigee ka'e Yesuus Kiristoos ilma Waaqayyooti!!Inni dhugaa isa tokkicha dhugaan hundinuu irraa lateedha.Kiristoosiin kan qabu dhuga qabeessa abbaa mirgaati!!\" Yesus deebisee, \"Karichi, dhugaan, jireenyis, ana; anaan yoo ta'e malee, eenyu iyyuu gara abbaa hin dhufu. \" (Yohannis 14: 6).\n" +
                "Namoonni kan rakkatan dhugaa ittiin fuula abbaa murtii ykn bulchaa biyyaa dura dhaabbatan argachuufiidha. Dhugaan inni Waaqarraa gadi bu'e kiristoos garuu gara Waaqayyo Abbaatti Amantoota geessuun kan dubbatuufiidha. Dhugaa kanaan ala samiirraas lafarraas gara Waaqayyootti kan geessu tokkollee hin jiru!!Isumatu karaadha,isumatu Dhugaadha,isumatu Jireenya.\n" +
                "Dhugaan kun guutummaatti nu geeddaruuf guyyaadhaa guyyaatti isa hubachuu nu barbaachisa!!Akkuma Qoricha baachuun osoo hin taane liqimsuun ykn waraannachuun (injection) qaama keenya yoo seenu madda dhukkubaa ajjeesuun nu fayyisu;nuti deeggartoota dhugaa qofa osoo hintaane Amantoota Dhugaati! Amantiidhaan dhugicha nyaannee fayyinee,hubachuun  birmadummaa hafuuraa argachaa kan guddannu nuti ilmaan Waaqayyooti. Amantiin ammoo dhagahuu irraa dhufa.Rom10:14-17\n" +
                "Dhugaan yoo hubatamu qofa birmaduu nama baasa.\" Dhugicha in hubattu; dhugichi birmaduu isin in baasa\" jedhe. \"  (Yohannis 8: 32)\n" +
                "Ilmuma ta'ee dhugaa yoo hin hubanne jireenya garbichaa jiraata.\n" +
                "Ati Kiristoositti amanteetta yoo tahe ilma taateetta. Ammaan booda fuulakee gara Dhugicha hubachuutti deebisi jireenyaa fi badhaadhummaa Abbaakee isa Waaqarraa Hubachuun aarii garbummaan guungumuurraa gammachuu ilmummaa gammaddaa!\n" +
                "(Yoh 8:35-36)\n" +
                "Jireenyaa moofaa kufaatiin Addaamii fi Hewaan nu badhaase kana keessaa kan nufure waan akka namaatti gati jabeessa ta'e kan akka Warqee fi Meetii osoo hin taane gabaa Waaqayyootti gati jabeessa hunda caalu kan ta'e Dhiiga Kiristoos Hoolicha Waaqayyoo isa mudaa hin qabneeti.(1 Pheexros 1:18-19 ) \n" +
                " \n" +
                "Dhugaan tokkichi kun nama fooyyessa osoo hin taane haaraa nama dhalachiisa.\" Nuyi uumama isaa hundumaaf angafa akka taanuuf, inni akka jaalala isaatti dubbii dhugaatiin nu dhalche.\"  (Yaaqoob 1: 18)\n" +
                "Dhugaa hubannee erga amantiidhaan kan Kiristoos taanee amma nuti enyummaa moofaan golgamnee Waaqayyotti kan fokkifnu uumama moofaa osoo hin taane kiristoosiin  uffannee Waaqayyotti kan bareennu Uumama haaraadha. 2Qor5:17.\n" +
                "\n" ;
                T2="                                                                                                 \n\nUTUBAALEE HAARA'UMSAA (REFORMATION) PROTESTANTII SHANAN!!\n\n" ;
                par2= "Dhugaan_Waaqayyoo_Caaffata qulqulluu keessatti ilmaan namaaf akka humna bilisummaa fi mo'icha hafuuraa isa bara baraatti mul'ifame yihuudotaa fi Ormootaan ari'atamuurra kan darbe,Waldaan naannoo(local church) hanga bara haara'umsaatti muummee dhugaa irratti golgaa hidhuun beelaa fi dheebuu hafuuraan Addunyaa kan dararsite tahus danuu ukkaamsaa isaanii keessaa dhugaan akka Volkaanoo dhohuun Addunyaa sobaa mara hunkuteessuun tulluu Amantootaa isa ifaan faayame tahee as dhaloota har'aa bira gahee jira . Maarree,Waaqayyo keenya Waaqa Macaafa qulqulluu qofa osoo hin taane Waaqa seenaa hojjeteedha.\n" +
                "Seenaa ajaa'ibsiisoo Waldaan Kiristiyaanaa dabarsitee dhufte hubachuun ammoo gateettii ittiin seenaa kana dhaloota dhuftutti osoo hin jalisin dabarsinuudha.\n" +
                "Waldaan Kiristiyaanaa dhalachuu ishee du'aa ka'uu kiristoosiin booda guyyaa 50ffaatti jechuunis guyyaa ayyaana pentecost irraa eegalee Amantaa yihuudotaan, mormituu dhugaa kan tahe Seexana isa Abbaa sobaa ta'een aangeffamuun bartootni misiraachoo du'aa ka'uu akka hin lallabne ittisuun dhiibbaa uumuurra kan darbe;bara mootii Roomaa isa 6ffaa ,Neeroo,bara 67A.D labsiidhaan Bartootnii fi hordotootni Kiristoos akka Ajjeefaman tahe kanaanis ari'atamni karaa Ajjeechaa dhugaa fayyinaa fi jireenya ilmaan namaa kun mootota Roomaa walitti fufiinsaan bulchan kudhaniin itti fufe !Kunis Neeroo bara 67AD hanga Diyookilishiyaa(245-313AD) itti fuufuun taatee suukanneessaa Waldaa kiristaanaa irraan gahus waldaan wal-rukutiinsa macaafa Qulqulluu osoo hin Keessummeessin Fooniin gootota hedduu dhabdullee dhugaa lubbu qabeessa osoo hin dhabin seenaa itti fufsiisuu dandeesseetti!! Booda yeroo jalqabaaf Kiristaanonni mirga kan argatan bara mootii konistaantiin bara 313AD booda ture.Kunis akka Waggaa 20 booda deebisee ari'annaa eegale yeroo kanaa kaasee Waldaan kiristiyaa dhiibbaa caalu kan Foon Amantootaa osoo hin taane Dhugaa macaafa qulqulluu awwaaluu yaalu itti fufe,haaluma kanaan Bara 500AD hanga 1500 AD tti Waldaan kiristiyaanaa Gaa'ela ishee Mootummaa ormaa wajjin dhaabachuudhaan,barsiisni sobaa kan duriirra iddoo qabachuun dhugaan ukkaamfamuun golgaa dukkanaa sagalee ifa Wangeelaa irra kaa'uun amallii fi geggeessummaan mootummaa ormaa tokkummaa amantootaa gidduu seenaa yommuu dhufu waldhabdee keessoo irraa kan kahe bara 1054AD Waldaan kiristiyaanaa ifaan ifatti iddoo lamatti gargar cabuun Waldaa Kaatolikii Roomaa fi Waldaa Ortodoksii bahaa jedhamuun iddoo iddoo lamatti gargar qoodaman!\n\n" +
                "\n\n" ;
                T3="\n\nDUUDHAA(TRADITION) FI BARSIISA (DOCTRINE)DOGOGGORAA WALDAA KAATOLIKII ROOMAA KANNEEN BU'UURA WARRAAQSA MORMII HAARA'UMSAAA PROTESTAANTIIF SABABA TAHAN KEESSAA MURAASA ISAANII:\n\n" ;
                par3="\n1.Fayyinni_Amantii_fi_Hojii gaariin malee Kiristoositti Amanuu qofaan hin argamu \n" +
                "2.Luba_yookaan_phaaphaasii_malee Amanaa dasiibni(ordinary believers)\n" +
                "Waaqayyotti dhiyaachuun dudubbachuu hindandahan jechuunis Lubni Waldaa Kaatolikii Roomaa Amantootaaf Waaqayyoon gidduu seenuun walitti fida \n" +
                "3.Dhiifama_cubbuu_argachuuf_qarshii kaffaluu kaardii siif dhiifameeraa bitachuu(Indulgence)Kunis namoota du'anillee Iddoo dhiphinaatii gara jannataatti dabarsa jechuun maatiin warra du'aniillee Kaardii dhiifamaa kana Qarshii guddaan akka bitan gochuu \n" +
                "4.Fayyinni_barabaraa_Ayyaana_Qofaan Osoo hin taane Bu'aa addaa Waaqayyo Cubbamaa irraa argatuun\n" +
                "5)Maddi_Aangoo_Waldaa_Kiristiyaanaa_Macaafa qulqulluu osoo hin taane,phaaphaasiidha.\n" +
                "6)Amantootni_Macaafa_qulqulluu_qabaachuu fi dubbifachuu kan hindandeenye,yoo harkatti argame Abiddaan gubamanii akkaAjjeefaman\n" +
                "\n7)Macaafni_qulqulluun_Afaan_Laatinii irraa gara Afaan dhalootaa saba kamiitti illee akka hin hiikamne.             \n" +
                "\n" ;
                T4="\n                    URJII_BARII_WARRAAQSA_HAAROMSAA_(MORNING STAR OF THE REFORMATION)\n                   " ;
                par4="\nJohn_Wycliffe_jedhamuun_kan_beekamu beekaa macaafaa(theologian) Ingilizii Macaafa Qulqulluu gadi fageenyaan dubbisuun yeroo jalqabaaf ifaa ifatti duudhaalee fi barsiisa dogoggoraa waldattii morme.\n" +
                "Qabxii mormii isaa keessaas kanneen olaanoon kaffaltii dhiifama cubbuuf baafamu,olaantummaa phaaphaasii macaafa qulqulluu irratti fi namni hundinuu afaan isaan caaffata qulqulluu dubbifachuu hin qabu kan jedhan irratti ture.\n" +
                "Biyya Ingiland keessattis mormii kanaan beekame.Boodas bara 1384tti Macaafa qulqulluu Afaan laatinii irraa gara Afaan Ingiffaatti hiikuun maashiniin maxxansaa waan hin jirreefis koppii tokkittii garagalchuun ji'a 10n kan gaafatu tahus namoota biraan gahuu danda'eera.Duuka buutuu kan akka Lollas horachuu erga danda'ee dhukkufatee gara gooftaa isaa deeme.Inni boqotus Warraaqsi inni Eegale Osoo hin boqotin caalaatti humna godhachuun boba'aa adeeme. phaaphaasiin biyya siizekii waldaa katolikii magaalaa piraaguwee John Huss kan jedhamu doggooroota Kaatolikii jaha baasee balbala isaa duratti maxxansuun barsiisa dhugaa macaafaa itti fufe.Kanumaan John Huss Hordaatti hidhamee Abiddaan gubamee dirrii namni hundi argu irratti ajjeefame! Dhugaa Abidda bara baraa keessaa gara jireenya barabaraatti nama dabarsu dhalootaa dabarsanii Abidda yeroof Foon namaa gubduun gara gooftaa deemuun salphina osoo hin taane Ulfina. Wycliff du'ee waggaa 44 isaa boodas phaaphaasonni Iddoo Awwaalcha isaatii lafee isaa baasuun gubanii daaraa isaa galaanatti naqan,kunis warraqsicha ittuma caalchise.\n" +
                "John Huss bara 1415 osoo hin du'in dura Waggaa dhibba tokko kana keessa Waaqayyo nama waamicha inni haaromsaaf godhu gadi qabaan hin dandeenye ni kaasa jechuun raajee ture.Hubadhaa John Wycliffe fi John Huss faallaa barsiisa dhugaa (heresy) barsiisu jechuun mormaman.\n" +
                "\n" +
                "\n" +
                "\n" +
                "Akkuma raajii dubbatamees Waggaa 100n booda Biyya Jarman magaalaa Wittenberg tti bara 1517 karaa Martin Luther Warraaqsi Haaromsaa bifa humna qabeessaan dhohe.\n" +
                "Akkuma raajii karaa John Huss dubbatameetti, moloksee waldaa Kaatolikii Roomaa fi Yuunivarsitii Wittenbergitti proofeesera kan ture Maartiin Luuter bara 1517 AD mormii amantaa Kaatolikii irratti qabu waraqaa qabxii mormii 95 qabu  balbala waldaa Kaatolikii Jarman Wittenberg irratti maxxansuun abidda dhaamuu hin dandeenyeen warraaqsa haaromsaa finiinse. Dheebuun Luuter haara’umsa waldattii keessatti fiduu malee cabsatee ba’uu kan hin barbaanne ta’ullee dhiibbaa irratti godhameen waggoota muraasaaf gara gammoojjiitti baqachuun qabsoo dhugaa wangeelaa itti fufe. \n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n";
        String name = getColoredSpanned(T1, "#fff");
        String name1 = getColoredSpanned(par1, "#000");
        String name2= getColoredSpanned(T2, "#fff");
        String name3 = getColoredSpanned(par2, "#000");
        String name4 = getColoredSpanned(T3, "#fff");
        String name5 = getColoredSpanned(par3, "#000");
        String name6 = getColoredSpanned(T4, "#fff");
        String name7 = getColoredSpanned(par4, "#000");
        String s=getColoredSpanned(S,"#000");
        textView.setText(Html.fromHtml(name+s+name1+S+name2+S+name3+S+name4+S+name5+S+name6+S+name7));
    }


    private String getColoredSpanned(String text, String color) {
        String input = "<font color=" + color + ">" + text + "</font>";
        return input;
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main9, menu);
        return true;
    }
}
