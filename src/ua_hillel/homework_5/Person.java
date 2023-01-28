package ua_hillel.homework_5;
import java.util.Objects;

public class Person implements Callable {
    private String name;
    private String surname;
    private String city;
    private String phoneNumber;

    public Person(String name, String surname, String city, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String call() {
        return "Зателефонувати громадянину " + name + " " + surname + " із міста " + city + " можна за номером " + phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && Objects.equals(city, person.city) && Objects.equals(phoneNumber, person.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, city, phoneNumber);
    }

    public String call(Person person, Person person2) {

        if (equals(person2))
            return "Неможливо телефонувати самому собі - " + person.name + " телефонує " + person2.name;
        else
            return "Громадянин " + person.name + " телефонує громадянину " + person2.name + " на номер " + person2.phoneNumber;
    }

    @Override
    public String call(PersonExtention personExtention_1, PersonExtention personExtention_2) {
        return null;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}