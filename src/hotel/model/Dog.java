package hotel.model;

import java.util.Objects;

public class Dog extends Pets {

    // fields os class
    private double priceDay;

    // constructor
    public Dog(int id, String name, int age, int weight, String type, double priceDay) {
        super(id, name, age, weight, type);
        this.priceDay = priceDay;
    }

    // getter and setter
    public double getPriceDay() {
        return priceDay;
    }

    public void setPriceDay(double priceDay) {
        this.priceDay = priceDay;
    }

    // method toString
    @Override
    public String toString() {
        return "Dog{" +
                "priceDay='" + priceDay + '\'' +
                "} " + super.toString();
    }

    //method equals and hashCode
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Dog dog = (Dog) object;
        return Objects.equals(priceDay, dog.priceDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), priceDay);
    }
}