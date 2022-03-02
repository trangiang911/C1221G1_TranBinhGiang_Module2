package ss12_java_frame_worl.bai_tap.luyen_tap_su_dung_arraylist_linkedlist.sap_xep;

import ss12_java_frame_worl.bai_tap.luyen_tap_su_dung_arraylist_linkedlist.Product;

import java.util.Comparator;

public class GiamDan implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if(o2.getMoney()>o1.getMoney()){
            return 1;
        }else if (o2.getMoney()<o1.getMoney()){
            return -1;
        }else {
            return 0;
        }
    }
}
