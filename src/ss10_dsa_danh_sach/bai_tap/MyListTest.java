package ss10_dsa_danh_sach.bai_tap;

import java.util.ArrayList;

public class MyListTest {
    public static void main(String[] args) {
    ArrayList<Integer> arrlist = new ArrayList<>();
    arrlist.add(10);
    arrlist.add(20);
    arrlist.add(30);
    arrlist.add(50);
    arrlist.add(760);
    arrlist.add(760);
    arrlist.add(760);
    System.out.println("ArrayList: "
            + arrlist);
    arrlist.ensureCapacity(100);
arrlist.remove(3);
arrlist.remove(5);
arrlist.remove(1);
System.out.println("ArrayList: "
        + arrlist);
}
}
