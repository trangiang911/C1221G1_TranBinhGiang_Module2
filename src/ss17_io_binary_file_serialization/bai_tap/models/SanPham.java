package ss17_io_binary_file_serialization.bai_tap.models;

import java.io.Serializable;

public class SanPham implements Serializable {
    private String id;
    private String name;
    private String nameHang;
    private double money;

    public SanPham(String id, String name, String nameHang, double money) {
        this.id = id;
        this.name = name;
        this.nameHang = nameHang;
        this.money = money;
    }

    public SanPham() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameHang() {
        return nameHang;
    }

    public void setNameHang(String nameHang) {
        this.nameHang = nameHang;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", nameHang='" + nameHang + '\'' +
                ", money='" + money + '\'' +
                '}';
    }
}
