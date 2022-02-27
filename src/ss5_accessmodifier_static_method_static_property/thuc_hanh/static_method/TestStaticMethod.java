package ss5_accessmodifier_static_method_static_property.thuc_hanh.static_method;

import ss5_accessmodifier_static_method_static_property.thuc_hanh.static_method.StaticMethod;

public class TestStaticMethod {
    public static void main(String args[]) {
        StaticMethod.change(); //calling change method

        //creating objects
        StaticMethod s1 = new StaticMethod(111, "Hoang");
        StaticMethod s2 = new StaticMethod(222, "Khanh");
        StaticMethod s3 = new StaticMethod(333, "Nam");

        //calling display method
        s1.display();
        s2.display();
        s3.display();
    }
}
