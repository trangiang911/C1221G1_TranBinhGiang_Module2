package ss7_abstract_interface.thuc_hanh.lop_animal_va_interface_edible;

public class Chicken extends Animal implements IEdible {
    @Override
    public String makeSound() {
        return "chicken:cuc-cuc";
    }

    @Override
    public String howtooeat() {
        return "Luộc nó";
    }
}
