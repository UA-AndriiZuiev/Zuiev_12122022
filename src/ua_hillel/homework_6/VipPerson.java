package ua_hillel.homework_6;

public class VipPerson extends Person implements CreateFormPerson {
    public VipPerson(String name, String surname, int age, String phone, Cards VipStatus) {
        super(name, surname, age, phone);
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.phone = phone;
    }

    private String name;
    private String surname;
    private String phone;
    private int age;

    @Override
    public String formPerson() {
        return "Form : " + name + " " + surname + " age " + age + " phone number " + phone + " VIP Status - " + Cards.GC;
    }
}