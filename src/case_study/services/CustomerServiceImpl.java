package case_study.services;

import case_study.models.Customer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements ICustomerService {
    Scanner scanner = new Scanner(System.in);
    private static List<Customer> customerList = new LinkedList<>();

    static {

    }

    @Override
    public void create() {
        System.out.println("Nhập tên khách hàng");
        String nameKhach = scanner.nextLine();
        System.out.println("Nhập ngày tháng năm sinh khách hàng");
        String birthKhach = scanner.nextLine();
        System.out.println("Nhập giới tính khách hàng");
        String genderKhach = scanner.nextLine();
        System.out.println("Nhập cmnd (hoặc căn cước) của khách");
        String cmndKhach = scanner.nextLine();
        System.out.println("Nhập email của khách");
        String emailKhach = scanner.nextLine();
        System.out.println("Nhập số điện thoại của khách");
        String sdtKhach = scanner.nextLine();
        System.out.println("Chọn loại khách hàng");
        String loaiKhach = loaiCustomer();
        System.out.println("Nhập mã khách hàng");
        String maKhach = scanner.nextLine();
        System.out.println("Nhập địa chỉ của khách hàng");
        String daiChiKhach = scanner.nextLine();
        customerList.add(new Customer(nameKhach, birthKhach, genderKhach, cmndKhach, emailKhach, sdtKhach, loaiKhach, maKhach, daiChiKhach));
    }

    @Override
    public void display() {
        for (Customer element : customerList) {
            System.out.println(element);
        }
    }

    @Override
    public void edit() {
        System.out.println("Nhập mã khách hàng cần chỉnh sửa");
        String maKhachEdit = scanner.nextLine();
        for (int i = 0; i < customerList.size(); i++) {
            String choice1=null;
            do {
                if (customerList.get(i).getMaKhachHang().equals(maKhachEdit)) {
                    System.out.println("Lựa chọn thông tin cần chỉnh sủa");
                    System.out.println("1. Chỉnh sửa tên\n" +
                            "2. Chỉnh sửa ngày tháng năm sinh\n" +
                            "3. Chỉnh sửa giới tính\n" +
                            "4. Chỉnh sửa số cmnd(căn cước)\n" +
                            "5. Chỉnh sửa mã khách hàng\n" +
                            "6. Chỉnh sửa email khách hàng\n" +
                            "7. Chỉnh sửa số đt khách hàng\n" +
                            "8. Chỉnh sửa loại khách hàng\n" +
                            "9. Chỉnh sửa địa chỉ khách hàng\n");
                    System.out.println("Nhạp lựa chòn");
                    int choice=Integer.parseInt(scanner.nextLine());
                    switch (choice){
                        case 1:
                            System.out.println("Nhập tên mới của khách hàng");
                            String nameEdit=scanner.nextLine();
                            customerList.get(i).setName(nameEdit);
                            break;
                        case 2:
                            System.out.println("Nhập ngày tháng năm sinh mới của khách hàng");
                            String birthEdit=scanner.nextLine();
                            customerList.get(i).setDateOfbirth(birthEdit);
                            break;
                        case 3:
                            System.out.println("Nhập giới tính mới của khách");
                            String genderEdit=scanner.nextLine();
                            customerList.get(i).setGender(genderEdit);
                            break;
                        case 4:
                            System.out.println("Nhập số cmnd (căn cước) mới của khách");
                            String cmndEdit=scanner.nextLine();
                            customerList.get(i).setIdentityCard(cmndEdit);
                            break;
                        case 5:
                            System.out.println("Nhập mã khách hàng mới của khách");
                            String maKhachHangEdit=scanner.nextLine();
                            customerList.get(i).setMaKhachHang(maKhachHangEdit);
                            break;
                        case 6:
                            System.out.println("Nhập email mới của khách");
                            String emailEdit=scanner.nextLine();
                            customerList.get(i).setEmail(emailEdit);
                            break;
                        case 7:
                            System.out.println("Nhập sđt mới của khách");
                            String sđtEdit=scanner.nextLine();
                            customerList.get(i).setsĐT(sđtEdit);
                            break;
                        case 8:
                            System.out.println("Chọn loại khách hàng mới cho khách");
                            String loaiKhachEdit=loaiCustomer();
                            customerList.get(i).setLoaiKhach(loaiKhachEdit);
                            break;
                        case 9:
                            System.out.println("Nhập địa chỉ mới của khách");
                            String diaChiEdit=scanner.nextLine();
                            customerList.get(i).setDiaChi(diaChiEdit);
                            break;
                        default:
                            System.out.println("Lựa chọn ko hợp lệ");
                            break;
                    }
                }
                System.out.println("Bạn có muốn tiếp tục chỉnh sửa khách hàng này");
                choice1=scanner.nextLine();
            } while ("yes".equals(choice1));
        }
    }

    @Override
    public void delete() {

    }

    @Override
    public String loaiCustomer() {
        List<String> stringList = new ArrayList<>();
        stringList.add("Diamond");
        stringList.add("Platinium");
        stringList.add("Gold");
        stringList.add("Silver");
        stringList.add("Member");
        System.out.println("1. Diamond\n" +
                "2. Platinium\n" +
                "3. Gold\n" +
                "4. Silver\n" +
                "5. Member");
        System.out.println("Nhập lựa chọn");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                return stringList.get(0);
            case 2:
                return stringList.get(1);
            case 3:
                return stringList.get(2);
            case 4:
                return stringList.get(3);
            case 5:
                return stringList.get(4);
            default:
                System.out.println("Lựa chọn k hợp lệ");
                return null;
        }
    }
}
