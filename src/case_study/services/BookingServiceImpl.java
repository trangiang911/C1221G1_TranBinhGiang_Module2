package case_study.services;

import case_study.models.Booking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookingServiceImpl implements IBookingService{
    Scanner scanner=new Scanner(System.in);
    private static final List<Booking> BOOKING_LIST=new ArrayList<>();
    CustomerServiceImpl customerService=new CustomerServiceImpl();
    FacilityServiceImpl facilityService=new FacilityServiceImpl();
//    static {
//
//    }

    @Override
    public void create() {
        customerService.display();
        facilityService.display();
    }

    @Override
    public void display() {

    }

}
