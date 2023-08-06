
import java.util.HashMap;
import java.util.Map;

public class Registry {

    // private ArrayList registry= new ArrayList<Animal>();
    static Map<Integer, Animal> registry = new HashMap<>();

    public Integer number_of_animals(){
        return registry.size();
    }
        

    public static void add_cat( String name, String command, String birth_date, Integer id_animal){
        Cat cat = new Cat(name, birth_date);
        cat.addCommand(command);
        registry.put(id_animal, cat);

    }
        
    public static void add_dog( String name, String command, String birth_date, Integer id_animal){
        Dog dog = new Dog(name, birth_date);
        dog.addCommand(command);
        registry.put(id_animal, dog);
    }

    public static void add_hamster( String name, String command, String birth_date, Integer id_animal){
        Hamster hamster = new Hamster(name, birth_date);
        hamster.addCommand(command);
        registry.put(id_animal, hamster);
    }
    
    
    public static void add_camel(String name, String command, String birth_date, Integer id_animal){
       Camel camel = new Camel(name, birth_date);
       camel.addCommand(command);
       registry.put(id_animal, camel);
    }
        
    public static void add_horse( String name, String command, String birth_date, Integer id_animal){
       Horse horse = new Horse(name, birth_date);
       horse.addCommand(command);
       registry.put(id_animal, horse);
    }

    public static void add_donkey( String name, String command, String birth_date, Integer id_animal){
       Donkey donkey = new Donkey(name, birth_date);
       donkey.addCommand(command);
       registry.put(id_animal, donkey);
    }
       
}
