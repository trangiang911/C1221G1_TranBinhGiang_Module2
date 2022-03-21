package case_study.models;

public class Booking {
    private String idBooking;
    private String beginDay;
    private String endDay;
    private Customer customer;
    private Facility facility;

    public Booking(String idBooking, String beginDay, String endDay, Customer customer,Facility facility) {
        this.idBooking = idBooking;
        this.beginDay = beginDay;
        this.endDay = endDay;
        this.customer = customer;
        this.facility=facility;
    }

    public Booking() {
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public String getBeginDay() {
        return beginDay;
    }

    public void setBeginDay(String beginDay) {
        this.beginDay = beginDay;
    }

    public String getEndDay() {
        return endDay;
    }

    public void setEndDay(String endDay) {
        this.endDay = endDay;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "idBooking='" + idBooking + '\'' +
                ", beginDay='" + beginDay + '\'' +
                ", endDay='" + endDay + '\'' +
                ", customer=" + customer +
                ", facility=" + facility +
                '}';
    }

    public String toCSV(){
        return idBooking+","+beginDay+","+endDay+","+customer.getMaKhachHang()+","+facility.getMaDichVu();
    }
}
