package exercise4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingCenter {
    private Map<Person, List<Vehicle>> map;
    public ShoppingCenter (){
        map = new HashMap<>();
    }
    public void registerPerson (Person person){
        if (person == null){
            System.out.println("Invalid person credentials.");
        } else{
            map.put(person, new ArrayList<Vehicle>());
            System.out.println(person.getSurname() + " " + person.getName() + " has been registered");
        }
    }
}
