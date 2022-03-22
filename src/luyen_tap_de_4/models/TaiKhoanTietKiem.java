package luyen_tap_de_4.models;

public class TaiKhoanTietKiem extends TaiKhoanNganHang {
    private double saveMoney;
    private String dateSave;
    private double rate;
    private int tenor;

    public TaiKhoanTietKiem(int id, String code, String name, String date, double saveMoney, String dateSave, double rate, int tenor) {
        super(id, code, name, date);
        this.saveMoney = saveMoney;
        this.dateSave = dateSave;
        this.rate = rate;
        this.tenor = tenor;
    }

    public TaiKhoanTietKiem(String code, String name, String date, double saveMoney, String dateSave, double rate, int tenor) {
        super(code, name, date);
        this.saveMoney = saveMoney;
        this.dateSave = dateSave;
        this.rate = rate;
        this.tenor = tenor;
    }

    public TaiKhoanTietKiem(double saveMoney, String dateSave, double rate, int tenor) {
        this.saveMoney = saveMoney;
        this.dateSave = dateSave;
        this.rate = rate;
        this.tenor = tenor;
    }

    public TaiKhoanTietKiem() {
        super();
    }

    public double getSaveMoney() {
        return saveMoney;
    }

    public void setSaveMoney(double saveMoney) {
        this.saveMoney = saveMoney;
    }

    public String getDateSave() {
        return dateSave;
    }

    public void setDateSave(String dateSave) {
        this.dateSave = dateSave;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getTenor() {
        return tenor;
    }

    public void setTenor(int tenor) {
        this.tenor = tenor;
    }

    @Override
    public String toString() {
        return "TaiKhoanTietKiem{" + super.toString()+
                "saveMoney=" + saveMoney +
                ", dateSave='" + dateSave +
                ", rate=" + rate +
                ", tenor=" + tenor +
                '}';
    }

    @Override
    public String toCSV() {
        return super.toCSV()+saveMoney+","+dateSave+","+rate+","+tenor;
    }
}
