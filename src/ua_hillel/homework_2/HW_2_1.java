package ua_hillel.homework_2;
import java.util.*;

public class HW_2_1 {
    public static void main(String[] args)
    {
        int celsius;
        double faringate;
        double kelvin;

        Scanner scan = new Scanner(System.in);
        System.out.print("Input temperature (⁰C) - ");
        celsius= scan.nextInt();

        faringate = (celsius * 9 / 5) + 32;
        kelvin = (celsius + 273.16);
        System.out.println(celsius + " C; " + faringate + " F; " + kelvin +" K;");
    }
}
