package org.example;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Student> ll = new LinkedList<Student>();

        ll.add(new Student("Jani",7,4.2));
        ll.add(new Student("Laci",6,3.8));
        ll.add(new Student("Kati",5,4.0));
        ll.add(new Student("Juli",7,4.6));
        ll.add(new Student("Andi",8,3.4));


        var pisti = new Student("Pisti", 7, 4.0);

        ll.add(3, pisti);
        //ll.remove(3);

        //System.out.println(ll.get(3));

        System.out.println(ll.indexOf(pisti));

        //ll.stream().forEach(System.out::println);

    }
}