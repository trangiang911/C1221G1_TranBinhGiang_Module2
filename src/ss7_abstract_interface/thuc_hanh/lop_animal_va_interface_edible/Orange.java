package ss7_abstract_interface.thuc_hanh.lop_animal_va_interface_edible;

public class Orange extends Fruit implements IEdible {
    @Override
    public String howtooeat() {
        return "Bóc ăn";
    }
}
