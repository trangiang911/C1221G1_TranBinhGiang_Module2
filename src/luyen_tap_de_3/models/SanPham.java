package luyen_tap_de_3.models;

public abstract class SanPham {
    private static int idTemp=1;
    private int id;
    private String maSP;
    private String nameSP;
    private double price;
    private int amount;
    private String nsx;

    public SanPham(int id, String maSP, String nameSP, double price, int amount, String nsx) {
        this.id = id;
        this.maSP = maSP;
        this.nameSP = nameSP;
        this.price = price;
        this.amount = amount;
        this.nsx = nsx;
    }

    public SanPham(String maSP, String nameSP, double price, int amount, String nsx) {
        this.id=idTemp++;
        this.maSP = maSP;
        this.nameSP = nameSP;
        this.price = price;
        this.amount = amount;
        this.nsx = nsx;
    }

    public SanPham() {
    }

    public static int getIdTemp() {
        return idTemp;
    }

    public static void setIdTemp(int idTemp) {
        SanPham.idTemp = idTemp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getNameSP() {
        return nameSP;
    }

    public void setNameSP(String nameSP) {
        this.nameSP = nameSP;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getNsx() {
        return nsx;
    }

    public void setNsx(String nsx) {
        this.nsx = nsx;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", maSP='" + maSP + '\'' +
                ", nameSP='" + nameSP + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", nsx='" + nsx + '\'' +
                '}';
    }
    public String toCSV(){
        return id+","+maSP+","+nameSP+","+price+","+amount+","+nsx+",";
    }
}
