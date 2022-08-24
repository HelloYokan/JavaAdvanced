import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class MainTest {
    private User user;
    private Adress adress;
    private List<Animal> animalList;
    private Animal animal;

    @BeforeEach
    public void init() {
        animalList = new ArrayList<>();
        animal = new Animal("John",5);
        animalList.add(animal);
        adress= new Adress("Lviv","Valova");
        user = new User("Mike", adress,17,animalList);
    }

    @DisplayName("Test age")
    @Test
    public void testAgeThrowExeption() {
        Assertions.assertThrows(Exception.class, ()-> user.testAge());
    }

    @DisplayName("Add address test")
    @Test
    public void addAddressTest() {
        System.out.println(user.getAdress());
        System.out.println(adress.addAddress(user));
        Assertions.assertNotSame(user.getAdress(), adress.addAddress(user));
    }

    @DisplayName("Delete address test")
    @Test
    public void deleteAddressTest() {
        System.out.println(adress.deleteAddress(user));
        Assertions.assertNull(adress.deleteAddress(user));
    }

    @DisplayName("Add animal to animal list")
    @Test
    public void addAnimalTest() {
        System.out.println(animalList);
        System.out.println(animal.addAnimal(animalList));
        Assertions.assertEquals(animal.addAnimal(animalList),animalList);
    }

    @DisplayName("Remove animal test")
    @Test
    public void removeAnimalTest() {
        System.out.println("Your old list of animals : " + user.getAnimalList());
        animal.addAnimal(animalList);
        System.out.println("Your new list of animals : " + user.getAnimalList());
        Assertions.assertEquals(animal.deleteAnimal(animalList),animalList);
        System.out.println("You've deleted one animal and now you have : " + user.getAnimalList());
    }

    @DisplayName("Change name test")
    @Test
    public void changeNameTest() {
        System.out.println("Your current name is : " + user.getFirstName());
        Assertions.assertEquals(user.changeName(), user.getFirstName());
        System.out.println("Your new name is : " + user.getFirstName());
    }
}
