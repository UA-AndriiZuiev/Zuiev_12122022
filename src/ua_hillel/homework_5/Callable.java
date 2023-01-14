package ua_hillel.homework_5;

public interface Callable {
    String call();

    String call(Person person, Person person2);

    String call(PersonExtention personExtention_1, PersonExtention personExtention_2);
}
