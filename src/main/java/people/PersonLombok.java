package people;

import lombok.Data;

/*
    This is an example POJO (Plain Old Java Object) that uses Lombok to provide all the functionality we need
    The class Person.java provides the same functionality as this class but does not use Lombok

    The @Data tag from Lombok provides us with:
        -> Getters and Setters for all non-final fields
        -> A toString method for logging/printing out the class
        -> An equals method and hash code method for comparing objects
        -> A constructor that will accept parameters for the final fields

    The functionality of @Data can be provided separately through the tags:
        -> @Getter
        -> @Setter
        -> @ToString
        -> @EqualsAndHashCode
        -> @RequiredArgsConstructor

    Lombok Features: https://projectlombok.org/features/all
 */

@Data
public class PersonLombok {

    private final String firstName;
    private final String lastName;
    private int age;
    private double weight;
    private double height;

}
