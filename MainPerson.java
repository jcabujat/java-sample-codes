package com.company;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("Jonathan");
        person.setLastName("Cabujat");
        person.setAge(16);
        System.out.println("full name = " + person.getFullName());
        System.out.println("teen = " + person.isTeen());
        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        System.out.println(person.getAge());
    }
}
