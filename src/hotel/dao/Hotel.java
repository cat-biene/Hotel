package hotel.dao;

import hotel.model.Pets;

public interface Hotel {

    boolean addPet(Pets pet);
    Pets findPet(int id);
    Pets removePet(int id);
    int quantity();
    Pets[] findPetsByType(String type);
}
