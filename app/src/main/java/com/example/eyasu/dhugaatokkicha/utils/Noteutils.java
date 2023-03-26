package com.example.eyasu.dhugaatokkicha.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by EYASU on 9/16/2019.
 */

public class Noteutils {
    public static String dataFromLong(Long time){
        DateFormat format=new SimpleDateFormat("EEE, dd XXX yyy 'at' hh:mm aaa", Locale.US);

return format.format(new Date(time));
    }
}
