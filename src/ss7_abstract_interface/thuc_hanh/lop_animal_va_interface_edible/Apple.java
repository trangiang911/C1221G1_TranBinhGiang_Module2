package ss7_abstract_interface.thuc_hanh.lop_animal_va_interface_edible;

public class Apple extends Fruit implements IEdible {
    @Override
    public String howtooeat() {
        return "cạp ăn";
    }
}
