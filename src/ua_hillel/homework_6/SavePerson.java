package ua_hillel.homework_6;

import java.io.FileReader;
import java.io.IOException;

public class SavePerson {      // класс для воспроизведения ошибки записи в файл
    FileReader fileWrite;

    public boolean SavePerson(Person person) {
        try {
            fileWrite = new FileReader("А:/Temp/test.txt");
            fileWrite.read();
            fileWrite.close();
        } catch (IOException e) {
            MyLogger.MyLoggerError(e);
        }
        return false;
    }
}