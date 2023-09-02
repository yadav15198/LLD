package SingletonDesignpattern;

public class Client {

    public static void main(String[] args) {
       Database db =  Database.getDatabaseObject("saurabh");
        Database db1 =  Database.getDatabaseObject("saurabh");
        Database db2 =  Database.getDatabaseObject("saurabh");
        Database db3 =  Database.getDatabaseObject("saurabh");

    }
}
