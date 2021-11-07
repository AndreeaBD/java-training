package animalHierarchy;

import MovieDatabase.Film;

public class TestAnimals {
    public static void main(String... args) {
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        System.out.println("\nFISH:");
        d.setName("Nemo");
        System.out.println(d.getName());
        d.eat();
        d.play();
        d.walk();

        System.out.println("\nCAT:");
        System.out.println(c.getName());
        c.setName("Luna");
        System.out.println(c.getName());
        c.eat();
        c.play();
        c.walk();

        System.out.println("\nSPIDER:");
        e.eat();
        e.walk();

        System.out.println("\nPET:");
        System.out.println(p.getName());
        p.setName("Pet");
        System.out.println(p.getName());
        p.play();
    }
}
