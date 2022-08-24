import com.beust.ah.A;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Animal {
    private String name;
    private int age;

    public List<Animal> addAnimal(List<Animal> animalList) {
        Animal animal = new Animal("Ruddie",7);
        animalList.add(animal);
        return animalList;
    }
    public List<Animal> deleteAnimal(List<Animal> animalList) {
        animalList.remove(0);
        return animalList;
    }
}
