package Designs.Singleton.FactoryDesign;

public class OperatingSystemFactory {
//this factory will return object on the based of the condition
    public static OS osFactoryMethod(String str){
        if(str =="android"){
           return new Android();
        }
        else if(str=="Windows"){
            return new Windows();
        }
        return new Linux();
    }
}
