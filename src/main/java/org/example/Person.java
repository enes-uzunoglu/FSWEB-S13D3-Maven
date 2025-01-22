package org.example;

import org.w3c.dom.ls.LSOutput;

public class Person {
    private String firsName;
    private String lastName;
    private int age;
    private boolean drivingLicence;
    private Gender gender;
    private double salary;

    public Person(String firsName,String lastName,int age){
        this.firsName = firsName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firsName, String lastName, int age, boolean drivingLicence, Gender gender, double salary) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.age = age;
        this.drivingLicence = drivingLicence;
        this.gender = gender;
        this.salary = salary;
    }

    public String getFirsName() {
        return firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        return this.age >= 13 && this.age <= 19;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firsName='" + firsName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", drivingLicence=" + drivingLicence +
                ", gender=" + gender +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        Person enes = new Person("Enes","Uzunoğlu",30);
        System.out.println(enes);
        Person emrah = new Person("Emrahh","Uzunoğlu",35,true,Gender.MALE,35000);
        System.out.println(emrah);
        System.out.println(emrah);
    }


}