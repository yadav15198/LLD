package PrototypeAndRegistry;

public class Student implements Prototype<Student> {

    private String name ;
    private int age;
    private int enrollmentYear;
    private String address;

    public Student(){}

    public Student(Student st){
        st.name = this.name;
        st.age = this.age;
        st.enrollmentYear = this.enrollmentYear;
        st.address = this.address;
    }

    @Override
    public Student clone() {
        return new Student(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getEnrollmentYear() {
        return enrollmentYear;
    }

    public void setEnrollmentYear(int enrollmentYear) {
        this.enrollmentYear = enrollmentYear;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
