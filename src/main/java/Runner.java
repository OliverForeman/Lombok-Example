import people.Person;
import people.PersonLombok;

/*
    This class shows how the classes Person and PersonLombok provide the same functionality using different implementation techniques
    The output and use of the two classes looks the same however creating the Lombok class takes far less time
 */

public class Runner {

    public static void main(String[] args) {
        /*
            Using our own class
         */

        System.out.println("Using our class\n");

        //Create a person from the class we implemented ourselves
        Person person = new Person("Oliver", "Foreman");
        //Use the setters to set the fields
        person.setAge(22);
        person.setHeight(180);
        person.setWeight(55);

        //Use the getters to print the fields
        System.out.println("First Name: " + person.getFirstName());
        System.out.println("Last Name: " + person.getLastName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Height: " + person.getHeight());
        System.out.println("Weight: " + person.getWeight());

        //Uses toString to print the whole object
        System.out.println("Object: " + person);

        //Create a new person
        Person person1 = new Person("Oliver", "Foreman");
        //Here the fields don't match
        System.out.println("Equals test 1: " + person.equals(person1));
        person1.setAge(22);
        person1.setHeight(180);
        person1.setWeight(55);
        //Now the fields do match
        System.out.println("Equals test 2: " + person.equals(person1));

        /*
            Using Lombok
         */

        System.out.println("\nUsing Lombok class\n");

        //Create a person from the class we implemented ourselves
        PersonLombok personLombok = new PersonLombok("Oliver", "Foreman");
        //Use the setters to set the fields
        personLombok.setAge(22);
        personLombok.setHeight(180);
        personLombok.setWeight(55);

        //Use the getters to print the fields
        System.out.println("First Name: " + personLombok.getFirstName());
        System.out.println("Last Name: " + personLombok.getLastName());
        System.out.println("Age: " + personLombok.getAge());
        System.out.println("Height: " + personLombok.getHeight());
        System.out.println("Weight: " + personLombok.getWeight());

        //Uses toString to print the whole object
        System.out.println("Object: " + personLombok);

        //Create a new person
        PersonLombok personLombok1 = new PersonLombok("Oliver", "Foreman");
        //Here the fields don't match
        System.out.println("Equals test 1: " + personLombok.equals(personLombok1));
        personLombok1.setAge(22);
        personLombok1.setHeight(180);
        personLombok1.setWeight(55);
        //Now the fields do match
        System.out.println("Equals test 2: " + personLombok.equals(personLombok1));
    }

}
