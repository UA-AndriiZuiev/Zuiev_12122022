package ua_hillel.homework_6;

public class BusinessPerson extends Person {
    public BusinessPerson(String name, String surname, int age, String phone, String company, String license) {
        super(name, surname, age, phone);
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.phone = phone;
        this.company = company;
        this.license = license;
    }

    private String name;
    private String surname;
    private String phone;
    private int age;
    private String company;
    private String license;


    @Override
    public String formPerson() {
        return "Form : " + name + " " + surname + " age " + age + " phone number " + phone + " Company - " + company + " License : " + license;
    }
}