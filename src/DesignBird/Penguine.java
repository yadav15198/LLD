package DesignBird;

public class Penguine extends Bird implements Eatable{


    Penguine(String name, String colour, String species) {
        super(name, colour, species);
    }

    @Override
    void walk() {
      System.out.println("Penguine walk");
    }

    @Override
    public void eat() {
     System.out.println("penguine eat");
    }
}
