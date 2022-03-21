package luyen_tap_de_3.models;

public class XuatKhau extends SanPham {
    private double priceXK;
    private String nation;

    public XuatKhau(int id, String maSP, String nameSP, double price, int amount, String nsx, double priceXK, String nation) {
        super(id, maSP, nameSP, price, amount, nsx);
        this.priceXK = priceXK;
        this.nation = nation;
    }

    public XuatKhau(String maSP, String nameSP, double price, int amount, String nsx, double priceXK, String nation) {
        super(maSP, nameSP, price, amount, nsx);
        this.priceXK = priceXK;
        this.nation = nation;
    }

    public XuatKhau(double priceXK, String nation) {
        this.priceXK = priceXK;
        this.nation = nation;
    }

    public double getPriceXK() {
        return priceXK;
    }

    public void setPriceXK(double priceXK) {
        this.priceXK = priceXK;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    @Override
    public String toString() {
        return "XuatKhau{" + super.toString()+
                "priceXK=" + priceXK +
                ", nation='" + nation + '\'' +
                '}';
    }

    @Override
    public String toCSV() {
        return super.toCSV()+priceXK+","+nation;
    }
}
