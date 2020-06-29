package cn.ascending.test02;

//Java does not have a built-in Date class, import package to work with the date and time
//this package includes many date and time classes(LocalDate, LocalTime, LocalDateTime, DateTimeFormatter)
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        //old way
        Date d1=new Date();
        System.out.println("Current date is "+d1);

        //use to show the record create time
        System.out.println(LocalDate.now());//only date
        System.out.println(LocalTime.now());//only time
        System.out.println(LocalDateTime.now());//data+time

        //format the date
        LocalDateTime ldt=LocalDateTime.now();
        System.out.println("before formatting "+ldt);
        DateTimeFormatter dateFormat=DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");//set the format
        String fldt=ldt.format(dateFormat);
        System.out.println("after formatting "+fldt);
//
//        ZonedDateTime dc=ZonedDateTime.now();
//        System.out.println(dc);
//
//        ZoneId swissZone=ZoneId.of("Europe/Zurich");
//
//        System.out.println(ZonedDateTime.now().toLocalDateTime());
//
//        //Date object convert to String
//
//        //String convert to Date object
//
//        //project
//        LocalDate ld=new LocalDate();

        //difference server(CHina, USA), their time should be UTC TIME

        //period,

    }
}
