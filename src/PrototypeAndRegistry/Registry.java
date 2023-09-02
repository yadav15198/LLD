package PrototypeAndRegistry;
import java.util.Map;
import java.util.HashMap;

public class Registry {


    Map<String,Student> mp = new HashMap<>();

     void Register(String key,Student student){
         mp.put(key,student);
     }

     Student get(String key){
         return mp.get(key);
     }
}
