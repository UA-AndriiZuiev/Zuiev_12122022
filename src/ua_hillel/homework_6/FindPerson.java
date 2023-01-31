package ua_hillel.homework_6;

import java.io.FileReader;
import java.io.IOException;

public class FindPerson {     // класс для воспроизведения ошибки открытия файла

    public boolean FindPerson(Person person) {
        FileReader fileRead = null;
        try {
            fileRead = new FileReader("C:/Temp/DataBase.txt");
            fileRead.read();
            fileRead.close();
        } catch (IOException e) {
            MyLogger.MyLoggerWarn(e);
        }
        return true;
    }
}