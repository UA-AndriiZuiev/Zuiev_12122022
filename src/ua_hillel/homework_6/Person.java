package ua_hillel.homework_6;

import java.util.Scanner;

public class Person implements CreditPerson {
    Scanner scanner = new Scanner(System.in);

    public Person(String name, String surname, int age, String phone) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.phone = phone;
    }

    private String name;
    private String surname;
    private String phone;
    private int age;

    public String cardPerson() {
        return "Card : " + name + " " + surname + " age " + age + " phone number " + phone;
    }


    @Override
    public boolean getCreditStatus() throws Exception {
        int INN = 0;
        System.out.println("Enter the INN - ");

        try {
            INN = scanner.nextInt();
        } catch (Exception e) {
            MyLogger.MyLoggerInfo(e);
        }

        if (INN >= 50000) {     //  умовний пошук ІНН у БД боржників
            System.out.println("The person doesn't have a debt ");
            return true;
        } else {
            System.out.println("The person have a debt ");
            return false;
        }
    }
}