package PrototypeAndRegistry;

public class Client {

    public static  void fillRegistry(Registry registry){
        Student st = new Student();
        st.setName("Saurabh");
        st.setAge(25);
        st.setAddress("Patna,Bihar");
        st.setEnrollmentYear(2016);

        TopperStudent ts = new TopperStudent();
        ts.setCgpa(9);
        ts.setName("Ram");

        registry.Register("2k16topper",ts);
        registry.Register("2016Student",st);
    }

    public static void main(String[] args) {
        Registry r = new Registry();
        fillRegistry(r);
        Student st2017 = r.get("2016Student").clone();
        Student st2018 = r.get("2016Student").clone();
        Student st2019= r.get("2016Student").clone();

        st2017.setName("shyam");
        st2017.setEnrollmentYear(2017);

        System.out.println(st2017);
        System.out.println(st2018);
        System.out.println(st2019);






    }
}
