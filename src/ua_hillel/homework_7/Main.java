package ua_hillel.homework_7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> studentArrayList = new ArrayList();

        Student Max = new Student("Max", 2);
        Student Valery = new Student("Valery", 1);
        Student Ann = new Student("Ann", 5);
        Student Jack = new Student("Jack", 3);
        Student Luck = new Student("Luck", 2);

        if (addStudent(studentArrayList, Max)) {
            System.out.println(Max.getName() + " has been added");
        } else {
            System.out.println(Max.getName() + " has not been added");
        }
        if (addStudent(studentArrayList, Valery)) {
            System.out.println(Valery.getName() + " has been added");
        } else {
            System.out.println(Valery.getName() + "has not been added");
        }
        if (addStudent(studentArrayList, Ann)) {
            System.out.println(Ann.getName() + " has been added");
        } else {
            System.out.println(Ann.getName() + " has not been added");
        }
        if (addStudent(studentArrayList, Jack)) {
            System.out.println(Jack.getName() + " has been added");
        } else {
            System.out.println(Jack.getName() + " has not been added");
        }
        if (addStudent(studentArrayList, Luck)) {
            System.out.println(Luck.getName() + " has been added");
        } else {
            System.out.println(Luck.getName() + " has not been added");
        }
        System.out.println("\nStudents which studies at course 2 :");
        printStudents(studentArrayList, 2);
    }

    public static boolean addStudent(ArrayList<Student> studentArrayList, Student student) {
        return studentArrayList.add(student);
    }

    public static boolean removeStudent(ArrayList<Student> studentArrayList, Student student) {
        return studentArrayList.remove(student);
    }

    public static void printStudents(ArrayList<Student> studentArrayList, int course) {
        for (Student student : studentArrayList) {
            if (student.getCourse() == course) {
                System.out.println(student.getName() + " " + student.getCourse());
            }
        }
    }
}