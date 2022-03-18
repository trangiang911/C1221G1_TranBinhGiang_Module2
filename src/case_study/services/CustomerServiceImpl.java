package case_study.services;

import case_study.models.Customer;
import case_study.utils.ReadAndWrite;
import case_study.utils.Regex;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements ICustomerService {
    Scanner scanner = new Scanner(System.in);
    private static final List<Customer> CUSTOMER_LIST = new LinkedList<>();

    static {
        List<String> stringList = ReadAndWrite.read("src\\case_study\\data\\customer.csv");
        String[] arr;
        for (String s : stringList) {
            if (!s.isEmpty()) {
                arr = s.split(",");
                Customer customer = new Customer(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], arr[8]);
                CUSTOMER_LIST.add(customer);
            }
        }
    }

    @Override
    public void create() {
        System.out.println("Nhập tên khách hàng");
        String nameKhach = scanner.nextLine();
        while (!Regex.checkTen(nameKhach)){
            System.out.println("Tên khách k đúng format, mời nhập lại");
            nameKhach=scanner.nextLine();
        }
        System.out.println("Nhập ngày tháng năm sinh khách hàng");
        String birthKhach = scanner.nextLine();
        while (!Regex.checkNgaySinh(birthKhach)){
            System.out.println("Ngày sinh k đúng mời nhập lại");
            birthKhach=scanner.nextLine();
        }
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
        CUSTOMER_LIST.add(new Customer(nameKhach, birthKhach, genderKhach, cmndKhach, emailKhach, sdtKhach, loaiKhach, maKhach, daiChiKhach));
        ReadAndWrite.writeForPerson("src\\case_study\\data\\customer.csv", CUSTOMER_LIST, false);
    }

    @Override
    public void display() {
        for (Customer element : CUSTOMER_LIST) {
            System.out.println(element.toString());
        }
    }

    @Override
    public void edit() {
        System.out.println("Nhập mã khách hàng cần chỉnh sửa");
        String maKhachEdit = scanner.nextLine();
        for (Customer customer : CUSTOMER_LIST) {
            String choice1;
            do {
                if (customer.getMaKhachHang().equals(maKhachEdit)) {
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
                    int choice = Integer.parseInt(scanner.nextLine());
                    boolean flag;
                    do {
                        flag = false;
                        try {
                            switch (choice) {
                                case 1:
                                    System.out.println("Nhập tên mới của khách hàng");
                                    String nameEdit = scanner.nextLine();
                                    customer.setName(nameEdit);
                                    break;
                                case 2:
                                    System.out.println("Nhập ngày tháng năm sinh mới của khách hàng");
                                    String birthEdit = scanner.nextLine();
                                    customer.setDateOfbirth(birthEdit);
                                    break;
                                case 3:
                                    System.out.println("Nhập giới tính mới của khách");
                                    String genderEdit = scanner.nextLine();
                                    customer.setGender(genderEdit);
                                    break;
                                case 4:
                                    System.out.println("Nhập số cmnd (căn cước) mới của khách");
                                    String cmndEdit = scanner.nextLine();
                                    customer.setIdentityCard(cmndEdit);
                                    break;
                                case 5:
                                    System.out.println("Nhập mã khách hàng mới của khách");
                                    String maKhachHangEdit = scanner.nextLine();
                                    customer.setMaKhachHang(maKhachHangEdit);
                                    break;
                                case 6:
                                    System.out.println("Nhập email mới của khách");
                                    String emailEdit = scanner.nextLine();
                                    customer.setEmail(emailEdit);
                                    break;
                                case 7:
                                    System.out.println("Nhập sđt mới của khách");
                                    String sdtEdit = scanner.nextLine();
                                    customer.setsĐT(sdtEdit);
                                    break;
                                case 8:
                                    System.out.println("Chọn loại khách hàng mới cho khách");
                                    String loaiKhachEdit = loaiCustomer();
                                    customer.setLoaiKhach(loaiKhachEdit);
                                    break;
                                case 9:
                                    System.out.println("Nhập địa chỉ mới của khách");
                                    String diaChiEdit = scanner.nextLine();
                                    customer.setDiaChi(diaChiEdit);
                                    break;
                                default:
                                    System.out.println("Lựa chọn ko hợp lệ");
                                    break;
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                            flag = true;
                        }
                    } while (flag);
                }
                System.out.println("Bạn có muốn tiếp tục chỉnh sửa khách hàng này");
                choice1 = scanner.nextLine();
            } while ("yes".equals(choice1));
        }
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
