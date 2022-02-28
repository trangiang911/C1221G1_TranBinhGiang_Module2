package bai_tap_lam_them_1.chuong_trinh_quan_ly_phuong_tien;

public class Oto extends Xe {
    private String kieuXe;
    private int soCho;
    public Oto(String bienKiemSoat, String hangXe, int namSanXuat, String chuSoHuu, int soCho, String kieuXe) {
        super(bienKiemSoat, hangXe, namSanXuat, chuSoHuu);
        this.kieuXe = kieuXe;
        this.soCho=soCho;
    }

    public Oto() {
        super();
    }

    public String getKieuXe() {
        return kieuXe;
    }

    public void setKieuXe(String kieuXe) {
        this.kieuXe = kieuXe;
    }

    @Override
    public String toString() {
        return "Oto{" +super.toString()+
                "kieuXe='" + kieuXe + '\'' +
                '}';
    }
}
