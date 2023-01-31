package ua_hillel.homework_6;

import java.util.Scanner;

public class Person implements CreditPerson, CreateFormPerson {
    private String name;
    private String surname;
    private String phone;
    private int age;
    private Scanner scanner = new Scanner(System.in);

    public Person(String name, String surname, int age, String phone) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.phone = phone;
    }
    @Override
    public String getCreditStatus() throws Exception {
        int INN = 0;
        System.out.println("Enter the INN - ");
        //============= Ошибка при вводе символов =========================//
        try {
            INN = scanner.nextInt();
        } catch (Exception e) {
            MyLogger.MyLoggerInfo(e);
        }

        if (INN >= 50000) {     //  умовний пошук ІНН у БД боржників
            return "The person doesn't have a debt ";
        } else {
            return "The person have a debt ";
        }
    }

    @Override
    public String formPerson() {
        return "Form : " + name + " " + surname + " age " + age + " phone number " + phone;
    }

}