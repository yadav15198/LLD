package BuilderDesignPattern;

public class Client {
    public static void main(String[] args) {
        Student st = Student.getBuilder().setName("Saurabh").setRollNum(-1).setBatch("Interview preparation").build();

    }
}
