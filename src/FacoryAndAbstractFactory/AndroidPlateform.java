package FacoryAndAbstractFactory;

public class AndroidPlateform implements UIFActory{

    @Override
    public void createButton() {
          System.out.println("this will call android Button");
    }

    @Override
    public void createMenu() {
        System.out.println("this will call android menu");

    }

    @Override
    public void createDropdown() {
        System.out.println("this will call android dropdown");
    }
}
