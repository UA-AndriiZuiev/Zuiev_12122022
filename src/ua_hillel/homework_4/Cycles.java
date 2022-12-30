package ua_hillel.homework_4;

public class Cycles {
    public static void main(String[] args) {
        MyClass myclass = new MyClass();

        System.out.println("\n========= Exercise 1 ==========");
        myclass.calcSin();      //  Homework 4.1

        System.out.println("\n========= Exercise 2 ==========");
        myclass.changeArray(myclass.initArray());   //  Homework 4.2

        System.out.println("\n========= Exercise 3 ==========");
        myclass.sumArray(myclass.initArray());      //  Homework 4.3
    }
}
