package ua_hillel.homework_8;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> people = new HashMap<>();

        people.put(1, "Kevin");
        people.put(5, "Ann");
        people.put(3, "Michael");
        people.put(6, "Jack");
        people.put(2, "Maria");
        people.put(4, "Stiv");
        people.put(0, "Lora");
        System.out.println(people + "\n");

        sortPrintMap(people);
    }

    private static void sortPrintMap(Map people) {

        int u = 0;
        List list = new ArrayList(people.values());

        Collections.sort(list, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        for (Object o : list) {
            people.put(u, list.get(u).toString());
            System.out.println(u + "=" + list.get(u).toString());
            u++;
        }
    }
}