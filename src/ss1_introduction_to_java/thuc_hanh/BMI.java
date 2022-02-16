package ss1_introduction_to_java.thuc_hanh;
import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập cân nặng(kg): ");
        double weight=Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập chiều cao(met): ");
        double height=Double.parseDouble(scanner.nextLine());
        double bmi=weight/Math.pow(height,2);
        if(bmi<18){
            System.out.println("underweight");
        }
        else if(bmi<25.0){
            System.out.println("Normal");
        }
        else if(bmi<30.0){
            System.out.println("overweight");
        }
        else {
            System.out.println("obese");
        }
    }
}
