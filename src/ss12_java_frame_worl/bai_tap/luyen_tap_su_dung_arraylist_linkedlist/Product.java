package ss12_java_frame_worl.bai_tap.luyen_tap_su_dung_arraylist_linkedlist;

public class Product {
    private String iD;
    private String name;
    private double money;

    public Product(String iD, String name, double money) {
        this.iD = iD;
        this.name = name;
        this.money = money;
    }

    public Product() {
    }

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Product{" +
                "iD='" + iD + '\'' +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
