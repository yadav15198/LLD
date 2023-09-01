package DesignBird;

public class Parrot extends Bird implements Flyable,Eatable {

    FlyingBehaviour fb;

    Parrot(String name, String colour, String species,FlyingBehaviour f) {
        super(name, colour, species);
        this.fb = f;
    }

    @Override
    void walk() {
        System.out.println("parrot walk");
    }

    @Override
    public void eat() {
       System.out.println("parrot eat");
    }

    @Override
    public void fly() {
      fb.makeFly();
    }
}
