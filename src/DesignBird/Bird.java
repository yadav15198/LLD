package DesignBird;

abstract public class Bird {
    private String colour;
    private String name;
    private String species;

    Bird(String name, String colour, String species){
        this.name = name;
        this.colour = colour;
        this.species = species;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "colour='" + colour + '\'' +
                ", name='" + name + '\'' +
                ", species='" + species + '\'' +
                '}';
    }

    abstract void walk();
}
