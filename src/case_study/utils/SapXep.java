package case_study.utils;

import case_study.models.Booking;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;

public class SapXep implements Comparator<Booking> {
    @Override
    public int compare(Booking o1,Booking o2){
    DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDate starDate1=LocalDate.parse(o1.getBeginDay(),dateTimeFormatter);
    LocalDate starDate2=LocalDate.parse(o2.getBeginDay(),dateTimeFormatter);
    LocalDate endDate1=LocalDate.parse(o1.getEndDay(),dateTimeFormatter);
    LocalDate endDate2=LocalDate.parse(o2.getEndDay(),dateTimeFormatter);
        if(starDate1.compareTo(starDate2)<0){
            return 1;
        }
        else if(starDate1.compareTo(starDate2)>0){
            return -1;
        }
        else {
            if (endDate1.compareTo(endDate2)<0){
                return 1;
            }
            else if(endDate1.compareTo(endDate2)>0){
                return -1;
            }
            else {
                return 0;
            }
        }
    }
}
