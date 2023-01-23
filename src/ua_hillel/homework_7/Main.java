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

        addStudent(studentArrayList, Max);
        addStudent(studentArrayList, Valery);
        addStudent(studentArrayList, Ann);
        addStudent(studentArrayList, Jack);
        addStudent(studentArrayList, Luck);

        System.out.println("\nStudents which studies at course 2 :");
        printStudents(studentArrayList, 2);
    }

    public static void addStudent(ArrayList<Student> studentArrayList, Student student) {
        studentArrayList.add(student);
    }

    public static void removeStudent(ArrayList<Student> studentArrayList, Student student) {
        studentArrayList.remove(student);
    }

    public static void printStudents(ArrayList<Student> studentArrayList, int course) {
        for (Student student : studentArrayList) {
            if (student.getCourse() == course) {
                System.out.println(student.getName() + " " + student.getCourse());
            }
        }
    }
}