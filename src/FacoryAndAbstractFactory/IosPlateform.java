package FacoryAndAbstractFactory;

public class IosPlateform implements UIFActory{
    @Override
    public void createButton() {
        System.out.println("this will call ios button");
    }

    @Override
    public void createMenu() {
        System.out.println("this will call ios menu");
    }

    @Override
    public void createDropdown() {
        System.out.println("this will call ios dropdown");
    }
}
