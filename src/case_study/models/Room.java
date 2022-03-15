package case_study.models;

public class Room extends Facility {
    private String dinhVuFree;

    public Room(String tenDichVu, double dienTichSuDung, double giaThue, int soLuongToiDa, String kieuThue, String dinhVuFree) {
        super(tenDichVu, dienTichSuDung, giaThue, soLuongToiDa, kieuThue);
        this.dinhVuFree = dinhVuFree;
    }

    public Room(String tenDichVu, double dienTichSuDung, double giaThue, int soLuongToiDa, String dinhVuFree) {
        super(tenDichVu, dienTichSuDung, giaThue, soLuongToiDa);
        this.dinhVuFree = dinhVuFree;
    }

    public Room(String dinhVuFree) {
        this.dinhVuFree = dinhVuFree;
    }

    public Room() {
    }

    public String getDinhVuFree() {
        return dinhVuFree;
    }

    public void setDinhVuFree(String dinhVuFree) {
        this.dinhVuFree = dinhVuFree;
    }

    @Override
    public String toString() {
        return "Room{" + super.toString()+
                "dinhVuFree='" + dinhVuFree + '\'' +
                '}';
    }
}
