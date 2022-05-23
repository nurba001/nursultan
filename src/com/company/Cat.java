package com.company;

public class Cat extends Animal{
    public Cat() {
        super();

    }
    public Cat(String food, String location) {
        super(food, location);
    }



    @Override
    void makeNoise(String name) {
        super.makeNoise(name);

    }


    @Override
    void eat() {
        super.eat();
    }

    @Override
    void sleep(String sleep) {
        super.sleep(sleep);
    }
}
