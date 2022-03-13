package bai_tap_lam_them_2.models;

public class XeTai extends Xe{
    private double trongTai;

    public XeTai(double trongTai) {
        this.trongTai = trongTai;
    }

    public XeTai(String bienKiemSoat, String hangXe, int namSanXuat, String chuSoHuu, double trongTai) {
        super(bienKiemSoat, hangXe, namSanXuat, chuSoHuu);
        this.trongTai = trongTai;
    }

    public XeTai(String bienKiemSoat, int namSanXuat, String chuSoHuu, int soCho, double trongTai) {
        super(bienKiemSoat, namSanXuat, chuSoHuu, soCho);
        this.trongTai = trongTai;
    }

    public XeTai(String bienKiemSoat, int namSanXuat, String chuSoHuu, double trongTai) {
        super(bienKiemSoat, namSanXuat, chuSoHuu);
        this.trongTai = trongTai;
    }

    public XeTai() {
        super();
    }

    public double getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(double trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return super.toString()+
                trongTai+",";
    }
}
