package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class DocSo {
    public static void donVi(char x) {
        switch (x) {
            case '1':
                System.out.print("one");
                break;
            case '2':
                System.out.print("two");
                break;
            case '3':
                System.out.print("three");
                break;
            case '4':
                System.out.print("for");
                break;
            case '5':
                System.out.print("five");
                break;
            case '6':
                System.out.print("six");
                break;
            case '7':
                System.out.print("seven");
                break;
            case '8':
                System.out.print("eight");
                break;
            case '9':
                System.out.print("nine");
                break;
        }
    }

    public static void hangTram(char z) {
        switch (z) {
            case '1':
                System.out.print("one hundred ");
                break;
            case '2':
                System.out.print("two hundred ");
                break;
            case '3':
                System.out.print("three hundred ");
                break;
            case '4':
                System.out.print("four hundred ");
                break;
            case '5':
                System.out.print("five hundred ");
                break;
            case '6':
                System.out.print("six hundred ");
                break;
            case '7':
                System.out.print("seven hundred ");
                break;
            case '8':
                System.out.print("eight hundred ");
                break;
            case '9':
                System.out.print("nine hundred ");
                break;
        }
    }

    public static void hangChuc(char y) {
        switch (y) {
            case '1':
                System.out.print("teen ");
                break;
            case '2':
                System.out.print("twenty ");
                break;
            case '3':
                System.out.print("thirty ");
                break;
            case '4':
                System.out.print("forty ");
                break;
            case '5':
                System.out.print("fifty ");
                break;
            case '6':
                System.out.print("sixty ");
                break;
            case '7':
                System.out.print("seventy ");
                break;
            case '8':
                System.out.print("eighty");
                break;
            case '9':
                System.out.print("ninety ");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số");
        int num = Integer.parseInt(sc.nextLine());
        switch (num) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;
            case 10:
                System.out.println("ten");
                break;
            case 11:
                System.out.println("eleven");
                break;
            case 12:
                System.out.println("twelve");
                break;
            case 13:
                System.out.println("thirteen");
                break;
            case 15:
                System.out.println("fifteen");
                break;
        }
        String s = Integer.toString(num);
        char[] arr = s.toCharArray();
        if (arr.length == 2) {
            if (arr[0] == '1' && arr[1] != '1' && arr[1] != '2' && arr[1] != '3' && arr[1] != '5' && arr[1] != '0') {
                donVi(arr[1]);
                hangChuc(arr[0]);

            } else if (arr[0] != '1') {
                hangChuc(arr[0]);
                donVi(arr[1]);
            }
        } else if (arr.length == 3) {
            if (arr[1] == '1' && arr[2] != '1' && arr[2] != '2' && arr[2] != '3' && arr[2] != '5' && arr[2] != '0') {
                hangTram(arr[0]);
                donVi(arr[2]);
                hangChuc(arr[1]);

            } else if (arr[1] != '1') {
                hangTram(arr[0]);
                hangChuc(arr[1]);
                donVi(arr[2]);
            }
        }
    }
}
