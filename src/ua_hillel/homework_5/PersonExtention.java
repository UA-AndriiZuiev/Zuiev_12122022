package ua_hillel.homework_5;

public class PersonExtention extends Person {
    private boolean activnumber;
    private String status;
    CallPermission callPermission;
    CheckProblemCall checkProblemCall;

    public PersonExtention(String name, String surname, String city, String phoneNumber, boolean activnumber, String status) {
        super(name, surname, city, phoneNumber);
        this.activnumber = activnumber;
        this.status = status;
    }

    public boolean getActivnumber() {
        return activnumber;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String call(PersonExtention personExtention_1, PersonExtention personExtention_2) {
        if (!callPermission.checkToCall(personExtention_1)) {
            return checkProblemCall.checkProblemCall(personExtention_1);
        } else if (!callPermission.checkToCall(personExtention_2)) {
            return checkProblemCall.checkProblemCall(personExtention_2);
        } else if (personExtention_1.equals(personExtention_2)) {
            return "Неможливо телефонувати самому собі - " + personExtention_1.getName() + " iз номером " +
                    personExtention_1.getPhoneNumber() + " телефонуэ " + personExtention_2.getName() + " на номер " + personExtention_2.getPhoneNumber();
        } else {
            return "Громадянин " + personExtention_1.getName() + " телефонує громадянину " + personExtention_2.getName() + " на номер " + personExtention_2.getPhoneNumber();
        }
    }
}