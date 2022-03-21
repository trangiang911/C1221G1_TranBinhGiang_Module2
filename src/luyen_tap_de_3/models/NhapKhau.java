package luyen_tap_de_3.models;

public class NhapKhau extends SanPham {
    private double priceNK;
    private String conscious;
    private double tax;

    public NhapKhau(int id, String maSP, String nameSP, double price, int amount, String nsx, double priceNK, String conscious, double tax) {
        super(id, maSP, nameSP, price, amount, nsx);
        this.priceNK = priceNK;
        this.conscious = conscious;
        this.tax = tax;
    }

    public NhapKhau(String maSP, String nameSP, double price, int amount, String nsx, double priceNK, String conscious, double tax) {
        super(maSP, nameSP, price, amount, nsx);
        this.priceNK = priceNK;
        this.conscious = conscious;
        this.tax = tax;
    }

    public NhapKhau(double priceNK, String conscious, double tax) {
        this.priceNK = priceNK;
        this.conscious = conscious;
        this.tax = tax;
    }

    public NhapKhau() {
        super();
    }

    public double getPriceNK() {
        return priceNK;
    }

    public void setPriceNK(double priceNK) {
        this.priceNK = priceNK;
    }

    public String getConscious() {
        return conscious;
    }

    public void setConscious(String conscious) {
        this.conscious = conscious;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    @Override
    public String toString() {
        return "NhapKhau{" + super.toString()+
                "priceNK=" + priceNK +
                ", conscious='" + conscious + '\'' +
                ", tax=" + tax +
                '}';
    }

    @Override
    public String toCSV() {
        return super.toCSV()+priceNK+","+conscious+","+tax;
    }
}
