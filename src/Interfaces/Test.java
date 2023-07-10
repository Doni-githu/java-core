package Interfaces;

public class Test {
    public static void main(String[] args) {
        Info animal1 = new Animal(5);
        Info person1 = new Person("Doniyor");
        animal1.showInfo();
        person1.showInfo();
    }
}
