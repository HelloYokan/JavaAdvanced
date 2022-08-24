import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
class User {
    private String firstName;
    private Adress adress;
    private int age;
    private List<Animal> animalList;

    public void testAge() throws Exception {
        if (age < 18 ) throw new Exception("You are under 18, sorry");
    }
    public String changeName() {
        setFirstName("Vlad");
        return firstName;
    }
}