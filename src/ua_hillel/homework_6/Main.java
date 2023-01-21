package ua_hillel.homework_6;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        SavePerson save = new SavePerson();
        FindPerson find = new FindPerson();
        //=================================================================//
        try {
            Scanner myScanner = new Scanner(new File("C://input.txt"));
        } catch (Exception e) {
            MyLogger.MyLoggerDebug(e);
        }
        //=============================================================================//
        int[] array = {1, 2, 3};

        try {
            for (int i = 0; array[i] <= 3; i++) {
                System.out.println(array[i]);
            }
        } catch (Exception e) {
            MyLogger.MyLoggerInfo(e);
        }
        //==============================================================================//
        Person Stive = new Person("Stive", "Jeckson", 34, "+7205789932");

        Stive.getCreditStatus();

        System.out.println(Stive.cardPerson());

        save.SavePerson(Stive);

        find.FindPerson(Stive);
    }
}