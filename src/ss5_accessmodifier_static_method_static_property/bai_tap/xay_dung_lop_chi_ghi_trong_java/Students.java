package ss5_accessmodifier_static_method_static_property.bai_tap.xay_dung_lop_chi_ghi_trong_java;

public class Students {
    private String name="john";
    private String classes="C02";
    public Students(){}

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}
