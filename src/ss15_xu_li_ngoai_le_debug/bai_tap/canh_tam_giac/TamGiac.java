package ss15_xu_li_ngoai_le_debug.bai_tap.canh_tam_giac;

import java.util.Scanner;

public class TamGiac {
    Scanner scanner = new Scanner(System.in);
    int c1;
    int c2;
    int c3;

    public void checkNhapCanh() throws IllegalTriangleException {
        System.out.println("Nhập cạnh 1");
        c1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập cạnh 2");
        c2 = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập cạnh 3");
        c3 = Integer.parseInt(scanner.nextLine());

        if(c1<=0||c2<=0||c3<=0){
            throw new IllegalTriangleException("ko phai canh tam giac");
        }
        if(c1+c2<c3){
            throw new IllegalTriangleException("ko phai tam giac");
        }
        if(c1+c3<c2){
            throw new IllegalTriangleException("ko phai tam giac");
        }
        if(c2+c3<c1){
            throw new IllegalTriangleException("ko phai tam giac");
        }
        System.out.println("ct kết thuc");
    }

    public static void main(String[] args)  {
        TamGiac tamGiac=new TamGiac();
        try {
            tamGiac.checkNhapCanh();
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }
    }
}


