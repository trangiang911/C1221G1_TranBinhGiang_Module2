package case_study.controllers;

import case_study.services.CustomerServiceImpl;
import case_study.services.EmployeeServiceImpl;
import case_study.services.FacilityServiceImpl;

import java.util.Scanner;
import java.util.regex.Pattern;

public class FuramaController {
    Scanner scanner = new Scanner(System.in);
    EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
    CustomerServiceImpl customerService = new CustomerServiceImpl();
    FacilityServiceImpl facilityService = new FacilityServiceImpl();

    public void displayMainMenu() {
        System.out.println("Main Menu");
        int choice = -1;
        do {
            System.out.println("1.\tEmployee Management\n" +
                    "2.\tCustomer Management\n" +
                    "3.\tFacility Management\n" +
                    "4.\tBooking Management\n" +
                    "5.\tPromotion Management\n" +
                    "6.\tExit");
            System.out.println("Nhập lựa chọn");
            String str=scanner.nextLine();
            while (!Pattern.matches("^[0-9]{1}",str)){
                System.out.println("Lựa chọn phải là số, mời nhập lại");
                str=scanner.nextLine();
            }
            choice = Integer.parseInt(str);
            switch (choice) {
                case 1:
                    System.out.println("1.\tDisplay list employees\n" +
                            "2.\tAdd new employee\n" +
                            "3.\tEdit employee\n" +
                            "4.\tReturn main menu\n");
                    System.out.println("Nhập lựa chọn");
                    String str1=scanner.nextLine();
                    while (!Pattern.matches("^[0-9]{1}$",str1)){
                        System.out.println("Lựa chọn phải là số nguyên, mời nhập lại");
                        str1=scanner.nextLine();
                    }
                    int choice1 = Integer.parseInt(str1);
                    switch (choice1) {
                        case 1:
                            employeeService.display();
                            break;
                        case 2:
                            employeeService.create();
                            break;
                        case 3:
                            employeeService.edit();
                        case 4:
                            break;
                        default:
                            System.out.println("Lựa chọn k hợp lệ");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("1.\tDisplay list customers\n" +
                            "2.\tAdd new customer\n" +
                            "3.\tEdit customer\n" +
                            "4.\tReturn main menu\n");
                    System.out.println("Nhập lựa chọn");
                    String str2=scanner.nextLine();
                    while (!Pattern.matches("^[0-9]{1}$",str2)){
                        System.out.println("Lựa chọn phải là số nguyên dương, mời nhập lại");
                        str2=scanner.nextLine();
                    }
                    int choice2 = Integer.parseInt(str2);
                    switch (choice2) {
                        case 1:
                            customerService.display();
                            break;
                        case 2:
                            customerService.create();
                            break;
                        case 3:
                            customerService.edit();
                        case 4:
                            break;
                        default:
                            System.out.println("Lựa chọn k hợp lệ");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("1\tDisplay list facility\n" +
                            "2\tAdd new facility\n" +
                            "3\tDisplay list facility maintenance\n" +
                            "4\tReturn main menu\n");
                    System.out.println("Nhập lựa chọn");
                    String str3=scanner.nextLine();
                    while (!Pattern.matches("^[0-9]{1}$",str3)){
                        System.out.println("Lựa chọn phải là số nguyên dương,mời nhập lại");
                        str3=scanner.nextLine();
                    }
                    int choice3 = Integer.parseInt(scanner.nextLine());
                    switch (choice3) {
                        case 1:
                            facilityService.display();
                            break;
                        case 2:
                            facilityService.create();
                            break;
                        case 3:
                            facilityService.displayMaintenance();
                            break;
                        case 4:
                            break;
                        default:
                            System.out.println("Lựa chọn k hợp lệ");
                            break;
                    }
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
        } while (choice != 6);
    }
}
