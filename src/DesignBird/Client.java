package DesignBird;

public class Client {

    public static void main(String[] args) {

        Bird b1 = new Parrot("Mithu","green","old",new parrotFlyingBehaviour());

        System.out.println(b1);

        Bird b2 = new Penguine("pengu","BalckAndWhite","new");

        System.out.println(b2);
    }
}
