package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;
public class OpreratorExp {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter wight: ");
        float wight=scanner.nextFloat();
        System.out.println("Enter hight");
        float hight=scanner.nextFloat();
        float area=wight*hight;
        System.out.println(area);

    }
}
