package Designs.Singleton.BuilderDesign.DeepakBuilder;

public class Student {

    private String name;
    private String rollNo;
    private String address;
    private String phone;
    private String email;

    public Student(StudentBuilder studentBuilder){
        //validate start
        if(studentBuilder.getName() == null || studentBuilder.getName().isEmpty()){
            throw new IllegalArgumentException("Name is required");
        }

        if(studentBuilder.getRollNo() == null || studentBuilder.getRollNo().isEmpty()){
            throw new IllegalArgumentException("RollNo is required");
        }
        //all validation passed
        this.name = studentBuilder.getName();
        this.rollNo = studentBuilder.getRollNo();
        this.address = studentBuilder.getAddress();
        this.phone = studentBuilder.getPhone();
        this.email = studentBuilder.getEmail();






        //validate end
    }
    static class StudentBuilder {
        private String name;
        private String rollNo;
        private String address;
        private String phone;
        private String email;


        private StudentBuilder(){

        }
        public String getName() {
            return name;
        }

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public String getRollNo() {
            return rollNo;
        }

        public StudentBuilder setRollNo(String rollNo) {
            this.rollNo = rollNo;
            return this;
        }

        public String getAddress() {
            return address;
        }

        public StudentBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public String getPhone() {
            return phone;
        }

        public StudentBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public String getEmail() {
            return email;
        }

        public StudentBuilder setEmail(String email) {
            this.email = email;
            return this;
        }



        public Student build(){
            return new Student(this);
        }
    }
    public static StudentBuilder getStudentBuilder(){
        return new StudentBuilder();
    }

}
