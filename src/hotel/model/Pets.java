package hotel.model;

import java.util.Objects;

public class Pets implements Comparable<Pets>{

    // fields of class
    private int id;
    private String name;
    private int age;
    private int weight;
    private String type;

    // constructor
    public Pets(int id, String name, int age, int weight, String type) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.type = type;
    }

    // getter and setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // method toString
    @Override
    public String toString() {
        return "Pets{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", type='" + type + '\'' +
                '}';
    }

    // method equals and hashCode
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Pets pets = (Pets) object;
        return id == pets.id && age == pets.age && weight == pets.weight && Objects.equals(name, pets.name) && Objects.equals(type, pets.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, weight, type);
    }

    // method compareTo
    @Override
    public int compareTo(Pets o) {
        return Integer.compare(this.getId(), o.getId());
    }
}
