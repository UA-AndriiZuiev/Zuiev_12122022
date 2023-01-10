package ua_hillel.homework_3;

import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        int number = 5;
        String oddEven;
        String month;
        Scanner scanner = new Scanner(System.in);

        //-------------------------------------------------//
        oddEven = checkOddEven(number);
        System.out.println(oddEven);
        System.out.println("BYE");
        //-------------------------------------------------//
        System.out.println(printMonthInWord_1(number));
        month = printMonthInWord_2(number + 1);
        System.out.println(month);
        //-------------------------------------------------//
        System.out.print("Введіть два числа для визначення більшого з них значення - ");
        int number_1 = scanner.nextInt();
        int number_2 = scanner.nextInt();
        magnitude(number_1, number_2);
        //-------------------------------------------------//
        int side_1 = 8;
        int side_2 = 8;
        int side_3 = 8;

        triangle(side_1, side_2, side_3);
    }

    public static String checkOddEven(int i) {
        if ((i % 2) == 0) {
            return "Even Number";
        } else {
            return "Odd Number";
        }
    }

    public static String printMonthInWord_1(int i) {
        if (i == 1) {
            return "JAN";
        } else if (i == 2) {
            return "FEB";
        } else if (i == 3) {
            return "MAR";
        } else if (i == 4) {
            return "APR";
        } else if (i == 5) {
            return "MAY";
        } else if (i == 6) {
            return "JUN";
        } else if (i == 7) {
            return "JUL";
        } else if (i == 8) {
            return "AUG";
        } else if (i == 9) {
            return "SEP";
        } else if (i == 10) {
            return "OCT";
        } else if (i == 11) {
            return "NOV";
        } else if (i == 12) {
            return "DEC";
        } else {
            return "Not a valid month";
        }
    }

    public static String printMonthInWord_2(int i) {
        switch (i) {
            case 1:
                return "JAN";
            case 2:
                return "FAB";
            case 3:
                return "MAR";
            case 4:
                return "APR";
            case 5:
                return "MAY";
            case 6:
                return "JUN";
            case 7:
                return "JUL";
            case 8:
                return "AUG";
            case 9:
                return "SEP";
            case 10:
                return "OCT";
            case 11:
                return "NOV";
            case 12:
                return "DEC";
            default:
                return "Not a valid month";
        }
    }

    public static void magnitude(int number_1, int number_2) {
        if (Math.abs(number_1) > Math.abs(number_2)) {
            System.out.println("Число " + number_1 + " має велику величину");
        } else if (Math.abs(number_1) < Math.abs(number_2)) {
            System.out.println("Число " + number_2 + " має велику величину");
        } else {
            System.out.println("Числа " + number_1 + " и " + number_2 + " мають однакову величину");
        }
    }

    public static void triangle(int side_1, int side_2, int side_3) {

        if (side_1 == side_2 || side_1 == side_3 || side_2 == side_3){
            System.out.println("Трикутник рівнобедрений");}
        else{
            System.out.println("Трикутник  нерівнобедрений");}
    }
}