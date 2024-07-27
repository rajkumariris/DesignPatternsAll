package Designs.Singleton.BuilderDesign;

public class Phone {
    private String name;
    private String os;
    private String processor;
    private int ram;
    private int battery;

    public Phone(String name, String os, String processor, int ram, int battery){
        this.battery= battery;
        this.ram = ram;
        this.name= name;
        this.os= os;
        this.processor= processor;
    }

    @Override
    public String toString() {
        return "hello"+name+"os"+os;
    }
}
