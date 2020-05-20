package com.moses.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Moses
 */
public class DateUtils {
    static SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static String format(Date date) {
        return sf.format(date);
    }

    public static Date parse(String date) throws ParseException {
        return sf.parse(date);
    }
}
