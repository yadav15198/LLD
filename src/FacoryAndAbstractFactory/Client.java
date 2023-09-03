package FacoryAndAbstractFactory;

public class Client {
    public static void main(String[] args) {
        Flutter android = new Flutter(SupportedPlateforms.ANDROID);
        Flutter ios = new Flutter(SupportedPlateforms.IOS);
        UIFactory ui1 = android.createUIFactory();
        UIFactory ui2 = ios.createUIFactory();
        ui1.createButton();
        ui2.createMenu();
        ui2.createDropdown();


    }
}
