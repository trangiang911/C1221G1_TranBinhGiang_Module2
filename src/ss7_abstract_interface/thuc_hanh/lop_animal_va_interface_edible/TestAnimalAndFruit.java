package ss7_abstract_interface.thuc_hanh.lop_animal_va_interface_edible;

public class TestAnimalAndFruit {
    public static void main(String[] args) {
        Animal[] animals=new Animal[]{new Tiger(),new Chicken()};
        for (Animal animal:animals){
            System.out.println(animal.makeSound());
        }
        for (Animal animal:animals){
            if(animal instanceof Chicken){
                IEdible iEdible=(Chicken)animal;
                System.out.println(iEdible.howtooeat());
            }
        }
        Fruit[] fruits=new Fruit[]{new Orange(),new Apple()};
        for (Fruit fruit:fruits){
           if(fruit instanceof Orange){
               IEdible iEdible=(Orange)fruit;
               System.out.println(iEdible.howtooeat());
           }
           else {
               IEdible iEdible=(Apple)fruit;
               System.out.println(iEdible.howtooeat());
           }
        }
    }
}
