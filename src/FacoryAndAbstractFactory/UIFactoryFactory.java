package FacoryAndAbstractFactory;

import javax.management.remote.SubjectDelegationPermission;

public class UIFactoryFactory {

    // practical factory
    public static UIFActory getUIPlateform(SupportedPlateforms plateform){
        return  switch(plateform) {
             case ANDROID->new AndroidPlateform();
             case IOS-> new IosPlateform();
         };
    }
}
