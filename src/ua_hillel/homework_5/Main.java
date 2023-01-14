package ua_hillel.homework_5;

public class Main {
    private static String[] nameInit = {"Will", "Jackie", "Sherlock"};
    private static String[] surnameInit = {"Smith", "Chan", "Holmes"};
    private static String[] cityInit = {"New York", "Shanghai", "London"};
    private static String[] phoneNumberInit = {"+11073273611", "+22937766322", "+3399287733"};
    private static boolean[] activnumber = {true, false, true};
    private static String[] status = {Balance.no_debt.toString(), Balance.have_a_debt.toString(), Balance.unlimited.toString()};

    public static void main(String[] args) {
        for (int count = 0; count < nameInit.length; count++) {
            Callable callable = new Person(nameInit[count], surnameInit[count], cityInit[count], phoneNumberInit[count]);
            System.out.println(callable.call());
        }
        System.out.print("\n");
        for (int count_1 = 0; count_1 < nameInit.length; count_1++) {
            for (int count_2 = 0; count_2 < nameInit.length; count_2++) {
                Person person = new Person(nameInit[count_1], surnameInit[count_1], cityInit[count_1], phoneNumberInit[count_1]);
                Person person2 = new Person(nameInit[count_2], surnameInit[count_2], cityInit[count_2], phoneNumberInit[count_2]);
                Callable callable = new Person(nameInit[count_1], surnameInit[count_1], cityInit[count_1], phoneNumberInit[count_1]);
                System.out.println(callable.call(person, person2));
            }
        }
        System.out.print("\n");
        for (int count_1 = 0; count_1 < nameInit.length; count_1++) {
            for (int count_2 = 0; count_2 < nameInit.length; count_2++) {
                PersonExtention personEx_1 = new PersonExtention(nameInit[count_1], surnameInit[count_1], cityInit[count_1],
                        phoneNumberInit[count_1], activnumber[count_1], status[count_1]);
                PersonExtention personEx_2 = new PersonExtention(nameInit[count_2], surnameInit[count_2], cityInit[count_2],
                        phoneNumberInit[count_2], activnumber[count_1], status[count_1]);
                Callable callable = new PersonExtention(nameInit[count_1], surnameInit[count_1], cityInit[count_1],
                        phoneNumberInit[count_1], activnumber[count_1], status[count_1]);
                System.out.println(callable.call(personEx_1, personEx_2));
            }
        }
    }
}
