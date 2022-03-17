package case_study.models;

public class House extends Facility {
    private String tieuChuan;
    private int soTang;

    public House(String maDichVu, String tenDichVu, int dienTichSuDung, double giaThue, int soLuongToiDa, String kieuThue, String tieuChuan, int soTang) {
        super(maDichVu, tenDichVu, dienTichSuDung, giaThue, soLuongToiDa, kieuThue);
        this.tieuChuan = tieuChuan;
        this.soTang = soTang;
    }

    public House(String tenDichVu, int dienTichSuDung, double giaThue, int soLuongToiDa, String tieuChuan, int soTang) {
        super(tenDichVu, dienTichSuDung, giaThue, soLuongToiDa);
        this.tieuChuan = tieuChuan;
        this.soTang = soTang;
    }

    public House(String tieuChuan, int soTang) {
        this.tieuChuan = tieuChuan;
        this.soTang = soTang;
    }

    public House() {
    }

    public String getTieuChuan() {
        return tieuChuan;
    }

    public void setTieuChuan(String tieuChuan) {
        this.tieuChuan = tieuChuan;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public String toStringRead() {
        return "House{" + super.toStringRead()+
                "tieuChuan='" + tieuChuan + '\'' +
                ", soTang=" + soTang +
                '}';
    }

    @Override
    public String toString() {
        return super.toString()+","+tieuChuan+","+soTang;
    }
}
