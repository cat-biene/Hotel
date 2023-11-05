package hotel.test;

import hotel.dao.Hotel;
import hotel.dao.HotelImpl;
import hotel.model.Cat;
import hotel.model.Dog;
import hotel.model.Pets;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HotelImplTest {

    Hotel hotel;
    Pets [] pet;

    @BeforeEach
    void setUp() {
        hotel = new HotelImpl(4);
        pet = new Pets[3];
        pet[0] = new Cat(101, "Dima", 2, 1, "cat", 10);
        pet[1] = new Dog(102, "Rick", 6, 40, "dog",30);
        pet[2] = new Cat(103, "Murka", 10, 3, "cat",10);

        for (int i = 0; i < pet.length; i++) {
            hotel.addPet(pet[i]);
        }

    }

    @Test
    void addPet() {
        // null
        assertFalse(hotel.addPet(null));
        // not add existing
        assertFalse(hotel.addPet(pet[1]));
        // add pet
        Pets pets = new Pets(104, "Mimi", 4, 5,"Parrot");
        assertTrue(hotel.addPet(pets));
        // current number of pets in the hotel
        Pets pets1 = new Pets(105, "Misi", 5, 5, "Parrot");
        assertFalse(hotel.addPet(pets1));

    }

    @Test
    void findPet() {
        // find pets
        assertEquals(pet[1], hotel.findPet(102));
    }

    @Test
    void removePet() {
        // delete pets
        assertEquals(pet[1], hotel.removePet(102));
        // not find delete pets
        assertNull(hotel.findPet(102));
    }

    @Test
    void quantity() {
        // size
        assertEquals(3, hotel.quantity());
    }

    @Test
    void findPetsByType() {
        // find pet by type
        Pets[] actual = {pet[0], pet[2]};
        Pets[] expected = hotel.findPetsByType("cat");
        assertArrayEquals(expected, actual);
    }
}