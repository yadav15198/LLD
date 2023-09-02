package SingletonDesignpattern;

public class Database {
    private static Database db;

    private Database(String name){
        System.out.println("database object creation: "+name);
    }

    public static Database getDatabaseObject(String name) {
        if (db == null) {
            synchronized (Database.class) {
                if (db == null) {
                    db = new Database(name);
                }
            }
        }
        return db;
    }
}
