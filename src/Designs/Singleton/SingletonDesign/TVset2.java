package Designs.Singleton.SingletonDesign;

public class TVset2 {
    private static TVset2 ourInstance = new TVset2();

    public static TVset2 getInstance() {
        return ourInstance;
    }

    private TVset2() {
    }
}
