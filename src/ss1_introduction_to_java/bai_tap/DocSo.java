package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class DocSo {
    public static void donVi(char x){
        switch (x) {
            case '1':
                System.out.println("Một");
                break;
            case '2':
                System.out.println("hai");
                break;
            case '3':
                System.out.println("ba");
                break;
            case '4':
                System.out.println("bốn");
                break;
            case '5':
                System.out.println("Năm");
                break;
            case '6':
                System.out.println("Sáu");
                break;
            case '7':
                System.out.println("Bảy");
                break;
            case '8':
                System.out.println("Tám");
                break;
            case '9':
                System.out.println("Chín");
                break;
        }
    }
    public static void hangTram(char z){
        switch (z) {
            case '1':
                System.out.print("Một trăm ");
                break;
            case '2':
                System.out.print("hai trăm ");
                break;
            case '3':
                System.out.print("ba trăm ");
                break;
            case '4':
                System.out.print("bốn trăm ");
                break;
            case '5':
                System.out.print("Năm trăm ");
                break;
            case '6':
                System.out.print("Sáu trăm ");
                break;
            case '7':
                System.out.print("Bảy trăm ");
                break;
            case '8':
                System.out.print("Tám trăm ");
                break;
            case '9':
                System.out.print("Chín trăm ");
                break;
    }}
    public static void hangChuc(char y){
        switch (y) {
            case '1':
                System.out.print("Mười");
                break;
            case '2':
                System.out.print("Hai mươi ");
                break;
            case '3':
                System.out.print("ba mươi ");
                break;
            case '4':
                System.out.print("bốn mươi ");
                break;
            case '5':
                System.out.print("Năm mươi ");
                break;
            case '6':
                System.out.print("Sáu mươi ");
                break;
            case '7':
                System.out.print("Bảy mươi ");
                break;
            case '8':
                System.out.print("Tám mươi ");
                break;
            case '9':
                System.out.print("Chín mươi ");
                break;
    }}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số");
        int num = Integer.parseInt(sc.nextLine());
        switch (num) {
            case 1:
                System.out.println("Một");
                break;
            case 2:
                System.out.println("hai");
                break;
            case 3:
                System.out.println("ba");
                break;
            case 4:
                System.out.println("bốn");
                break;
            case 5:
                System.out.println("Năm");
                break;
            case 6:
                System.out.println("Sáu");
                break;
            case 7:
                System.out.println("Bảy");
                break;
            case 8:
                System.out.println("Tám");
                break;
            case 9:
                System.out.println("Chín");
                break;
        }
        String s = Integer.toString(num);
        char[] arr = s.toCharArray();
        if (arr.length == 2) {
                hangChuc(arr[0]);
                donVi(arr[1]);
        }
        else if(arr.length==3){
            hangTram(arr[0]);
            hangChuc(arr[1]);
            donVi(arr[2]);
        }
    }
}

