package com.example.eyasu.dhugaatokkicha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.widget.Switch;
import android.widget.TextView;

public class Protes extends AppCompatActivity {
    TextView textView;
    String name1, name2, name3, name4, name5;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main9, menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_protes);
        textView = (TextView) findViewById(R.id.textView3);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText(text("name1"));

    }


    public String text(String na) {

        name1 = "Addunyaa kana irra amantaaleen kuma kudhanii ol jiran hundinuu kan ittiin beekaman utubaalee fi ilaalcha amantaa mataa isaanii nii qabu. Maarree, amantaan ‘protestant’ wareegama Kiristoos irratti kan hundaa’e dhiigaaf lafee gootota wangeelaa hedduun baatamee kan as ga’e utubaalee shan kan eenyummaa amantichaa ibsuun kan dhaabatteedha. Namnii fi dhaabanni amantaa kam illee ‘Protestant’ jechuuf bu’ureessitoonni warraqsa haaromsaa akka walii galaatti utubaalee shan armaan gadii kaa’u.\n" +

                "1 MACAAFA QULQULLUU QOFA ( SOLA SCRIPTURA)- SCRIPTURE ALONE\n" +
                "2Xim 3:16 irratti akkuma ibsamee jiru aangoo olaanaan kan phaaphaasii osoo hin taane kan Macaafa Qulqulluu qofaati. Macaafa Qulqulluu qofatu madda mul’ata Waaqummaa fi murteessaa amantii fi jireenya dhala namaati. Jechoonni Macaafa Qulqulluu 66 geggeessa Hafuura Qulqulluun kan barreefame sagalee Waaqayyooti. Waan Caaffatichi jedhe amanuuf ittiin jiraachuun Waaqayyoon amanuuf isaan jiraachuudha. Macaafni Qulqulluun amaloota gurguddaa afur qaba. \n" +
                "\n" +
                "I Taayitaa( olaantummaa)- Authority\n" +
                "Caaffata Qulqulluun sagalee Waaqayyoo waan ta’eef jechoota isaa keessaa tokkollee amanuu diduufis ta’e abboomamuu diduun Waaqayyoon amanuu diduu ykn abboomamuufii diduudha. Jechoonni isaa hundinuu waan Waaqayyo amane waan ta’aniif ilmaan namaa itti amanuu dirqama jireenyaati.\n" +
                "II Ga’aa ta’uu Macaafa Qulqulluu- Suffiency \n" +
                "Macaafni Qulqulluun jechoota Waaqayyoo hundumaa kanneen wantoota fayyina keenyaaf barbaachisan sadarkaalee seenaa furii ilmaan namaa hundumaa keessatti guutummaan akka isa amannuuf isaaf abboomamnuuf nutti agarsiisaniin guutuudha. Homaayyuu itti dabaluun kan nun barbaachifne fi irraa hir’isuun dheekkamsa Waaqayyoo kan namatti fiduudha.\n" +
                "III Ifaa ta’uu- Clarity\n" +
                "Ergaa fayyinaa dabarsuuf Macaafi Qulqulluun ifaadha.\n" +
                "IV Barbaachisummaa- Necessity\n" +
                "Sagaalee misiraachoo wangeelaa hubachiisuuf jireenya hafuuraa amantootaaf fedha Waaqayyoo beekuuf barbaachisaadha. Rom 10:13-17, Hoe 10:12 \n" +
                "Walumaa galatti sagaleen Waaqayyoo lubbu qabeessa jiraataa waan ta’eef akkas jechuun dubbatata:\n" +
                "\uF0FC  Natti hin dabalin, yoo natti dabalte dhayicha bara baraatu sitti dabalama. Mul 22:18\n" +
                "\uF0FC  Narraa hin hir’isin, yoo narraa hir’ifte muka jireenya kennu ykn Kiristoos fi mandarattii qulqulluu ykn Waldaa Kiristiyaanaa keessa hir’atta.Mul 22:19\n" +
                "\uF0FC  Wanta ani jedhe gararraa darbitee hin barsiisin. 1Qor 4:6\n" +
                "\uF0FC  Nan micciirin. 2Qor 4:2\n" +
                "\uF0FC  Anaaf hojjedhu malee ana irratti hin hojjetin. 2Qor 13:8\n";
        name2 = "Macaafni Qulqulluun Heera Waaqayyo Ilmaan namaaf Kenne ta'ee macaafa beekumsa Qofa kennu Osoo hin taane macaafa Jireenyaati Yoh 20:30,Yoh 5:39\n" +
                "Olaantummaan Kan macaafa qulqulluuti!!Eenyuyyuu Isa caafame irra darbee akka hin barsiifnee fi hin amanne dubbata.Lafee duddaa Warraaqsa Haaromsaa kan tahe macaafni Qulqulluun madda barsiisaa fi Iddoo walargee namaaf Waaqayyooti!!Macaafichuma irratti hundaa'uudhaan Namni Fayyina bara baraa kan argatu seeraan ykn Hojii gaarii Ofii isaan Osoo hin taane Ayyaana Waaqayyoo Qofaaniidha.\n" +
                "‘’Isin Ayyaana Waaqayyootiin karaa amantii fayyifamtan; inni immoo kennaa Waaqayyoo ti malee, gochaa ofii keessanii miti; hojiidhaanis miti, namni tokko illee akka ittiin of hin janyetti.’’ (Efesoon 2:8)\n" +
                "Seerri Karaa Musee Kenname Laboraatorii Cubbamaatti Cubbuu isaa mulisuudha malee Qoricha Cubbamaa fayyisu hin turre.\n" +
                "\" Egaa nama kan ta'e tokko illee wanta seerri nama irraa barbaadu gochuudhaan Waaqayyo duratti qajeelaa hin ta'u. Seerri cubbuun maal akka ta'e nama hubachiisa.\"  (Roomaa 3: 20)\n" +
                "Ayyaana jechuun kennaa tolaa Waaqayyo Cubbamaa hin malleef dadhabbii isaa malee kennuun Firdii ofii isaa jalaa oolchuun Bara baraan fayyisuudha.\n" +
                "\" Beenyaan nama hojjeteef baafamu, gatii argachuun isaaf ta'utti lakkaa'ama malee, akka kennaa tolaatti hin lakkaa' amu. \"  (Roomaa 4: 4)\n" +
                "\" Ani ayyaana Waaqayyoo gatii hin dhabsiisu; namni qajeelaa ta'ee lakkaa'amuun seeraan utuu ta'ee; yoos Kristos akkasumaan du'e kaa! \"  (Galaatiyaa 2: 21)\n" +
                "‘’Hundinuu yakkaniiru, ulfinni Waaqayyoos isaanitti hir'ateera.Isaanumti immoo ayyaana Waaqayyoo isa karaa furii Yesus Kristos tola isaaniif kennameen, qajeelota in ta'u.’’ (Roomaa 3: 23-24 ) \n" +
                "Egaa Luuter faan maalummaa Ayyaana Waaqayyoo waan hubataniif utubaan Protestant Seera Qofa hin jenne ykn ammoo Ayyaanaa fi seera hin jenne, Ayyaana qofa jedhan malee. Namoonni tokko tokko Ayyaana Waaqayyoo hubachuu dhabuu irraan kan ka'e, Ayyaana jechuun Gadhiisii jechuu itti fakkaata.\n" +
                "Macaafni Qulqulluun Seerri museen,Ayyaannii fi dhugaa kiristoosiin argaman jedha. Kiristoos immoo isa caaluu fi isa tajaajila caalu qabuudha malee gadhiisii wajjin kan mul'atte miti \n" +
                "\" Seerri Museedhaan kenname, ayyaannii fi dhugaan garuu Yesus Kristosiin argaman.\"  (Yohannis 1: 17)\n" +
                "Ayyaanni altokko dhufee nu fayyisee kana booda kan sokku osoo hin taane: Gararraa seeraa Amanaa kan jiraachisu Humna Cubbuu nama moosisuudha. Rom 6:14\n" +
                "-Eenyummaa addaa Hojii Gaariif fiixaan nama baasuu fi humna dadhabootaa Isa irraa hafaadha.  1Qor 15:10, 2Qor 12:9\n" +
                "-Qajeelummaa kennuu Qofa osoo hin taane, Qajeelummaatti kan guddisu,of qabuu kan dandeessisuudha.  (Tiitoos 2:11-12 ) \n" +
                " \n" +
                "\n" +
                "\n" +
                "\n" +
                "\n";
        name3 = "Seerri laaboraatoorii cubbuu cubbamaa mul’isu, Ayyaanni immoo qoricha cubbamoota barabaraan fayyisuudha. Egaa dhukkubsataan firii (result) qorannoo (laaboraatoorii) isaa barraan hariiroon isaa qoricha waliin malee kutaa laaboraatoorii miti. Amantiin furtuu (key) kuusaa kennaawwan tolaa Waaqayyo karaa Ayyaana isaa ilmaan namaaf dhiyeeseeti. Amantiin karaa ittiin balabala eebba Waaqayyootti ol seennuudha. Amantiin filannoo tokkittiin amanaan ittiin Waaqayyoon gammachiisuu danda’uudha. Ibr 11:6\n" +
                "Fayyinni bara baraa amantii qofaan argama jechuun amantii fi hojii gaariidhaan fayyina jechuu miti. Akka macaafa Qulqulluuttis ta’e bu’uura protestantiitti namni kan fayyina bara baraa argatu hojii gaarii ofii isaa malee amantii qofaan. Amantiin barsiisa bu’uraalee jireenya Kiristiyaanaati. Cubbamaan amantiidhaan fayya. Efe 2:8-9, Tit3:5, 2Qor5:7, Rom14:23\n" +
                "\n" +
                "Hariiroo amantii fi hojii gaarii gidduu jiru: \n" +
                "Amantiin fayyisu fayyina hojii gaarii agarsiisu kenna, Amantiin akaakuu sadiitu jira.\n" +
                "1 Amantii du’aa Yaq2:14, Mat7:21 Namoonni amantii du’aa qaban amantii bakka hojii buufatu. Jecha sirriin kadhataa fi dhugaa ba’uu nii danda’a, garuu isa dubbatu adeemuu hin danda’u. \n" +
                "2 Amantii seexanaa Seexanni jiraachuu Waaqayyoo nii amans nii roqomas, garuu barabaraan fayyuu hin danda’u. Yaq2:18-19\n" +
                "3 Amantii fayyisu (Dynamic faith) Akkuma shiboo elektirikii laaxamaa human ibsaa dabarsaa jiru xuqnee dhiibbaa malee hafuu hin dandeenye gara Kiristoos amantii dhugaan dhufnee akkuma duriitti jiraachuu hin dandeenyu, Amantii sirriin jireenya sirrii fida. Amantii sirriin lammaffaa dhalachuu irraa hamma akka Kiristoos dhaqna du’aa ka’uu uffataniitti fayyisa.Yoh1:12-13 Filp3:21 J.Calvin akka jedhetti, ‘’Nuti amantii qofaan fayyine, amantiin fayyisu garuu gonkumaa qofa miti, hojii gaariin mul’ata.\n" +
                "Amantiin fayyisu sadarkaalee gurguddaa sadii keessa darba. \n" +
                "1 Beekuu, Rom 10:14, Yoh 17:3. Beekumsi qofti garuu fayyisuu hin danda’u. \n" +
                "2 Mirkaneessa Yoh3:2. Beekumsaa fi mirkaneessi qofti fayyisuu hin danda’u. \n" +
                "3 Irratti of gatuu (trust).\n" +
                "Hojii akaakuu addaa addaatu jira.\n" +
                "Hojii seeraa Gal2:16\n" +
                "Hojii foonii Gal5:16\n" +
                "Hojii jallootaa Qol1:21\n" +
                "Hojii du’aa Ibr 9:14\n" +
                "Amantiin dhugaa inni fayyisu garuu qajeelaa, Ilma, dhaaltuu nama taasisa. \n" +
                "Amantii qofa jechuun Waaqayyo fayyina namni baasii isaa karaa kamiinuu kaffalachuu hin dandeenye tola karaa Ayyaana mul’iseera; cubbamaan ammo amantii fayyisuun itti dhiyaatee kan fudhatuudha. \n" +
                "Amantii qofa jechuun utuu hojii gaarii hin hojjetin hojii Kiristoos qofaan fayyuun; akka firii fayyinaatti hojii gaarii humna amantii fi Hafuura Qulqulluun hojjechuudha. Ejjennoo Luuter inni jalqabaa Rom1:17 ture.\n" +
                "\" Qajeelummaan Waaqayyo namaaf kennu amantii irra in dhaabata gara amantiittis nama in geessa. (Roomaa 1: 17)\n" +
                "Amantiin ammoo amanaa irra ykn seerarra osoo hin taane Kiristoos irra dhaabbata. Ibr12:2, \" Yesus isa amantii keenya jalqabee fiixaan baasu sanattii ija hin buqqifannu. Inni gammachuu fuula isaa dura jiru sanaaf jedhee, fannoo irratti du'uu isaatiif yeelloo isa irra ga'e homaatti utuu hin lakkaa'in, obsaan fannoo irratti du'uu in danda'e; ergasiis gara mirga teessoo Waaqayyoo taa'e. \" \n" +
                "Kunis kan fiixaan ba’u karaa Hafuura Qulqulluu isa amantoota keessa jiraatuunidha. Aarsaan Kiristoos al tokkof kan bara baraa akkuma ta’e Qulqullummaan bakkaa (positional sanctification) amantiin argamus al tokkoof bara baraan fiixaan kan ba’eedha. (Ibroota 10: 10, 14), (Ibroota 9: 12)\n" +
                "Waaqayyo, \"Isin warri dheebottan hundinuu gara bishaanii kottaa! Warri horii hin qabnes kottaa! Midhaan bitadhaatii nyaadhaa, kottaatii utuu horii itti hin baasin daadhii waynii fi aannan bitadhaa! Wanta buddeena hin ta'initti maaliif horii keessan baaftu? Wanta isin hin quufsinettis maaliif dadhabdu? Dubbii koo dhaga'aa, wanta gaarii ta'e in nyaattu, nyaata gaariittis in gammaddu’’  Isa55:1-2\n" +
                "✍Kottaa utuu gatii itti hin baasin bitadhaa jechuun ‘sponser’ kan ta’e qaamni biraan jira jechuudha. Innis Yoh19:30 irratti ‘’fiixaan baheera kan jedhe Kiristoosiidha. Afaan Giriikiitti ‘Tetelestai’ jedha. Tetelestai jechuun guutummaan guutuutti kaffalameera jechuudha. Yesuus guutummaa guutuutti kaffalee fayyina keenya fiixaan baaseera. Macaafni Qulqulluun Waaqayyo gatiidhaan isin bitate jedha. 1Pet1:18-19, 1:19\n" +
                "Gatichis warqee fi meetii osoo hin taane gabaa Waaqayyootti gatii  jabeessa addaa kan ta’e dhiiga Kiristoosidha. Macaafni Qulqulluun dhiigni dhangala'u malee dhiifamni cubbuu hin jiru jedha malee hojii gaarii malee dhiifamni cubbuu hin jiru hin jedhu. Ibr 9:22. \n" +
                "✍Hojii gaariin keenya kan nu nu fayyisu osoo hin taane fuula Waaqayyoo duratti Moofaa xuraawummaati . Isa64:6. \n" +
                "✍️Kiristaanni hojii gaariidhaan kan fayye osoo hin taane hojii gaariitti kan fayyeedha. Hojii gaarii Fayyuuf osoo hin taane,waan fayyineef hojjenna. Namni tokkollee seera eegee qajeelaa hin ta’u. Gal 2:16, Rom3:19-20, Rom9:30-32.\n" +
                "\" Utuma ta'uu iyyuu namni tokko illee Yesus Kristositti amanuudhaan malee, wanta seerri isa irraa barbaadu gochuudhaan Waaqayyoon duratti qajeelaa ta'ee akka hin lakkaa'amne in beekna...Gal 2:16\n" +
                "Amantii Qofaan Qajeelaa ta'uun Hojii gaariin ammoo Qajeelummaa ofii mul'isu!\n" +
                "Foormulaa Phaawulos fayyadame: Amantii -Hojii gaarii =Qajeelummaa. Yaa'iqoob ammoo isuma kana karaa biraa yoo fayyadamu, Amantiin = Qajeelummaa +Hojii gaariiti jedha. Lachuu bu'uura tokko qabu. Macaafni Qulqulluun wal tumsa malee kan wal dhiitu miti. Yaq2:24 amantii qofaan hin fayyinu jechuun barsiisaa hin jiru. Garuu amantiin fayyisu hojii gaariin mul’achuu qabaadha. \n" +
                "Jechi ‘’By works a man is justified’’ jedhu (Yaq2:24) fi ‘’Rightenousness without works’’ Rom 4:6 jedhu kana yoo ilaalle namni hojii gaarii ofii isaan qajeelaa ta’a Yaq2:24 fi hojii gaarii osoo hin qabaatin qajeelaa ta’a Rom4:6 waan jedhu fakkaata.Kun ammoo waldhiita Garuu jechi ‘’justified’’ jedhu hiika hedduu qaba isaan keessaa:\n" +
                "1 Qajeelaa taasisuu\t\n" +
                "2 Qajeelummaa Labsuu.\n" +
                "Fakkeenyaaf, Luq7:35 ‘Wisdom is justified of all her children’ jedha. Luq7:29 ammoo ‘they justified God jedha, kun immoo utuu kallattumaan hiika tokkichaan hiikama ta'ee, Isaan Waaqayyoon qajeelaa taasisan jechuu ta’a, kun immo gonkumaa hin dandaa’amu. Kanaafuu qajeelaa ta’uu Waaqayyoo labsan jechuudha. Haaluma kanaan Yaa’iqob namni amantii qofaan fuula Waaqayyootti qajeelaa ta’e hojii gaariin ammo qajeelummaa isaa mul’isuu qaba jechuun barsiisa. Kanas Abirahaamii fi Rahaabiin fakkeenya fudhachuun barsiisa.Abirahaam Yihuudota bakka bu’a.Rahaab ammoo Ormoota bakka buuti. Kunis Abirahaam Uma15:6 irratti amantii qofaan qajeelaa; ta’ee Uma22 irratti qajeelummaa isaa immoo ilma tokkicha aarsaa gochuu isaan qajeelummaa isaa mul’iseera. Rahaabis dura gaarii hojjette osoo hin taane dura Waaqayyo jara waliin jirutti amante. Rahaab hojii isheen fayyite akka hin jenneef, jarreen dhoksitee sobdee sokkaniiru jette, Sobimmoo cubbuudha malee hojii gaarii nama fayyisu miti. Kanaafuu Hafuurri Qulqulluun karaa Phaawulosii fi Yaa'iqoob yaada waltumsu barsiisaa jira.\n" +
                "Amantii Qofaan Qajeelaa ta'uun Hojii gaariin ammoo Qajeelummaa ofii mul'isu!!\n" +
                "\n";
        name4 = "✅Kun immoo gahee Kiristoos hojii fayyinaa keessatti qabu kan xiyyeeffatuudha. Fayyinni aarsaa gaaffii Waaqayyo cubbamaa irraa qabu deebisu gaafata. Kiristoos Hoolichi Waaqayyoo isa cubbuu addunyaa haguuge osoo hin taane irraa fuudheedha. \" Borumtaa Yohannis utuu Yesus gara isaa dhufuu argee, \"Ilaa hoolicha Waaqayyoo, isa cubbuu biyya lafaa irraa fuudhu.\"  (Yohannis 1: 29)\n" +
                "✍️Kiristoos hoolaa faasikaa isa nuuf qalamee Gibxii gara Kana’aan osoo hin taane biyya lafaatii gara biyya Waaqarraatti ol nu baase kan dhiigni isaa seexana qofa osoo hin taane dheekkamsa Waaqayyoo nurra dabarseedha. Bau12:12-13, 1Qor5:7, Mul5:9-10.\n" +
                "✍️Waldaan Kaatolikii Roomaa Kiristoos osoo hin taane Phaaphaasii tu  Waaqayyoo fi amantoota gidduu dhaabbata jechuun barsiisa Niqooliyaanotaa isa saba irratti tajaajiltoota Gooftaa gochuun agartuu amantootaa duratti golgaa dukkanaa hidhuun akka isaan Waaqayyootti hin dhiyaanne gochuun bu’aa dalgaa irraa argatan sanatti kufte; Kanaaf hayyoonni haaromsaa amanaan hundinuu wal qixxee Waaqayyootti dhiyaachuu danda’a. Angafni lubaa yeroo hundumaa amantootaaf fuula Waaqayyootti mul’achuun amantootaaf kadhatu Kiristoos Yesuus qofa jechuun hundee barsiisa kanaa kaa’an. Ibr4:15, 9:24, 10:19-20, Rom8:33-34, 1Yoh2:1, Efe2:18.\n" +
                "\" Yaa ijoollee ko, akka isin cubbuu hin hojjenneef kana isiniifan caafa; namni tokko illee yoo cubbuu hojjete garuu, nama nuuf dhaabatu abbaa biraa qabna, innis Yesus Kristos isa qajeelaa dha.\"  (1 Yohannis 2: 1)\n" +
                "\n" +
                "✍Kiristoos lubicha keenya angafaa isa dheekkamsa Waaqayyoo fi cubbamaa gidduu seenuun dhiiga ofii isaa aarsaa dhiyeessuun Waaqayyoon garaa ciibsee Araara argamsiisee achumaanis amantootaaf angafa lubaa tahuun har'allee fuula Waaqayyoo dura dhaabbachuun ni kadhataaf.  (Ibroota 7: 25)\n" +
                "Kiristoos Angafa lubaa isa Aaron irra caaluudha. Lak16:48\n" +
                "Kiristoos akka raajii tokkootti dhalatee guddatee tajaajilee aarsaa  fannoorraan akka luba tokkootti cubbamootaa fi Waaqayyo gidduutti nagaa buusee,Angafa lubummaa isaan amantoota maatii Waaqayyoo ta’an bakka bu’uun kan mul’atuufiidha. Lammaffaa deebi’ee dhufuu isaa irratti ammoo mootii moototaa ta’uun dhufa. Kiristoos Raajii, Angafa LUbaa fi Mootiidha. Kakuu haaraatti amantoonni hundinuu luboota. 1Pet2:5,9 Mul1:6, 5:10\n" +
                "\" Isinis luboota qulqullummaa ta'uudhaaf; aarsaa hafuuraa isa karaa Yesus Kristos Waaqayyo duratti fudhatamu dhi'eessuudhaaf, akka dhagoota jiraatootti ijaarsa mana isa hafuuraa sanaaf ta'aa! \" \n" +
                "(1 Pheexros 2: 5)\n" +
                "\" Isin garuu qomoo fo'amaa dha, luboota mana mootummaa ti, saba qulqullaa'aa dha, warra dhuunfaa Waaqayyoo ta'anii dha. Waaqayyo hojii isaa isa jajamaa akka labsitaniif dukkana keessaa, gara ifa isaa isa dinqisiisaatti isin waame. \" \n" +
                "\n" +
                "(1 Pheexros 2: 9)\n" +
                "\" Isa mootummaadhaa fi Waaqayyo abbaa isaatiif luboota akka taanu nu godhate sanaaf, ulfinnii fi aangoon baraa hamma bara baraatti haa ta'u! Ameen.\" \n" +
                "(Mul'ata Yohannis 1: 6)\n" +
                "Kiristoos 100% Hojii fayyina barabaraa raawwateera.\n" +
                "#Kiristoos Karicha tokkicha gara Waaqayyo Abbaatti geessuudha\n" +
                "\" Yesus deebisee, \"Karichi, dhugaan, jireenyis, ana; anaan yoo ta'e malee, eenyu iyyuu gara abbaa hin dhufu. \" \n" +
                "(Yohannis 14: 6)\n" +
                "Anaan yoo ta'e jedhe malee Maariyaamiin,Ergamootaan(Angels) ykn Qulqulloota biroon hin jenne.Anaan malee jechuun Ana Qofaan jechuudha.\n" +
                "#Kiristoos Riqicha tokkicha Waaqayyoo fi namoota walquunnamsiisu, isa Waaqarraa gara lafaatti gadi bu'e Kan cubbamaan Yaabbatee samiitti Ol bahuun gara mirga Waaqayyoo ittiin taa'uudha.\" Waaqayyo tokkicha, inni gidduu dhaabatee Waaqayyoo fi nama walitti fidus tokkicha, inni immoo Kristos Yesus isa nama ta'ee mul'atee dha.(1 Ximotewos 2:5) Kutaan Kun ammoo ifaa ifatti \"Tokkicha\"jechuun mul'ise.\n" +
                "Yaabbannoo ykn Riqicha kana Yaa'iqoob Lafa Onaa keessatti duunni utuu isa Sodaachisuu Abjuutti argee ture.\n" +
                "\" Inni achitti abjuu abju'atee, yaabbannoo hundeen isaa lafa dhaabate, fiixeen isaa bantii waaqaa bira ga'u tokko in arge; kunoo, ergamoonni Waaqayyoo isa irra ol in ba'u, gadis in bu'u turan.\" \n" +
                "(Seera Uumamaa 28: 12)\n" +

                "Yesuus kiristoos Riqichi samii fi dachee walquunnamsiisu kun \"Ana\" jedhee dubbateera.\n" +
                "\" Itti dabalees, \"Dhuguma, dhuguman isinitti hima, waaqa banamaa, ergamoota Waaqayyoos ilma namaa irra utuu ol ba'anii gad bu'anii arguuf jirtu\" jedheen.\" \n" +
                "(Yohannis 1: 51)\n" +
                "Kanaafuu namaaf Waaqayyoon\n" +
                "Gidduu kan dhaabbatu Maariyaam,Ergamoota(Angels),Raajota,Qulqulloota osoo hin taane Yesuus Kiristoos Qofa!!\n" +
                "Kiristoos Fayyisaa fi Gooftaa Maariyaamii fi Qulqulloota isatti amananiiti.\n" +
                "(Luqaas 1 ) \n" +
                " ------------ \n" +
                "46 Maariyaam yommus,\"Garaan koo gooftaa kootiif hooqubaa dhi'eessa;\n" +
                "47 hafuurri koos Waaqayyo fayyisaa kootti in ililcha. \n" +
                "Namni Fayyisaa qabu cubbuu qabaachuun isaa beekamaadha. Fayyisaan immoo Kiristoos Qofa. Kiristoos Gooftaan Keenya \n" +
                "Isa Ergamoonni Waaqayyoo isaaf Sagadaniidha.\n" +
                "\" Waaqayyo ilma isaa isa angafa waan hundumaa,gara biyya lafaatti yommuu erge immoo,\"Ergamoonni Waaqayyoo hundinuu isaaf haa sagadan!\" jedhe.\" \n" +
                "(Ibroota 1: 6)\n" +
                "Maariyaam Hojiin giddu seentummaa (mediator) kan Kiristoos Qofa ta'uu isaa labsiteetti.Namoonni Qaanaa Galiilaatti Daadhiin duraa dhumnaan Kallattiin Kiristoositti himachuurra,Maariyaam haadha isaatti himuun itti nuuf himi jedhan,Isheenis akkasuma goote,Kiristoos garuu akka luqqisii armaan gadiitti deebiseef:-\n" +
                "(Yohannis 2 ) \n" +
                " ------------ \n" +
                "4 Yesus immoo \"Haadhoo, maaliif hojii koo keessa lixxa ree? Waa gochuuf yeroon koo amma illee hin geenye\" jedhee deebise. \n" +
                "5 Haati isaa yommus warra achii ergamaniin, \"Waanuma inni isinitti himu godhaa!\" jetteen.\n" +
                " Isheenis\"Waanuma inni isinitti himu godhaa\"Jettee Amantootaa fi Yesuus gidduudhaa baate.\n" +
                "#Ergamoonni Hidhata Hojii Amantootaati malee Amantoof Waaqayyoon walitti Kan fidan miti.\n" +
                "\n" +
                "\n" +
                "(Mul'ata Yohannis 19 ) \n" +
                " ------------ \n" +
                "9 Yommus ergamaan sun, \"Warri gara cidha gaa'ela hoolichaatti waamaman haa gammadan! Atis kana caafi!\" Itti dabalees, \"Kun dubbii Waaqayyoo isa dhugaa dha\" naan jedhe.\n" +
                "10 Kana irratti isaaf sagaduudhaaf miilla isaatti nan kufe; inni garuu, \"Kana gochuun siif hin ta'u! Ani siif, obboloota kee warra isa Yesus dhugaa ba'etti qabamaniifis hidhata hojii ti, Waaqayyoof sagadi!\" naan jedhe. Inni Yesus dhugaa ba'e immoo isa hafuurri namoota raajii dubbachiisuu dha.Dabalataan mul 22:8-9 dubbisi.\n" +
                "#Kiristoos Maqaa Fayyinaa tokkicha Ilmaan namaaf kenname,kan akka isaa Waaqarras ta'e lafarra kan hin jirreedha.\n" +
                "\" Fayyinnis Yesus Kristos duwwaadhaan malee, kan biraatiin tokko illee hin jiru; maqaan kan biraa, ittiin fayyuun kan nuuf ta'u, waaqa jalaa ilmaan namootaaf hin kennamne\" jedhe.\" \n" +
                "(Hojii Ergamootaa 4: 12)\n" +
                "Waan Dubbannu hundumaa keessaa Inni Caalu Angafa Lubaa akkasii kana mirga Waaqayyootii qabna isa jedhuudha.\n" +
                "\" Wanta dubbannu keessaa, \"Nuyi angafa lubootaa isa bantii waaqaa keessatti, gara mirga teessoo Waaqayyoo surra-qabeessaa taa'e akkasii qabna\" isa jedhutu hunduma irra caala.\" \n" +
                "(Ibroota 8: 1)\n" +
                "Naatinaa'eeliin ati namicha Isra'el isa dhugaadha,utuu Filiphoos si hin argin muka harbuu jalattin si arge jennaan Baay'ee Yesuusitti gammadee, Rabbi ati Ilma Waaqayyoo mootii Israa'el jedheen Kiristoos garuu kana hin dinqifatin Kan Kanarra caalu arguuf jirtaa jedhee Ofii isaa itti agarsiise.Isa Yesuus hin dinqifatin jedhe dinqisiifachuu irraa Gara Kiristoos isa  Gammachuun Waaqayyo Abbaa itti raawwatee fi Isa Dinqiitti haa guddannu!!Yoh1:45-51,Isa9:6\n" +
                "Kiristoos:-Hundee tokkicha,Giddu galeessa tokkicha,Dhirsa misirroo tokkicha,Mataa tokkicha,Obboleessa Angafaa tokkichaa fi Angafa Lubaa tokkicha Waldaa Kiristiyaanaati.\n" +
                "Shalom!Shalom!Shalom!!!\n" +
                "      DHUGAA TOKKICHA!!!\n" +
                "\n" +
                "\n" +
                "\n";
        name5 = "Utubaa Inni shanaffaan kun galma kaayyoo fayyina barabaraati. Waaqayyoo nama ulfina ofii isaatiif ulfina ofii isaarraa uummate . Uma 1:26\n" +
                "\"Sabni amma illee hin dhalatin jiru goofticha akka jajatutti, kun dhaloota dhufuuf haa caafamu.\" Farf 102:18\n" +
                "Fayyinni bara baraa akka macaafa Qulqulluu qofaatti, Ayyaana Waaqayyoo qofaan karaa amantii qofa Kiristoos qofa keessaan ulfina Waaqayyoo qofaaf nuuf kennameera.\n" +
                "Xumurri humna jalqabbii mul’ata tokkoo akkuma tahe, ulfina ofii isaaf oolfachuun Waaqayyoo galma karoora fayyisuu isa barabaraati. 1Tas2:12. Yoh17:22, 2Qor3:18, Rom8:29-30,Isa 43:21\n" +
                "\" Warra duraan dursee beekumsa isaatiin fo'ate, fakkaattii ilma isaa isa obboloota baay'eedhaaf angafa ta'uuf jiru, akka ta'aniif yaadaan isaan qabe. \"  (2 Qor3: 18)\n" +
                "\" Warra yaadaan isaan qabe immoo waameera; warra waame immoo qajeelota isaan godheera; warra qajeelota godhe immoo ulfinaan isaan ga'eera.\"  (Rom8: 29-30)\n" +
                "Kanaafuu warri dhugaatti dhugaaf Ayyaanaan fayyan guutummaan jireenya Isaanii ulfina Waaqayyooof kan ooluudha. 1Qor10:31\n" +
                "\" Egaa yoo nyaattan yookiis yoo dhugdan yookiis waanuma hojjettan hundumaa ulfina Waaqayyoof hojjedhaa!\"  (1 Qorontos 10: 31)\n" +
                "Namummaan Kiristiyaanaa guutummaan dhiiga Kiristoosiin kan bitame kan ofii isaa osoo hin taane qabeenya Waaqayyooti. 1Qor6:19-20\n" +
                "\" Dhagni keessan mana qulqullummaa hafuura qulqulluu isa isin keessa jiriu ta'uu isaa hin beektanii ree? Hafuura kanas Waaqayyo biraa argattan; mana qulqullummaa hafuura isaas erga taatanii, isin kan ofii keessanii miti. Waaqayyo gatiidhaan isin bitate; kanaaf guutummaa dhagna keessaniin waan inni ittiin galateeffamu hojjedhaa!\" (1 Qorontos 6: 19-20)\n" +
                "Ati mana qulqullummaa warqee fi meetiin osoo hin taane dhiigaa fi lubbuu Kiristoosiin ijaarame kan Kiristoos ulfinni Kakuu haaraa yeroo hundumaa keessa jiraatuudha. 1Qor3:16-17,2Qor3:17\n" +
                "Qarshiin kee, qabeennya kee, tajjaajila kee dura Waaqayyoof namummaa kee guutummaa aarsaa godhii kenniif, Waaqayyo guutummaa jireenya kee irratti ulfaachuu barbaada  (Roomaa 12: 1).\n" +
                "Waaqayyoo ofii nutti boqochuuf osoo hin taane, gara badhaadhummaa ofii isaatti nugeessuun isa waliin gammachuu fi galataan akka jiraannuuf salphinaa fi du’a namummaa ilma isaan nu fure. Isa 43:21, Efe1:3\n" +
                "\"Saba kana ofii kootiif uummachuun koo, akka inni na galateeffatuuf ture.\"  (Isa43: 21)\n" +
                "\"Waaqayyoof, abbaa gooftaa, keenyaa Yesus Kristos isa karaa Kristos eebba hafuuraa hundumaan, waan waaqa irraatiinis nu eebbiseef galanni haa ta'u. ‘’Efe1:3\n" +
                " SHALOM! SHALOM! SHALOM!\n" +
                "\n";
        if (na == "name1") {
            return name1;
        }
        if (na == "name2") {
            return name2;
        }
        if(na=="name3"){
            return name3;
        }
        if(na=="name4"){
            return name4;
        }
        if(na=="name5"){
            return name5;
        }
        else {

            return "no";
        }
    }
}


