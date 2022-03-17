package case_study.services;

import case_study.models.Facility;
import case_study.models.House;
import case_study.models.Room;
import case_study.models.Villa;
import case_study.utils.ReadAndWrite;
import case_study.utils.Regex;

import java.util.*;

public class FacilityServiceImpl implements IFacilityService {
    Scanner scanner = new Scanner(System.in);
    private static List<Villa> villaList = new ArrayList<>();
    private static List<House> housesList = new ArrayList<>();
    private static List<Room> roomList = new ArrayList<>();
    private static Map<Facility, Integer> listFacility = new LinkedHashMap<>();

    static {
        List<String> villaList1 = ReadAndWrite.read("src\\case_study\\data\\villa.csv");
        List<String> houseList1 = ReadAndWrite.read("src\\case_study\\data\\house.csv");
        List<String> roomList1 = ReadAndWrite.read("src\\case_study\\data\\room.csv");
        String[] arr1;
        String[] arr2;
        String[] arr3;
        for (int i = 0; i < villaList1.size(); i++) {
            arr1 = villaList1.get(i).split(",");
            Villa villa = new Villa(arr1[0], arr1[1], Integer.parseInt(arr1[2]), Double.parseDouble(arr1[3]), Integer.parseInt(arr1[4]), arr1[5], arr1[6], Integer.parseInt(arr1[7]), Integer.parseInt(arr1[8]));
            villaList.add(villa);
        }
        for (int i = 0; i <houseList1.size() ; i++) {
            arr2 =houseList1.get(i).split(",");
            House house=new House(arr2[0],arr2[1],Integer.parseInt(arr2[2]),Double.parseDouble(arr2[3]),Integer.parseInt(arr2[4]),arr2[5],arr2[6],Integer.parseInt(arr2[7]));
            housesList.add(house);
        }
        for (int i = 0; i < roomList1.size() ; i++) {
            arr3=roomList1.get(i).split(",");
            Room room=new Room(arr3[0],arr3[1],Integer.parseInt(arr3[2]),Double.parseDouble(arr3[3]),Integer.parseInt(arr3[4]),arr3[5],arr3[5]);
        }
    }

