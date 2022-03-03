package controllers;

import java.util.Scanner;

public class FuramaController {
    Scanner scanner = new Scanner(System.in);

    public void displayMainMenu() {
        System.out.println("Main Menu");
        int choice = -1;
        do {
            System.out.println("1.Employee Management\n"+
                    "2.Customer Management\n"+
                    "3.Facility Management\n"+
                    "4.Booking Management\n"+
                    "5.Promotion Management\n"+
                    "6.Exit");
            choice=Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.println("1\tDisplay list employees\n" +
                            "2\tAdd new employee\n" +
                            "3\tEdit employee\n" +
                            "4\tReturn main menu\n");
                    break;
                case 2:
                    System.out.println("1.\tDisplay list customers\n" +
                            "2.\tAdd new customer\n" +
                            "3.\tEdit customer\n" +
                            "4.\tReturn main menu\n");
                    break;
                case 3:
                    System.out.println("1\tDisplay list facility\n" +
                            "2\tAdd new facility\n" +
                            "3\tDisplay list facility maintenance\n" +
                            "4\tReturn main menu\n");
                    break;
                case 4:
                    System.out.println("1.\tAdd new booking\n" +
                            "2.\tDisplay list booking\n" +
                            "3.\tCreate new constracts\n" +
                            "4.\tDisplay list contracts\n" +
                            "5.\tEdit contracts\n" +
                            "6.\tReturn main menu\n");
                    break;
                case 5:
                    System.out.println("1.\tDisplay list customers use service\n" +
                            "2.\tDisplay list customers get voucher\n" +
                            "3.\tReturn main menu\n");
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Lựa chọn k đúng");
                    break;
            }
        }while (choice!=6);
    }
}
