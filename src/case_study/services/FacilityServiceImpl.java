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
     static final List<Villa> VILLAS = new ArrayList<>();
     static final List<House> HOUSE_LIST = new ArrayList<>();
     static final List<Room> ROOM_LIST = new ArrayList<>();
     static final Map<Facility, Integer> LIST_FACILITY = new LinkedHashMap<>();

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
        System.out.println("Ch???n lo???i ph??ng c???n th??m");
        System.out.println("1. Add new Villa\n" +
                "2. Add new House\n" +
                "3. Add new Room\n" +
                "4. Back to Menu");
        System.out.println("Nh???p l???a ch???n");
        String str=scanner.nextLine();
        while (!Pattern.matches("^[0-9]$",str)){
            System.out.println("L???a ch???n k h???p l??? m???i nh???p l???i");
            str=scanner.nextLine();
        }
        int choice = Integer.parseInt(str);
        switch (choice) {
            case 1:
                System.out.println("Nh???p m?? d???ch v??? (SVVL-YYYY)");
                String maDichVu = scanner.nextLine();
                while (!Regex.checkRegexVilla(maDichVu)) {
                    System.out.println("M?? d???ch v??? ko h???p l??? m???i nh???p l???i (SVVL-YYYY)");
                    maDichVu = scanner.nextLine();
                }
                System.out.println("Nh???p t??n d???ch v???");
                String tenDichVu = scanner.nextLine();
                while (!Regex.checkRegexTenDichVu(tenDichVu)) {
                    System.out.println("T??n d???ch v??? c???n ch??? ?????u ti??n vi???t hoa c??n l???i vi???t th?????ng, m???i nh???p l???i");
                    tenDichVu = scanner.nextLine();
                }
                System.out.println("Nh???p di???n t??ch s??? d???ng");
                String str1 = scanner.nextLine();
                while (!Regex.checkRegexDienTichVaBeBoi(str1)) {
                    System.out.println("Di???n t??ch s??? d???ng ko h???p l???");
                    str1 = scanner.nextLine();
                }
                int dienTich = Integer.parseInt(str1);
                while (dienTich < 30) {
                    System.out.println("Di???n t??ch ph???i l???n h??n 30");
                    str1 = scanner.nextLine();
                    while (!Regex.checkRegexDienTichVaBeBoi(str1)) {
                        System.out.println("Di???n t??ch s??? d???ng ko h???p l???");
                        str1 = scanner.nextLine();
                    }
                    dienTich = Integer.parseInt(str1);
                }
                System.out.println("Nh???p gi?? thu??");
                String str2 = scanner.nextLine();
                while (!Regex.checkChiPhiThue(str2)) {
                    System.out.println("ko h???p l??? m???i nh???p l???i");
                    str2 = scanner.nextLine();
                }
                double giaThue = Double.parseDouble(str2);
                while (giaThue < 0) {
                    System.out.println("Gi?? thu?? ph???i d????ng m???i nh???p l???i");
                    str2 = scanner.nextLine();
                    while (!Regex.checkChiPhiThue(str2)) {
                        System.out.println("ko h???p l??? m???i nh???p l???i");
                        str2 = scanner.nextLine();
                    }
                    giaThue = Double.parseDouble(str2);
                }
                System.out.println("Nh???p s??? l????ng ng?????i t???i ??a");
                String str3 = scanner.nextLine();
                while (!Regex.checkSLNguoi(str3)) {
                    System.out.println("S??? l????ng ng?????i nh???p v??o ko h???p l??? m???i nh???p l???i");
                    str3 = scanner.nextLine();
                }
                int sLToiDa = Integer.parseInt(str3);
                while (sLToiDa < 0 || sLToiDa > 20) {
                    System.out.println("S??? l?????ng ng?????i ko h???p l???");
                    str3 = scanner.nextLine();
                    while (!Regex.checkSLNguoi(str3)) {
                        System.out.println("S??? l????ng ng?????i nh???p v??o ko h???p l??? m???i nh???p l???i");
                        str3 = scanner.nextLine();
                    }
                    sLToiDa = Integer.parseInt(str3);
                }
                System.out.println("Ch???n ki???u thu??");
                String kieuThue = kieuThue();
                System.out.println("Nh???p ti??u chu???n ph??ng");
                String tieuChuan = scanner.nextLine();
                while (!Regex.checkRegexTenDichVu(tieuChuan)) {
                    System.out.println("Ti??u chu???n ph??ng k h???p l???, k?? t??? ?????u ti??n vi???t ho?? m???i nh???p l???i");
                    tieuChuan = scanner.nextLine();
                }
                System.out.println("Nh???p Di???n t??ch b??? b??i");
                String str4 = scanner.nextLine();
                while (!Regex.checkRegexDienTichVaBeBoi(str4)) {
                    System.out.println("Di???n t??ch b??? b??i ko h???p l??? m???i nh???p l???i");
                    str4 = scanner.nextLine();
                }
                int dienTichBeBoi = Integer.parseInt(str4);
                while (dienTichBeBoi < 30) {
                    System.out.println("Di???n t??ch b??? b??i ph???o l???n h??n 30");
                    str4 = scanner.nextLine();
                    while (!Regex.checkRegexDienTichVaBeBoi(str4)) {
                        System.out.println("Di???n t??ch b??? b??i ko h???p l??? m???i nh???p l???i");
                        str4 = scanner.nextLine();
                    }
                    dienTichBeBoi = Integer.parseInt(str4);
                }
                System.out.println("Nh???p s??? t???ng");
                String str5 = scanner.nextLine();
                while (!Regex.checkSoTang(str5)) {
                    System.out.println("S??? t???n ko h???p l??? m???i nh???p l???i");
                    str5 = scanner.nextLine();
                }
                int soTang = Integer.parseInt(str5);
                while (soTang < 0) {
                    System.out.println("S??? t???ng ph???i l?? s??? d????ng");
                    str5 = scanner.nextLine();
                    while (!Regex.checkSoTang(str5)) {
                        System.out.println("S??? t???n ko h???p l??? m???i nh???p l???i");
                        str5 = scanner.nextLine();
                    }
                    soTang = Integer.parseInt(str5);
                }
                Villa villa = new Villa(maDichVu, tenDichVu, dienTich, giaThue, sLToiDa, kieuThue, tieuChuan, dienTichBeBoi, soTang);
                LIST_FACILITY.put(villa, 0);
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
                System.out.println("Nh???p m?? d???ch v??? (SVHO-YYYY)");
                String maDichVuHouse = scanner.nextLine();
                while (!Regex.checkRegexHouse(maDichVuHouse)) {
                    System.out.println("M?? d???ch v??? ko h???p l??? (SVHO-YYYY)");
                    maDichVuHouse = scanner.nextLine();
                }
                System.out.println("Nh???p t??n d???ch v???");
                String tenDichVuHouse = scanner.nextLine();
                while (!Regex.checkRegexTenDichVu(tenDichVuHouse)) {
                    System.out.println("T??n d???ch v??? c???n ch??? ?????u ti??n vi???t hoa c??n l???i vi???t th?????ng, m???i nh???p l???i");
                    tenDichVuHouse = scanner.nextLine();
                }
                System.out.println("Nh???p di???n t??ch s??? d???ng");
                String str6 = scanner.nextLine();
                while (!Regex.checkRegexDienTichVaBeBoi(str6)) {
                    System.out.println("Di???n t??ch s??? d???ng ko h???p l??? ph???i l???n h??n 30");
                    str6 = scanner.nextLine();
                }
                int dienTichHouse = Integer.parseInt(str6);
                while (dienTichHouse < 30) {
                    System.out.println("Di???n t??ch ph???i l???n h??n 30");
                    str6 = scanner.nextLine();
                    while (!Regex.checkRegexDienTichVaBeBoi(str6)) {
                        System.out.println("Di???n t??ch s??? d???ng ko h???p l???");
                        str6 = scanner.nextLine();
                    }
                    dienTichHouse = Integer.parseInt(str6);
                }
                System.out.println("Nh???p gi?? thu??");
                String str7 = scanner.nextLine();
                while (!Regex.checkChiPhiThue(str7)) {
                    System.out.println("Gi?? thu?? l?? s??? nguy??n d????ng, m???i nh???p l???i");
                    str7 = scanner.nextLine();
                }
                double giaThueHouse = Double.parseDouble(str7);
                while (giaThueHouse < 0) {
                    System.out.println("Gi?? thu?? ph???i l?? s??? d????ng");
                    str7 = scanner.nextLine();
                    while (!Regex.checkChiPhiThue(str7)) {
                        System.out.println("ko h???p l??? m???i nh???p l???i");
                        str7 = scanner.nextLine();
                    }
                    giaThueHouse = Double.parseDouble(str7);
                }
                System.out.println("Nh???p s??? l????ng ng?????i t???i ??a");
                String str8 = scanner.nextLine();
                while (!Regex.checkSLNguoi(str8)) {
                    System.out.println("S??? l????ng ng?????i nh???p v??o ko h???p l??? m???i nh???p l???i");
                    str8 = scanner.nextLine();
                }
                int sLToiDaHouse = Integer.parseInt(str8);
                while (sLToiDaHouse < 0 || sLToiDaHouse > 20) {
                    System.out.println("S??? l?????ng ng?????i ko h???p l???");
                    str8 = scanner.nextLine();
                    while (!Regex.checkSLNguoi(str8)) {
                        System.out.println("S??? l????ng ng?????i nh???p v??o ko h???p l??? m???i nh???p l???i");
                        str8 = scanner.nextLine();
                    }
                    sLToiDaHouse = Integer.parseInt(str8);
                }
                System.out.println("Ch???n ki???u thu??");
                String kieuThueHouse = kieuThue();
                System.out.println("Nh???p ti??u chu???n ph??ng");
                String tieuChuanHouse = scanner.nextLine();
                while (!Regex.checkRegexTenDichVu(tieuChuanHouse)) {
                    System.out.println("Ti??u chu???n ph??ng k h???p l???, k?? t??? ?????u ti??n vi???t ho?? m???i nh???p l???i");
                    tieuChuanHouse = scanner.nextLine();
                }
                System.out.println("Nh???p s??? t???ng");
                String str9 = scanner.nextLine();
                while (!Regex.checkSoTang(str9)) {
                    System.out.println("S??? t???n ko h???p l??? m???i nh???p l???i");
                    str9 = scanner.nextLine();
                }
                int soTangHouse = Integer.parseInt(str9);
                while (soTangHouse < 0) {
                    System.out.println("S?? t???ng ph???i l?? s??? d????ng");
                    str9 = scanner.nextLine();
                    while (!Regex.checkSoTang(str9)) {
                        System.out.println("S??? t???n ko h???p l??? m???i nh???p l???i");
                        str9 = scanner.nextLine();
                    }
                    soTangHouse = Integer.parseInt(str9);
                }
                House house = new House(maDichVuHouse, tenDichVuHouse, dienTichHouse, giaThueHouse, sLToiDaHouse, kieuThueHouse, tieuChuanHouse, soTangHouse);
                LIST_FACILITY.put(house, 0);
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
                System.out.println("Nh???p m?? d???ch v??? (SVRO-YYYY)");
                String maDichVuRoom = scanner.nextLine();
                while (!Regex.checkRegexRoom(maDichVuRoom)) {
                    System.out.println("M?? d???ch v??? ko h???p l??? m???i nh???p l???i");
                    maDichVuRoom = scanner.nextLine();
                }
                System.out.println("Nh???p t??n d???ch v???");
                String tenDichVuRoom = scanner.nextLine();
                while (!Regex.checkRegexTenDichVu(tenDichVuRoom)) {
                    System.out.println("T??n d???ch v??? c???n ch??? ?????u ti??n vi???t hoa c??n l???i vi???t th?????ng, m???i nh???p l???i");
                    tenDichVuRoom = scanner.nextLine();
                }
                System.out.println("Nh???p di???n t??ch s??? d???ng");
                String str10 = scanner.nextLine();
                while (!Regex.checkRegexDienTichVaBeBoi(str10)) {
                    System.out.println("Di???n t??ch s??? d???ng ko h???p l??? ph???i l???n h??n 30");
                    str10 = scanner.nextLine();
                }
                int dienTichRoom = Integer.parseInt(str10);
                while (dienTichRoom < 30) {
                    System.out.println("Di???n t??ch ph???i l???n h??n 30");
                    str10 = scanner.nextLine();
                    while (!Regex.checkRegexDienTichVaBeBoi(str10)) {
                        System.out.println("Di???n t??ch s??? d???ng ko h???p l???");
                        str10 = scanner.nextLine();
                    }
                    dienTichRoom = Integer.parseInt(str10);
                }
                System.out.println("Nh???p gi?? thu??");
                String str11 = scanner.nextLine();
                while (!Regex.checkChiPhiThue(str11)) {
                    System.out.println("Gi?? thu?? l?? s??? nguy??n d????ng, m???i nh???p l???i");
                    str11 = scanner.nextLine();
                }
                double giaThueRoom = Double.parseDouble(str11);
                while (giaThueRoom < 0) {
                    System.out.println("Gi?? thu?? ph???i l?? s??? d????ng");
                    str11 = scanner.nextLine();
                    while (!Regex.checkChiPhiThue(str11)) {
                        System.out.println("ko h???p l??? m???i nh???p l???i");
                        str11 = scanner.nextLine();
                    }
                    giaThueRoom = Double.parseDouble(str11);
                }
                System.out.println("Nh???p s??? l????ng ng?????i t???i ??a");
                String str12 = scanner.nextLine();
                while (!Regex.checkSLNguoi(str12)) {
                    System.out.println("S??? l????ng ng?????i nh???p v??o ko h???p l??? m???i nh???p l???i");
                    str12 = scanner.nextLine();
                }
                int sLToiDaRoom = Integer.parseInt(str12);
                while (sLToiDaRoom < 0 || sLToiDaRoom > 20) {
                    System.out.println("S??? l?????ng ng?????i ko h???p l???");
                    str12 = scanner.nextLine();
                    while (!Regex.checkSLNguoi(str12)) {
                        System.out.println("S??? l????ng ng?????i nh???p v??o ko h???p l??? m???i nh???p l???i");
                        str12 = scanner.nextLine();
                    }
                    sLToiDaRoom = Integer.parseInt(str12);
                }
                System.out.println("Ch???n ki???u thu??");
                String kieuThueRoom = kieuThue();
                System.out.println("Nh???p d???ch v??? mi???n ph?? ??i k??m");
                String dichVuFree = scanner.nextLine();
                Room room = new Room(maDichVuRoom, tenDichVuRoom, dienTichRoom, giaThueRoom, sLToiDaRoom, kieuThueRoom, dichVuFree);
                LIST_FACILITY.put(room, 0);
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
        stringList.add("Theo n??m");
        stringList.add("Theo th??ng");
        stringList.add("Theo ng??y");
        stringList.add("Theo gi???");
        System.out.println("1. Thu?? theo n??m\n" +
                "2. Thu?? theo th??ng\n" +
                "3. Thu?? theo ng??y\n" +
                "4. Thu?? theo gi???");
        System.out.println("Nh???p l???a ch???n");
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
                System.out.println("L???a ch???n k h???p l???");
                return null;

        }
    }

    @Override
    public void displayMaintenance() {
        ReadAndWrite.read("src\\case_study\\data\\villa.csv");
        ReadAndWrite.read("src\\case_study\\data\\house.csv");
        ReadAndWrite.read("src\\case_study\\data\\room.csv");
        for (Map.Entry<Facility, Integer> entry : LIST_FACILITY.entrySet()) {
            if (entry.getValue() >= 5) {
                System.out.println(entry.getKey() + " --- " + entry.getValue());
            }
        }
    }


}
