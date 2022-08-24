import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        Animal animal = new Animal("John",5);
        animalList.add(animal);
        Adress adress = new Adress("Lviv","Valova");
        User user = new User("Mike", adress,17,animalList);
    }

}
