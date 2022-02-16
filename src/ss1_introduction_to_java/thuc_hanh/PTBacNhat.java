package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;
public class PTBacNhat {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a: ");
        float a=sc.nextFloat();
        System.out.println("Enter b: ");
        float b=sc.nextFloat();
        System.out.println("Enter c: ");
        float c=sc.nextFloat();
        if(a!=0){
            Float x=(c-b)/a;
            System.out.println("Gia tri cua x: "+x);
        }
        else{
            if(b==c){
                System.out.println("pt vo so nghiem");
            }
            else{
                System.out.println("pt vo nghiem");
            }
        }
    }
}
