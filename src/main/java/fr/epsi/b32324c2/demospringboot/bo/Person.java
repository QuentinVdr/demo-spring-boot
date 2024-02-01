package fr.epsi.b32324c2.demospringboot.bo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Person {
    @Id
    @GeneratedValue()
    private Long id;

    private String firstName;

    private String lastName;

    public Person() {
    }
}
