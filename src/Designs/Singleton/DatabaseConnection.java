package Designs.Singleton;

public class DatabaseConnection {

    private String url;
    private String password;
    private String username;

    private static DatabaseConnection instance;

    public static DatabaseConnection getInstance(){
        //if multiple threadsa re commming first it check instance null yes both goes inside
        // there synch block . only one thread allowed first thread creates object
        // 2nd thread goes inside and check instance created so return existing instance
        // use of first if block if multiple threads checking instance already exist it wont even go inside
        // lock
        if(instance==null){
            // lock over class not instance bcoz instance can be null
            synchronized (DatabaseConnection.class){
                if(instance==null){
                    instance = new DatabaseConnection();
                }
            }
        }
        return  instance;
    }

}
