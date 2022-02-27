package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;
public class DayOfMonth {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter month: ");
        int month=sc.nextInt();
        String dayInMonth;
        switch(month){
            case 2:
            dayInMonth="28 or 29 days";
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
            dayInMonth="31 days";
            break;
            case 4:
            case 6:
            case 9:
            case 11:
            dayInMonth="30days";
            break;
            default:
            dayInMonth="";
            break;
        }
        if(!dayInMonth.equals("")){
            System.out.printf("The month %d has %s day!", month,dayInMonth);
        }
        else{
            System.out.println("Invalid input");
        }
    }
}
