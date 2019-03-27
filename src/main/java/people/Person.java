package people;

/*
    This is an example POJO (Plain Old Java Object) that provides all the functionality we need
    The class PersonLombok.java provides the same functionality as this class but uses Lombok
 */

import java.util.Objects;

public class Person {

    private final String firstName;
    private final String lastName;
    private int age;
    private double weight;
    private double height;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Person)) return false;
        Person other = (Person) o;
        if (this.getFirstName()  == null ? other.getFirstName() != null : !(this.getFirstName().equals(other.getFirstName()))) return false;
        if (this.getLastName()  == null ? other.getLastName() != null : !(this.getLastName().equals(other.getLastName()))) return false;
        if (this.getAge() != other.getAge()) return false;
        if (Double.compare(this.getHeight(), other.getHeight()) != 0) return false;
        return (Double.compare(this.getWeight(), other.getWeight()) == 0);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, weight, height);
    }

}