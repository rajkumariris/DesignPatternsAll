package Designs.Singleton.BuilderDesign;

public class Client {
    public static void main(String[] args) {
        // we dont want to set every variable so we create phonebuilder and create set method
        // and set those varaible and with getphone() method pass those paramters to phone object
        // creating phone object and returns that
        Phone phone = new PhoneBuilder().setName("oneplus").setOs("snapdragon").getPhone();
        System.out.println(phone.toString());
    }
}
