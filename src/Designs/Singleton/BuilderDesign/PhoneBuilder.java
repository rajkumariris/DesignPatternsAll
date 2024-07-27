package Designs.Singleton.BuilderDesign;

public class PhoneBuilder {
    private String name;
    private String os;
    private String processor;
    private int ram;
    private int battery;

    public PhoneBuilder setName(String name){
        this.name = name;
        return this;
    }

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public  PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setBattery(int battery) {
        this.battery = battery;
        return this;
    }

    public Phone getPhone(){
        return new Phone(name,os,processor,ram,battery);
    }
}
