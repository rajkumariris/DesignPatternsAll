package Designs.Singleton.BuilderDesign.DeepakBuilder;

public class Client {
    public static void main(String[] args) {
        //we do this to not to happen this
        // Student student = new Student(null); this gives error


        //this looks more readable but
        //this is not returning object of StudentBuilder so we make setter return object of StudentBuilder
        //this returning object of StudentBuilder
        Student studentBuilder = Student.getStudentBuilder()
                .setPhone("1234567890")
                .setAddress("Bangalore")
                .setEmail("omeaga@gmail.com")
                .setName("Deepak")
                .build();





//        studentBuilder.setName("Deepak");
//        //studentBuilder.setRollNo(");
//        studentBuilder.setAddress("Bangalore");
//        studentBuilder.setPhone("1234567890");
//        studentBuilder.setEmail("deepak@gmail.com");

       // Student student = new Student(studentBuilder);
    }
}
