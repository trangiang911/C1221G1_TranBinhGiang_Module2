package case_study.models;

public class Room extends Facility {
    private String dinhVuFree;

    public Room(String maDichVu, String tenDichVu, int dienTichSuDung, double giaThue, int soLuongToiDa, String kieuThue, String dinhVuFree) {
        super(maDichVu, tenDichVu, dienTichSuDung, giaThue, soLuongToiDa, kieuThue);
        this.dinhVuFree = dinhVuFree;
    }

    public Room(String tenDichVu, int dienTichSuDung, double giaThue, int soLuongToiDa, String dinhVuFree) {
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

    public Room(String maDichVu, String tenDichVu, int dienTichSuDung, double giaThue, int soLuongToiDa, String kieuThue) {
        super(maDichVu, tenDichVu, dienTichSuDung, giaThue, soLuongToiDa, kieuThue);
    }

    @Override
    public String toStringRead() {
        return "Room{" + super.toStringRead()+
                "dinhVuFree='" + dinhVuFree + '\'' +
                '}';
    }

    @Override
    public String toString() {
        return super.toString()+","+dinhVuFree;
    }
}
