package ua_hillel.homework_6;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class MyLogger extends Logger {
    protected MyLogger(String name) {
        super(name);
    }

    public static void MyLoggerInfo(Exception e) {
        System.out.print(Color.BLUE);
        MyLogger.getLogger(MyLogger.class).log(Level.INFO, "Level - Info", e);
        System.out.print(Color.RESET);
    }

    public static void MyLoggerDebug(Exception e) {
        System.out.print(Color.GREEN);
        MyLogger.getLogger(MyLogger.class).log(Level.DEBUG, "Level - Debug", e);
        System.out.print(Color.RESET);
    }

    public static void MyLoggerWarn(Exception e) {
        System.out.print(Color.YELLOW_BRIGHT);
        MyLogger.getLogger(MyLogger.class).log(Level.WARN, "Level - Warn", e);
        System.out.print(Color.RESET);
    }

    public static void MyLoggerError(Exception e) {
        System.out.print(Color.RED_BOLD);
        MyLogger.getLogger(MyLogger.class).log(Level.ERROR, "Level - Error", e);
        System.out.print(Color.RESET);
    }
}