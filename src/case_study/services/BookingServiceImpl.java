package case_study.services;

import case_study.models.*;
import case_study.utils.SapXep;
import collection_review.models.Intern;

import java.util.*;

public class BookingServiceImpl implements IBookingService{
    Scanner scanner=new Scanner(System.in);
    private static final Set<Booking> bookingSet=new TreeSet<>(new SapXep());
    CustomerServiceImpl customerService=new CustomerServiceImpl();
    FacilityServiceImpl facilityService=new FacilityServiceImpl();
//    static {
//
//    }

    @Override
    public void create() {
        String id;
        if(!bookingSet.isEmpty()){
            id="1";
        }
        customerService.display();
        System.out.println("Nhập id khách hàng");
        boolean check=true;
         id= scanner.nextLine();
         Customer customer1 = null;
         while (check){
             for (Customer customer: CustomerServiceImpl.CUSTOMER_LIST){
                 if(id.equals(customer.getMaKhachHang())){
                     check=false;
                     customer1=customer;
                 }
             }
             if(check){
                 System.out.println("Nhập sai id vui lòng nhập lại");
                 id=scanner.nextLine();
             }
         }
        facilityService.display();
        System.out.println("Nhập id dịch vụ");
        boolean check1=true;
        String id1=scanner.nextLine();
        Facility facility = null;
        while (check1){
            for (Villa villa: FacilityServiceImpl.VILLAS){
                if(id1.equals(villa.getMaDichVu())){
                    check1=false;
                    facility=villa;
                }
            }for (House house: FacilityServiceImpl.HOUSE_LIST){
                if(id1.equals(house.getMaDichVu())){
                    check1=false;
                    facility=house;
                }
            }for (Room room: FacilityServiceImpl.ROOM_LIST){
                if(id1.equals(room.getMaDichVu())){
                    check1=false;
                    facility=room;
                }
            }
            if (check1){
                System.out.println("Mã phòng k hợp lệ mời nhập lại");
                id1=scanner.nextLine();
            }
        }
        System.out.println("Nhập id booking");
        String idBook=scanner.nextLine();
        System.out.println("Nhập ngày bắt đầu");
        String beginDay=scanner.nextLine();
        System.out.println("Nhập ngày đi");
        String endDay=scanner.nextLine();
        bookingSet.add(new Booking(idBook,beginDay,endDay,customer1,facility));
    }

    @Override
    public void display() {
        for (Booking entry: bookingSet){
            System.out.println(entry);
        }
    }

    public static void main(String[] args) {
        BookingServiceImpl bookingService=new BookingServiceImpl();
        bookingService.create();
        bookingService.create();
        bookingService.display();
    }
}
