package cz.czechitas.java2webapps.lekce3.entity;

import java.time.LocalDate;
import java.time.LocalTime;

public class Person {
    private String givenName;
    private String surname;
    private LocalDate birthDate;
    private int age;

    public Person () {
    }

    public Person(String givenName, String surname, LocalDate birthDate, int age) {
        this.givenName = givenName;
        this.surname = surname;
        this.birthDate = birthDate;
        this.age = age;
        }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
