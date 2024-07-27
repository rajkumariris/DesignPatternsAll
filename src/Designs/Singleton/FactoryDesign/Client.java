package Designs.Singleton.FactoryDesign;

public class Client {
    public static void main(String[] args) {

        // if we are doing like this client will get to know which os we are doing with
        //either android, windows, linux we dont want that
        // if we want a create another object factorymethod will create and give it to us
        OS operate = OperatingSystemFactory.osFactoryMethod("android");
        operate.spec();
    }
}
