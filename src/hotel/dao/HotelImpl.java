package hotel.dao;

import hotel.model.Pets;

public class HotelImpl implements Hotel{

    //fields of class
    private Pets[] pets; // arrays for storing pets
    private int size; // current number of pets in the hotel

    //constructor
    public HotelImpl(int capasity) {
        pets = new Pets[capasity];
    }

    @Override
    public boolean addPet(Pets pet) {
        if(pet == null || size == pets.length || findPet(pet.getId()) != null) {
            return false;
        }
        pets[size++] = pet;
        return true;
    }

    @Override
    public Pets findPet(int id) {
        for (int i = 0; i < size; i++) {
            if(pets[i].getId() == id) {
                return pets[i];
            }
        }
        return null;
    }

    @Override
    public Pets removePet(int id) {
        for (int i = 0; i < size; i++) {
            if (pets[i].getId() == id) {
                Pets removePet = pets[i];
                pets[i] = pets[size - 1];
                pets[size - 1] = null;
                size--;
                return removePet;
            }
        }
        return null;
    }

    @Override
    public int quantity() {
        return size;
    }

    @Override
    public Pets[] findPetsByType(String type) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if(pets[i].getType().equals(type)) {
                count++;
            }
        }
        Pets[] res = new Pets[count];
        for (int i = 0, j = 0; j < res.length; i++) {
            if(pets[i].getType().equals(type)) {
                res[j++] = pets[i];
            }
        }
        return res;
    }
}
