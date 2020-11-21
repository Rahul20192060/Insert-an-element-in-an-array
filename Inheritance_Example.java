package com.company;



//import java.util.Scanner;

public class Random {
    public static void main(String[] args) {

//        Person p1=new Person();//calss obj=new construc()
//        Person p2=new Person(21,"Rabin");
//        p1.name="Rahul";
//        p1.age=19;
//        p2.name="Raj";
//        p2.age=20;

//        System.out.println(p1.name+" "+p1.age);
//        System.out.println(p2.name+" "+p2.age);
//        p1.walk();
//        p2.walk(10);
//        p1.eat();
//        p2.eat();
//        System.out.println(Person.count);

        Engineer e=new Engineer(19,"Rahul");

        System.out.println(e.age);
        System.out.println(e.name);
        e.eat();
        e.walk();
        e.walk(10);




    }

}

class Person{
    String name;
    int age;
    static int count;

    public Person(){
        System.out.println("Rahul is eating rice");
        count++;
    }

    public Person(int age,String name){
        this();
       this. name=name;
       this. age=age;

    }

    void walk(){

        System.out.println(name+" "+"is walking");
    }

    void eat(){

        System.out.println(name+" "+"has eaten fish");
    }

    void walk(int steps){

        System.out.println(name+" "+"walked"+" "+steps+"steps");
    }
}

class Engineer extends Person{
    public Engineer(int age,String name){

        super(age, name);

    }

    void walk(){
        System.out.println(name+" "+"is not walking");
    }

}
