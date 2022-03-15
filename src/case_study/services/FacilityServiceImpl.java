package case_study.services;

import case_study.models.Facility;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements IFacilityService{
    Scanner scanner=new Scanner(System.in);
    private static Map<String,Integer> list=new LinkedHashMap<>();

    @Override
    public void create() {
        System.out.println("Chọn loại phòng cần thêm");
        System.out.println("1. Add new Villa\n" +
                "2. Add new House\n" +
                "3. Add new Room\n" +
                "4. Back to Menu");
        System.out.println("Nhập lựa chọn");
        int choice=Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                System.out.println("Nhập tên dịch");
                String tenDichVu=scanner.nextLine();
                System.out.println("Nhập diện tích sử dụng");
                double dienTich=Double.parseDouble(scanner.nextLine());
        }
    }

    @Override
    public void display() {

    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }
}
