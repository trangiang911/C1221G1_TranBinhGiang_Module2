package ss5_accessmodifier_static_method_static_property.bai_tap.xay_dung_lop_chi_ghi_trong_java;

public class Test {
    public static void main(String[] args) {
        Students student1=new Students();
        Students students=new Students();
        student1.setName("giang");
        student1.setClasses("C1221G1");
        System.out.println(student1);
        System.out.println(students);
    }
}
