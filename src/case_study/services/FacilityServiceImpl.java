package case_study.services;

import case_study.models.Facility;
import case_study.models.House;
import case_study.models.Room;
import case_study.models.Villa;
import case_study.utils.ReadAndWrite;
import case_study.utils.Regex;

import java.util.*;
import java.util.regex.Pattern;

public class FacilityServiceImpl implements IFacilityService {
    Scanner scanner = new Scanner(System.in);
    private static final List<Villa> VILLAS = new ArrayList<>();
    private static final List<House> HOUSE_LIST = new ArrayList<>();
    private static final List<Room> ROOM_LIST = new ArrayList<>();
    private static final Map<Facility, Integer> listFacility = new LinkedHashMap<>();

    static {
        List<String> villaList1 = ReadAndWrite.read("src\\case_study\\data\\villa.csv");
        List<String> houseList1 = ReadAndWrite.read("src\\case_study\\data\\house.csv");
        List<String> roomList1 = ReadAndWrite.read("src\\case_study\\data\\room.csv");
        String[] arr1;
        String[] arr2;
        String[] arr3;
        for (String item : villaList1) {
            if (!item.isEmpty()) {
                arr1 = item.split(",");
                Villa villa = new Villa(arr1[0], arr1[1], Integer.parseInt(arr1[2]), Double.parseDouble(arr1[3]), Integer.parseInt(arr1[4]), arr1[5], arr1[6], Integer.parseInt(arr1[7]), Integer.parseInt(arr1[8]));
                VILLAS.add(villa);
            }
        }
        for (String value : houseList1) {
            if (!value.isEmpty()) {
                arr2 = value.split(",");
                House house = new House(arr2[0], arr2[1], Integer.parseInt(arr2[2]), Double.parseDouble(arr2[3]), Integer.parseInt(arr2[4]), arr2[5], arr2[6], Integer.parseInt(arr2[7]));
                HOUSE_LIST.add(house);
            }
        }
        for (String s : roomList1) {
            if (!s.isEmpty()) {
                arr3 = s.split(",");
                Room room = new Room(arr3[0], arr3[1], Integer.parseInt(arr3[2]), Double.parseDouble(arr3[3]), Integer.parseInt(arr3[4]), arr3[5], arr3[5]);
                ROOM_LIST.add(room);
            }
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
        String str=scanner.nextLine();
        while (!Pattern.matches("^[0-9]$",str)){
            System.out.println("Lựa chọn k hợp lệ mời nhập lại");
            str=scanner.nextLine();
        }
        int choice = Integer.parseInt(str);
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
                String str1 = scanner.nextLine();
                while (!Regex.checkRegexDienTichVaBeBoi(str1)) {
                    System.out.println("Diện tích sử dụng ko hợp lệ");
                    str1 = scanner.nextLine();
                }
                int dienTich = Integer.parseInt(str1);
                while (dienTich < 30) {
                    System.out.println("Diện tích phải lớn hơn 30");
                    str1 = scanner.nextLine();
                    while (!Regex.checkRegexDienTichVaBeBoi(str1)) {
                        System.out.println("Diện tích sử dụng ko hợp lệ");
                        str1 = scanner.nextLine();
                    }
                    dienTich = Integer.parseInt(str1);
                }
                System.out.println("Nhập giá thuê");
                String str2 = scanner.nextLine();
                while (!Regex.checkChiPhiThue(str2)) {
                    System.out.println("ko hợp lệ mời nhập lại");
                    str2 = scanner.nextLine();
                }
                double giaThue = Double.parseDouble(str2);
                while (giaThue < 0) {
                    System.out.println("Giá thuê phải dương mời nhập lại");
                    str2 = scanner.nextLine();
                    while (!Regex.checkChiPhiThue(str2)) {
                        System.out.println("ko hợp lệ mời nhập lại");
                        str2 = scanner.nextLine();
                    }
                    giaThue = Double.parseDouble(str2);
                }
                System.out.println("Nhập số lương người tối đa");
                String str3 = scanner.nextLine();
                while (!Regex.checkSLNguoi(str3)) {
                    System.out.println("Số lương người nhập vào ko hợp lệ mời nhập lại");
                    str3 = scanner.nextLine();
                }
                int sLToiDa = Integer.parseInt(str3);
                while (sLToiDa < 0 || sLToiDa > 20) {
                    System.out.println("Số lượng người ko hợp lệ");
                    str3 = scanner.nextLine();
                    while (!Regex.checkSLNguoi(str3)) {
                        System.out.println("Số lương người nhập vào ko hợp lệ mời nhập lại");
                        str3 = scanner.nextLine();
                    }
                    sLToiDa = Integer.parseInt(str3);
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
                String str4 = scanner.nextLine();
                while (!Regex.checkRegexDienTichVaBeBoi(str4)) {
                    System.out.println("Diện tích bể bơi ko hợp lệ mời nhập lại");
                    str4 = scanner.nextLine();
                }
                int dienTichBeBoi = Integer.parseInt(str4);
                while (dienTichBeBoi < 30) {
                    System.out.println("Diện tích bể bơi phảo lớn hơn 30");
                    str4 = scanner.nextLine();
                    while (!Regex.checkRegexDienTichVaBeBoi(str4)) {
                        System.out.println("Diện tích bể bơi ko hợp lệ mời nhập lại");
                        str4 = scanner.nextLine();
                    }
                    dienTichBeBoi = Integer.parseInt(str4);
                }
                System.out.println("Nhập số tầng");
                String str5 = scanner.nextLine();
                while (!Regex.checkSoTang(str5)) {
                    System.out.println("Số tần ko hợp lệ mời nhập lại");
                    str5 = scanner.nextLine();
                }
                int soTang = Integer.parseInt(str5);
                while (soTang < 0) {
                    System.out.println("Số tầng phải là số dương");
                    str5 = scanner.nextLine();
                    while (!Regex.checkSoTang(str5)) {
                        System.out.println("Số tần ko hợp lệ mời nhập lại");
                        str5 = scanner.nextLine();
                    }
                    soTang = Integer.parseInt(str5);
                }
                Villa villa = new Villa(maDichVu, tenDichVu, dienTich, giaThue, sLToiDa, kieuThue, tieuChuan, dienTichBeBoi, soTang);
                listFacility.put(villa, 0);
                for (int i = 0; i < VILLAS.size(); i++) {
                    if (villa.equals(VILLAS.get(i))) {
                        VILLAS.remove(i);
                        VILLAS.add(i, villa);
                        break;
                    }
                }
                ReadAndWrite.writeForFacility("src\\case_study\\data\\villa.csv", VILLAS, false);
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
                String str6 = scanner.nextLine();
                while (!Regex.checkRegexDienTichVaBeBoi(str6)) {
                    System.out.println("Diện tích sử dụng ko hợp lệ phải lớn hơn 30");
                    str6 = scanner.nextLine();
                }
                int dienTichHouse = Integer.parseInt(str6);
                while (dienTichHouse < 30) {
                    System.out.println("Diện tích phải lớn hơn 30");
                    str6 = scanner.nextLine();
                    while (!Regex.checkRegexDienTichVaBeBoi(str6)) {
                        System.out.println("Diện tích sử dụng ko hợp lệ");
                        str6 = scanner.nextLine();
                    }
                    dienTichHouse = Integer.parseInt(str6);
                }
                System.out.println("Nhập giá thuê");
                String str7 = scanner.nextLine();
                while (!Regex.checkChiPhiThue(str7)) {
                    System.out.println("Giá thuê là số nguyên dương, mời nhập lại");
                    str7 = scanner.nextLine();
                }
                double giaThueHouse = Double.parseDouble(str7);
                while (giaThueHouse < 0) {
                    System.out.println("Giá thuê phải là số dương");
                    str7 = scanner.nextLine();
                    while (!Regex.checkChiPhiThue(str7)) {
                        System.out.println("ko hợp lệ mời nhập lại");
                        str7 = scanner.nextLine();
                    }
                    giaThueHouse = Double.parseDouble(str7);
                }
                System.out.println("Nhập số lương người tối đa");
                String str8 = scanner.nextLine();
                while (!Regex.checkSLNguoi(str8)) {
                    System.out.println("Số lương người nhập vào ko hợp lệ mời nhập lại");
                    str8 = scanner.nextLine();
                }
                int sLToiDaHouse = Integer.parseInt(str8);
                while (sLToiDaHouse < 0 || sLToiDaHouse > 20) {
                    System.out.println("Số lượng người ko hợp lệ");
                    str8 = scanner.nextLine();
                    while (!Regex.checkSLNguoi(str8)) {
                        System.out.println("Số lương người nhập vào ko hợp lệ mời nhập lại");
                        str8 = scanner.nextLine();
                    }
                    sLToiDaHouse = Integer.parseInt(str8);
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
                String str9 = scanner.nextLine();
                while (!Regex.checkSoTang(str9)) {
                    System.out.println("Số tần ko hợp lệ mời nhập lại");
                    str9 = scanner.nextLine();
                }
                int soTangHouse = Integer.parseInt(str9);
                while (soTangHouse < 0) {
                    System.out.println("Sô tầng phải là số dương");
                    str9 = scanner.nextLine();
                    while (!Regex.checkSoTang(str9)) {
                        System.out.println("Số tần ko hợp lệ mời nhập lại");
                        str9 = scanner.nextLine();
                    }
                    soTangHouse = Integer.parseInt(str9);
                }
                House house = new House(maDichVuHouse, tenDichVuHouse, dienTichHouse, giaThueHouse, sLToiDaHouse, kieuThueHouse, tieuChuanHouse, soTangHouse);
                listFacility.put(house, 0);
                for (int i = 0; i < HOUSE_LIST.size() ; i++) {
                    if(HOUSE_LIST.get(i).equals(house)){
                        HOUSE_LIST.remove(i);
                        HOUSE_LIST.add(i,house);
                        break;
                    }
                }
                HOUSE_LIST.add(house);
                ReadAndWrite.writeForFacility("src\\case_study\\data\\house.csv", HOUSE_LIST, false);
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
                String str10 = scanner.nextLine();
                while (!Regex.checkRegexDienTichVaBeBoi(str10)) {
                    System.out.println("Diện tích sử dụng ko hợp lệ phải lớn hơn 30");
                    str10 = scanner.nextLine();
                }
                int dienTichRoom = Integer.parseInt(str10);
                while (dienTichRoom < 30) {
                    System.out.println("Diện tích phải lớn hơn 30");
                    str10 = scanner.nextLine();
                    while (!Regex.checkRegexDienTichVaBeBoi(str10)) {
                        System.out.println("Diện tích sử dụng ko hợp lệ");
                        str10 = scanner.nextLine();
                    }
                    dienTichRoom = Integer.parseInt(str10);
                }
                System.out.println("Nhập giá thuê");
                String str11 = scanner.nextLine();
                while (!Regex.checkChiPhiThue(str11)) {
                    System.out.println("Giá thuê là số nguyên dương, mời nhập lại");
                    str11 = scanner.nextLine();
                }
                double giaThueRoom = Double.parseDouble(str11);
                while (giaThueRoom < 0) {
                    System.out.println("Giá thuê phải là số dương");
                    str11 = scanner.nextLine();
                    while (!Regex.checkChiPhiThue(str11)) {
                        System.out.println("ko hợp lệ mời nhập lại");
                        str11 = scanner.nextLine();
                    }
                    giaThueRoom = Double.parseDouble(str11);
                }
                System.out.println("Nhập số lương người tối đa");
                String str12 = scanner.nextLine();
                while (!Regex.checkSLNguoi(str12)) {
                    System.out.println("Số lương người nhập vào ko hợp lệ mời nhập lại");
                    str12 = scanner.nextLine();
                }
                int sLToiDaRoom = Integer.parseInt(str12);
                while (sLToiDaRoom < 0 || sLToiDaRoom > 20) {
                    System.out.println("Số lượng người ko hợp lệ");
                    str12 = scanner.nextLine();
                    while (!Regex.checkSLNguoi(str12)) {
                        System.out.println("Số lương người nhập vào ko hợp lệ mời nhập lại");
                        str12 = scanner.nextLine();
                    }
                    sLToiDaRoom = Integer.parseInt(str12);
                }
                System.out.println("Chọn kiểu thuê");
                String kieuThueRoom = kieuThue();
                System.out.println("Nhập dịch vụ miễn phí đi kèm");
                String dichVuFree = scanner.nextLine();
                Room room = new Room(maDichVuRoom, tenDichVuRoom, dienTichRoom, giaThueRoom, sLToiDaRoom, kieuThueRoom, dichVuFree);
                listFacility.put(room, 0);
                for (int i = 0; i < ROOM_LIST.size() ; i++) {
                    if(ROOM_LIST.get(i).equals(room)){
                        ROOM_LIST.remove(i);
                        ROOM_LIST.add(i,room);
                        break;
                    }
                }
                ROOM_LIST.add(room);
                ReadAndWrite.writeForFacility("src\\case_study\\data\\room.csv", ROOM_LIST, false);
                break;
        }
    }

    @Override
    public void display() {
        ReadAndWrite.read("src\\case_study\\data\\villa.csv");
        ReadAndWrite.read("src\\case_study\\data\\house.csv");
        ReadAndWrite.read("src\\case_study\\data\\room.csv");
        System.out.println("\n====VILLA====");
        for (Villa element : VILLAS) {
            System.out.println(element.toString());
        }
        System.out.println("\n====HOUSE====");
        for (House element : HOUSE_LIST) {
            System.out.println(element.toString());
        }

        System.out.println("\n====ROOM====");
        for (Room element : ROOM_LIST) {
            System.out.println(element.toString());
        }
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
                System.out.println(entry.getKey() + " --- " + entry.getValue());
            }
        }
    }


}
