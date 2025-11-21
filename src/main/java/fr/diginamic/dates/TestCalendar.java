package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {
    public static void main(String[] args) {

        System.out.println("--------- Date précise formaté --------");
        Calendar cal = Calendar.getInstance();
        cal.set(2016, 04, 19, 23, 59, 30 ); // une date qu'on crée
        Date dateNow = cal.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dateFormat = sdf.format(dateNow);
        System.out.println(dateFormat);

        System.out.println("--------- Date du jour formaté --------");
        Calendar cal2 = Calendar.getInstance();
        Date dateNow2 = cal2.getTime();
        //SimpleDateFormat sdf2 = new SimpleDateFormat("EEEE yyyy/ MMMM MM/ dd/HH:mm:ss", Locale.CHINA);
        //SimpleDateFormat sdf2 = new SimpleDateFormat("EEEE yyyy/ MMMM MM/ dd/HH:mm:ss", Locale.FRANCE);
        //SimpleDateFormat sdf2 = new SimpleDateFormat("EEEE yyyy/ MMMM MM/ dd/HH:mm:ss", Locale.GERMAN);
        SimpleDateFormat sdf2 = new SimpleDateFormat("EEEE yyyy/ MMMM MM/ dd/HH:mm:ss", new Locale("ru", "RU")
        );



        String dateFormat2 = sdf2.format(dateNow2);
        System.out.println(dateFormat2);


        //cal.set(Calendar.YEAR, 2014); // pour changer le mois



    }
}
