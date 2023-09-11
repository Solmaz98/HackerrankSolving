package Introduction;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class FindWeekDayFromString {
//    public static void main(String[] args) {
//        System.out.println(findDay(8 ,5 ,2015));
//    }


    public static String findDay(int month, int day, int year) {
        SimpleDateFormat ft = new SimpleDateFormat ("MM-dd-yyyy" , Locale.ENGLISH);

        String input = month + "-" + day + "-" + year;
        Date t=null;
        try {
            t = ft.parse(input);
        } catch (ParseException e) {
            System.out.println("Unparseable using " + ft);
        }

        String weekOfDay = null;
        Calendar cal = Calendar.getInstance();
        //cal.setTimeZone(TimeZone.getTimeZone("GMT"));
        cal.setTime(t);

        int weekDate = cal.get(Calendar.DAY_OF_WEEK);
        switch (weekDate){
            case 2:
                weekOfDay = "MONDAY";
                break;
            case 3:
                weekOfDay = "TUESDAY";
                break;
            case 4:
                weekOfDay = "WEDNESDAY";
                break;
            case 5:
                weekOfDay = "THURSDAY";
                break;
            case 6:
                weekOfDay = "FRIDAY";
                break;
            case 7:
                weekOfDay = "SATURDAY";
                break;
            case 1:
                weekOfDay = "SUNDAY";
                break;
        }


        return weekOfDay;
    }
}
