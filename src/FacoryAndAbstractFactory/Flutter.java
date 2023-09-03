package FacoryAndAbstractFactory;

public class Flutter  {
     SupportedPlateforms plateform;

    public Flutter(SupportedPlateforms plateform){
         this.plateform = plateform;
     }
     public void setTheme(String theme){
         System.out.println("setting theme");
     }

     //this is the factory method
     public  UIFActory createUIFactory(){
         return UIFactoryFactory.getUIPlateform(this.plateform);
     }
}
