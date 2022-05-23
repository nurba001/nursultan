package com.company;

public class Main {




    public static void main(String[] args) {

Animal [] animals={new Cat(),new Dog(),new Horse()};


Veterenar vet=new Veterenar();

vet.treatAnimal(new Dog("meat","street"));
vet.treatAnimal(new Horse("grass","barn"));
    System.out.println(vet);
}
}




