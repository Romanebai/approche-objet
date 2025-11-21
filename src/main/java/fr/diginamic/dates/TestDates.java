package fr.diginamic.dates;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDates {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("----- Date du jour sans l'heure ----");
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        String dateFormat = format.format(date);
        System.out.println(dateFormat);

        // A l'ancienne
        Date dateAutre2 = new Date(116, 04, 19, 23, 59, 30);
        SimpleDateFormat format2 = new SimpleDateFormat("yyyy/MM/dd/HH:mm:ss");
        String dateFormat3 = format2.format(dateAutre2);
        System.out.println("----- Date précise à l'ancienne formaté ----");
        System.out.println(dateFormat3);

        Date dateAutre3 = new Date();
        SimpleDateFormat format3 = new SimpleDateFormat("yyyy/MM/dd/HH:mm:ss");
        String dateFormat4 = format3.format(dateAutre3);
        System.out.println("----- Date du jour formaté ----");
        System.out.println(dateFormat4);

    }
}
