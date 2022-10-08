package org.example;


import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        Animal<Object> animals = new AnimalArray<>();

        animals.addAnimal("Dog");
        animals.addAnimal("Cat");
        animals.addAnimal("Frog");
        animals.addAnimal("Snake");
        animals.addAnimal("Elephant");
        animals.addAnimal("Bird");
        animals.addAnimal("Bee");
        animals.addAnimal("Duck");
        animals.addAnimal("Pig");
        animals.addAnimal("Cow"); //10
        animals.addAnimal("Cow2");
        animals.addAnimal("Cow3");
        animals.addAnimal("Cow4");

       animals.addAnimal(new AnimalType("Husky", 10));
       animals.addAnimal(new AnimalType("Janusz", 65));
       animals.addAnimal(new AnimalType("Hamster", 5));


        animals.forEach(System.out::println);

        animals.removeAnimal(new AnimalType("Husky", 10));



    }
}