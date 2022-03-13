package bai_tap_lam_them_2.models;

public class XeMay extends Xe {
    private double congSuat;

    public XeMay(double congSuat) {
        this.congSuat = congSuat;
    }

    public XeMay(String bienKiemSoat, String hangXe, int namSanXuat, String chuSoHuu, double congSuat) {
        super(bienKiemSoat, hangXe, namSanXuat, chuSoHuu);
        this.congSuat = congSuat;
    }

    public XeMay(String bienKiemSoat, int namSanXuat, String chuSoHuu, int soCho, double congSuat) {
        super(bienKiemSoat, namSanXuat, chuSoHuu, soCho);
        this.congSuat = congSuat;
    }

    public XeMay(String bienKiemSoat, int namSanXuat, String chuSoHuu, double congSuat) {
        super(bienKiemSoat, namSanXuat, chuSoHuu);
        this.congSuat = congSuat;
    }

    public XeMay() {
        super();
    }

    public double getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(double congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return super.toString()+
                congSuat;
    }
}
