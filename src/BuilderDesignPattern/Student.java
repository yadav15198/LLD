package BuilderDesignPattern;

public class Student {
    private String name;
    private String batch;
    private int rollNum;
    private String address;

    private Student(Helper b){

        System.out.println("student name:"+b.name+" "+b.rollNum);
    }

    public static Helper getBuilder(){
         return new Helper();
    }

    static class Helper{
        String name;
        String batch;
        int rollNum;
        String address;

        public String getName() {
            return name;
        }

        public Helper setName(String name) {
            this.name = name;
            return this;
        }

        public String getBatch() {
            return batch;
        }

        public Helper setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public int getRollNum() {
            return rollNum;
        }

        public Helper setRollNum(int rollNum) {
            this.rollNum = rollNum;
            return this;
        }

        public String getAddress() {
            return address;
        }

        public Helper setAddress(String address) {
            this.address = address;
            return this;
        }

        boolean validate(){
            if(rollNum < 0){
                throw new RuntimeException("roll no can not be less that zero");
            }
            return true;
        }

        public Student build(){
            try{
                validate();
            }
            catch(Exception err){
                System.out.println(err);
                return null;
            }
            return new Student(this);
        }



    }


}
