package animalHierarchy;

public class Fish extends Animal implements Pet {
    private String name;

    public Fish() {
        super(0);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName (String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Fish like to play!");
    }

    @Override
    public void walk() {
        System.out.println("Fish don't walk and don't have legs!");
    }

    @Override
    public void eat() {
        System.out.println("Fish eat other fish.");
    }
}
