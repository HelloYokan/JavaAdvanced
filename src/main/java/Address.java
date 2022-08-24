import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Scanner;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Adress {
    private String city;
    private String street;

    public Adress addAddress(User user) {
        city = "Kyiv";
        street = "Hreshatyk";
        Adress newAddress = new Adress(city, street);
        user.setAdress(newAddress);
        return newAddress;
    }
    public Adress deleteAddress(User user) {
        Adress newAddress = null;
        user.setAdress(newAddress);
        return newAddress;
    }
}
