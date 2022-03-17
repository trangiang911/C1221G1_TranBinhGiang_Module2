package case_study.models;

public class Villa extends Facility {
    private String tieuChuan;
    private int dienTichBeBoi;
    private int soTang;

    public Villa(String maDichVu, String tenDichVu, int dienTichSuDung, double giaThue, int soLuongToiDa, String kieuThue, String tieuChuan, int dienTichBeBoi, int soTang) {
        super(maDichVu, tenDichVu, dienTichSuDung, giaThue, soLuongToiDa, kieuThue);
        this.tieuChuan = tieuChuan;
        this.dienTichBeBoi = dienTichBeBoi;
        this.soTang = soTang;
    }

    public Villa(String maDichVu, String tenDichVu, int dienTichSuDung, double giaThue, int soLuongToiDa, String tieuChuan, int dienTichBeBoi, int soTang) {
        super(tenDichVu, dienTichSuDung, giaThue, soLuongToiDa);
        this.tieuChuan = tieuChuan;
        this.dienTichBeBoi = dienTichBeBoi;
        this.soTang = soTang;
    }

    public Villa(String tieuChuan, int dienTichBeBoi, int soTang) {
        this.tieuChuan = tieuChuan;
        this.dienTichBeBoi = dienTichBeBoi;
        this.soTang = soTang;
    }

    public Villa() {
    }

    public String getTieuChuan() {
        return tieuChuan;
    }

    public void setTieuChuan(String tieuChuan) {
        this.tieuChuan = tieuChuan;
    }

    public double getDienTichBeBoi() {
        return dienTichBeBoi;
    }

    public void setDienTichBeBoi(int dienTichBeBoi) {
        this.dienTichBeBoi = dienTichBeBoi;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public String toStringRead() {
        return "Villa{" + super.toStringRead()+
                "tieuChuan='" + tieuChuan + '\'' +
                ", dienTichBeBoi=" + dienTichBeBoi +
                ", soTang=" + soTang +
                '}';
    }

    @Override
    public String toString() {
        return super.toString()+","+tieuChuan+","+dienTichBeBoi+","+soTang;
    }
}
