package FacoryAndAbstractFactory;

public class UIFactoryFactory {

    // practical factory
    public static UIFactory getUIPlateform(SupportedPlateforms plateform){
        return  switch(plateform) {
             case ANDROID->new AndroidPlateform();
             case IOS-> new IosPlateform();
         };
    }
}
