package case_study.models;

public class Villa extends Facility {
    private String tieuChuan;
    private double dienTichBeBoi;
    private int soTang;

    public Villa(String tenDichVu, double dienTichSuDung, double giaThue, int soLuongToiDa, String kieuThue, String tieuChuan, double dienTichBeBoi, int soTang) {
        super(tenDichVu, dienTichSuDung, giaThue, soLuongToiDa, kieuThue);
        this.tieuChuan = tieuChuan;
        this.dienTichBeBoi = dienTichBeBoi;
        this.soTang = soTang;
    }

    public Villa(String tenDichVu, double dienTichSuDung, double giaThue, int soLuongToiDa, String tieuChuan, double dienTichBeBoi, int soTang) {
        super(tenDichVu, dienTichSuDung, giaThue, soLuongToiDa);
        this.tieuChuan = tieuChuan;
        this.dienTichBeBoi = dienTichBeBoi;
        this.soTang = soTang;
    }

    public Villa(String tieuChuan, double dienTichBeBoi, int soTang) {
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

    public void setDienTichBeBoi(double dienTichBeBoi) {
        this.dienTichBeBoi = dienTichBeBoi;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return "Villa{" + super.toString()+
                "tieuChuan='" + tieuChuan + '\'' +
                ", dienTichBeBoi=" + dienTichBeBoi +
                ", soTang=" + soTang +
                '}';
    }
}
