package bai_tap_lam_them_2.models;

public class Oto extends Xe {
    private String kieuXe;
    private int soCho;

    public Oto(String kieuXe, int soCho) {
        this.kieuXe = kieuXe;
        this.soCho = soCho;
    }

    public Oto(String bienKiemSoat, String hangXe, int namSanXuat, String chuSoHuu, String kieuXe, int soCho) {
        super(bienKiemSoat, hangXe, namSanXuat, chuSoHuu);
        this.kieuXe = kieuXe;
        this.soCho = soCho;
    }

    public Oto(String bienKiemSoat, int namSanXuat, String chuSoHuu, int soCho, String kieuXe, int soCho1) {
        super(bienKiemSoat, namSanXuat, chuSoHuu, soCho);
        this.kieuXe = kieuXe;
        this.soCho = soCho1;
    }

    public Oto(String bienKiemSoat, int namSanXuat, String chuSoHuu, String kieuXe, int soCho) {
        super(bienKiemSoat, namSanXuat, chuSoHuu);
        this.kieuXe = kieuXe;
        this.soCho = soCho;
    }
    public Oto(){
        super();
    }

    public String getKieuXe() {
        return kieuXe;
    }

    public void setKieuXe(String kieuXe) {
        this.kieuXe = kieuXe;
    }

    @Override
    public int getSoCho() {
        return soCho;
    }

    @Override
    public void setSoCho(int soCho) {
        this.soCho = soCho;
    }

    @Override
    public String toString() {
        return super.toString()+
                kieuXe + "," +
                soCho;
    }
}
