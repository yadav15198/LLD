package FacoryAndAbstractFactory;

public class Client {
    public static void main(String[] args) {
        Flutter android = new Flutter(SupportedPlateforms.ANDROID);
        Flutter ios = new Flutter(SupportedPlateforms.IOS);
        UIFActory ui1 = android.createUIFactory();
        UIFActory ui2 = ios.createUIFactory();
        ui1.createButton();
        ui2.createMenu();
        ui2.createDropdown();


    }
}
