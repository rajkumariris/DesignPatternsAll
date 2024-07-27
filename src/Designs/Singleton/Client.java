package Designs.Singleton;

public class Client {
    public static void main(String[] args) {

        //both varibales having the same address
        //these getinstance methods are static method that y calling with class name
        // return databaseConnection type

        DatabaseConnection dbc1 = DatabaseConnection.getInstance();
        DatabaseConnection dbc2 = DatabaseConnection.getInstance();
    }



}