    @Override
    public void create() {
        System.out.println("Chọn loại phòng cần thêm");
        System.out.println("1. Add new Villa\n" +
                "2. Add new House\n" +
                "3. Add new Room\n" +
                "4. Back to Menu");
        System.out.println("Nhập lựa chọn");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                System.out.println("Nhập mã dịch vụ (SVVL-YYYY)");
                String maDichVu = scanner.nextLine();
                while (!Regex.checkRegexVilla(maDichVu)) {
                    System.out.println("Mã dịch vụ ko hợp lệ mời nhập lại (SVVL-YYYY)");
                    maDichVu = scanner.nextLine();
                }
                System.out.println("Nhập tên dịch vụ");
                String tenDichVu = scanner.nextLine();
                while (!Regex.checkRegexTenDichVu(tenDichVu)) {
                    System.out.println("Tên dịch vụ cần chữ đầu tiên viết hoa còn lại viết thường, mời nhập lại");
                    tenDichVu = scanner.nextLine();
                }
                System.out.println("Nhập diện tích sử dụng");
                int dienTich = Integer.parseInt(scanner.nextLine());
                while (!Regex.checkRegexDienTichVaBeBoi(dienTich)) {
                    System.out.println("Diện tích sử dụng ko hợp lệ phải lớn hơn 30");
                    dienTich = Integer.parseInt(scanner.nextLine());
                }
                System.out.println("Nhập giá thuê");
                double giaThue = Double.parseDouble(scanner.nextLine());
                while (!Regex.checkChiPhiThue(giaThue)) {
                    System.out.println("Giá thuê là số nguyên dương, mời nhập lại");
                    giaThue = Double.parseDouble(scanner.nextLine());
                }
                System.out.println("Nhập số lương người tối đa");
                int sLToiDa = Integer.parseInt(scanner.nextLine());
                while (!Regex.checkSLNguoi(sLToiDa)) {
                    System.out.println("Số lương người nhập vào ko hợp lệ mời nhập lại");
                    sLToiDa = Integer.parseInt(scanner.nextLine());
                }
                System.out.println("Chọn kiểu thuê");
                String kieuThue = kieuThue();
                System.out.println("Nhập tiêu chuẩn phòng");
                String tieuChuan = scanner.nextLine();
                while (!Regex.checkRegexTenDichVu(tieuChuan)) {
                    System.out.println("Tiêu chuẩn phòng k hợp lệ, ký từ đầu tiên viết hoá mời nhập lại");
                    tieuChuan = scanner.nextLine();
                }
                System.out.println("Nhập Diện tích bể bơi");
                int dienTichBeBoi = Integer.parseInt(scanner.nextLine());
                while (!Regex.checkRegexDienTichVaBeBoi(dienTichBeBoi)) {
                    System.out.println("Diện tích bể bơi ko hợp lệ mời nhập lại");
                    dienTichBeBoi = Integer.parseInt(scanner.nextLine());
                }
                System.out.println("Nhập số tầng");
                int soTang = Integer.parseInt(scanner.nextLine());
                while (!Regex.checkSoTang(soTang)) {
                    System.out.println("Số tần ko hợp lệ mời nhập lại");
                    soTang = Integer.parseInt(scanner.nextLine());
                }
                Villa villa = new Villa(maDichVu, tenDichVu, dienTich, giaThue, sLToiDa, kieuThue, tieuChuan, dienTichBeBoi, soTang);
                listFacility.put(villa, 0);
                villaList.add(villa);
                ReadAndWrite.write("src\\case_study\\data\\villa.csv", villaList, false);
                break;
            case 2:
                System.out.println("Nhập mã dịch vụ (SVHO-YYYY)");
                String maDichVuHouse = scanner.nextLine();
                while (!Regex.checkRegexHouse(maDichVuHouse)) {
                    System.out.println("Mã dịch vụ ko hợp lệ (SVHO-YYYY)");
                    maDichVuHouse = scanner.nextLine();
                }
                System.out.println("Nhập tên dịch vụ");
                String tenDichVuHouse = scanner.nextLine();
                while (!Regex.checkRegexTenDichVu(tenDichVuHouse)) {
                    System.out.println("Tên dịch vụ cần chữ đầu tiên viết hoa còn lại viết thường, mời nhập lại");
                    tenDichVuHouse = scanner.nextLine();
                }
                System.out.println("Nhập diện tích sử dụng");
                int dienTichHouse = Integer.parseInt(scanner.nextLine());
                while (!Regex.checkRegexDienTichVaBeBoi(dienTichHouse)) {
                    System.out.println("Diện tích sử dụng ko hợp lệ phải lớn hơn 30");
                    dienTichHouse = Integer.parseInt(scanner.nextLine());
                }
                System.out.println("Nhập giá thuê");
                double giaThueHouse = Double.parseDouble(scanner.nextLine());
                while (!Regex.checkChiPhiThue(giaThueHouse)) {
                    System.out.println("Giá thuê là số nguyên dương, mời nhập lại");
                    giaThueHouse = Double.parseDouble(scanner.nextLine());
                }
                System.out.println("Nhập số lương người tối đa");
                int sLToiDaHouse = Integer.parseInt(scanner.nextLine());
                while (!Regex.checkSLNguoi(sLToiDaHouse)) {
                    System.out.println("Số lương người nhập vào ko hợp lệ mời nhập lại");
                    sLToiDaHouse = Integer.parseInt(scanner.nextLine());
                }
                System.out.println("Chọn kiểu thuê");
                String kieuThueHouse = kieuThue();
                System.out.println("Nhập tiêu chuẩn phòng");
                String tieuChuanHouse = scanner.nextLine();
                while (!Regex.checkRegexTenDichVu(tieuChuanHouse)) {
                    System.out.println("Tiêu chuẩn phòng k hợp lệ, ký từ đầu tiên viết hoá mời nhập lại");
                    tieuChuanHouse = scanner.nextLine();
                }
                System.out.println("Nhập số tầng");
                int soTangHouse = Integer.parseInt(scanner.nextLine());
                while (!Regex.checkSoTang(soTangHouse)) {
                    System.out.println("Số tần ko hợp lệ mời nhập lại");
                    soTangHouse = Integer.parseInt(scanner.nextLine());
                }
                House house = new House(maDichVuHouse, tenDichVuHouse, dienTichHouse, giaThueHouse, sLToiDaHouse, kieuThueHouse, tieuChuanHouse, soTangHouse);
                housesList.add(house);
                listFacility.put(house, 0);
                ReadAndWrite.write("src\\case_study\\data\\house.csv", housesList, false);
                break;
            case 3:
                System.out.println("Nhập mã dịch vụ (SVRO-YYYY)");
                String maDichVuRoom = scanner.nextLine();
                while (!Regex.checkRegexRoom(maDichVuRoom)) {
                    System.out.println("Mã dịch vụ ko hợp lệ mời nhập lại");
                    maDichVuRoom = scanner.nextLine();
                }
                System.out.println("Nhập tên dịch vụ");
                String tenDichVuRoom = scanner.nextLine();
                while (!Regex.checkRegexTenDichVu(tenDichVuRoom)) {
                    System.out.println("Tên dịch vụ cần chữ đầu tiên viết hoa còn lại viết thường, mời nhập lại");
                    tenDichVuRoom = scanner.nextLine();
                }
                System.out.println("Nhập diện tích sử dụng");
                int dienTichRoom = Integer.parseInt(scanner.nextLine());
                while (!Regex.checkRegexDienTichVaBeBoi(dienTichRoom)) {
                    System.out.println("Diện tích sử dụng ko hợp lệ phải lớn hơn 30");
                    dienTichRoom = Integer.parseInt(scanner.nextLine());
                }
                System.out.println("Nhập giá thuê");
                double giaThueRoom = Double.parseDouble(scanner.nextLine());
                while (!Regex.checkChiPhiThue(giaThueRoom)) {
                    System.out.println("Giá thuê là số nguyên dương, mời nhập lại");
                    giaThueRoom = Double.parseDouble(scanner.nextLine());
                }
                System.out.println("Nhập số lương người tối đa");
                int sLToiDaRoom = Integer.parseInt(scanner.nextLine());
                while (!Regex.checkSLNguoi(sLToiDaRoom)) {
                    System.out.println("Số lương người nhập vào ko hợp lệ mời nhập lại");
                    sLToiDaRoom = Integer.parseInt(scanner.nextLine());
                }
                System.out.println("Chọn kiểu thuê");
                String kieuThueRoom = kieuThue();
                System.out.println("Nhập dịch vụ miễn phí đi kèm");
                String dichVuFree = scanner.nextLine();
                Room room = new Room(maDichVuRoom, tenDichVuRoom, dienTichRoom, giaThueRoom, sLToiDaRoom, kieuThueRoom, dichVuFree);
                roomList.add(room);
                listFacility.put(room, 0);
                ReadAndWrite.write("src\\case_study\\data\\room.csv", roomList, false);
                break;
        }
    }

    @Override
    public void display() {
        ReadAndWrite.read("src\\case_study\\data\\villa.csv");
        ReadAndWrite.read("src\\case_study\\data\\house.csv");
        ReadAndWrite.read("src\\case_study\\data\\room.csv");
        System.out.println("====VILLA====");
        for (Villa element : villaList) {
            System.out.println(element.toStringRead());
        }
        System.out.println("");
        System.out.println("====HOUSE====");
        for (House element : housesList) {
            System.out.println(element.toStringRead());
        }
        System.out.println("");
        System.out.println("====ROOM====");
        for (Room element : roomList) {
            System.out.println(element.toStringRead());
        }
    }


    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }

    @Override
    public String kieuThue() {
        List<String> stringList = new ArrayList<>();
        stringList.add("Theo năm");
        stringList.add("Theo tháng");
        stringList.add("Theo ngày");
        stringList.add("Theo giờ");
        System.out.println("1. Thuê theo năm\n" +
                "2. Thuê theo tháng\n" +
                "3. Thuê theo ngày\n" +
                "4. Thuê theo giờ");
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
            default:
                System.out.println("Lựa chọn k hợp lệ");
                return null;

        }
    }

    @Override
    public void displayMaintenance() {
        ReadAndWrite.read("src\\case_study\\data\\villa.csv");
        ReadAndWrite.read("src\\case_study\\data\\house.csv");
        ReadAndWrite.read("src\\case_study\\data\\room.csv");
        for (Map.Entry<Facility, Integer> entry : listFacility.entrySet()) {
            if (entry.getValue() >= 5) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }
    }


}
