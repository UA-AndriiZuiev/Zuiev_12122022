package ua_hillel.homework_6;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        SavePerson save = new SavePerson();
        FindPerson find = new FindPerson();
        //============= Ошибка на невозможность отрыть файл (отсутстуие файла)==========//
        try {
            Scanner myScanner = new Scanner(new File("C://input.txt"));
        } catch (Exception e) {
            MyLogger.MyLoggerDebug(e);
        }
        //================= Ошибка обращения к ячейке массива за его пределами =========//
        int[] array = {1, 2, 3};

        try {
            for (int i = 0; array[i] <= 3; i++) {
                System.out.println(array[i]);
            }
        } catch (Exception e) {
            MyLogger.MyLoggerInfo(e);
        }
        //=========================  Класс и две реализации  ===========================//
        Person Stive = new Person("Stive", "Jobs", 41, "+7205789932");
        VipPerson Michael = new VipPerson("Michael", "Jackson", 45, "+790048377", Cards.GC);
        BusinessPerson Elon = new BusinessPerson("Elon", "Musk", 42, "+702234758", "Tesla", "Xte9883748-US");

        System.out.println(Stive.getCreditStatus());
        System.out.println(Michael.getCreditStatus());
        System.out.println(Elon.getCreditStatus());

        System.out.println(Stive.formPerson());
        System.out.println(Michael.formPerson());
        System.out.println(Elon.formPerson());
        //=========================  Ошибки доступа к файлам (отсуствие)  ===========================//
        save.SavePerson(Stive);
        find.FindPerson(Michael);
    }
}