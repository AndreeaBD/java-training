package Proxy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class RealEstateAgentProxy extends Apartment{
    ArrayList<Apartment> apartments = new ArrayList<>();

    void represent(Apartment apartment){
        apartments.add(apartment);
    };

    Apartment rent(Student student){
        Collections.sort(apartments);
        Apartment rentedApp = new Apartment();

        if (student.getName().startsWith("P")) {
            rentedApp = null;
        } else {
            for (int i = 0; i < apartments.size(); i++) {
                if (student.getMoney() >= apartments.get(i).monthlyRentCost && apartments.get(i).isNotRented()) {
                    rentedApp = apartments.get(i);
                    break;
                }
            }
        }

        return rentedApp;
    };
}
