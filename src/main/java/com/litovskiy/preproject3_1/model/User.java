package com.litovskiy.preproject3_1.model;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "age")
    private Integer age;


    public User() {}
    public User(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public User(Long id, String firstName, String lastName, Integer age) {
        this(firstName, lastName, age);
        this.id = id;
    }

    @Override
    public String toString() {
        return "Id = " + id
                + "\nFirst Name = " + firstName
                + "\nLast Name = " + lastName
                + "\nAge = " + age;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
