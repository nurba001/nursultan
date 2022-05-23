package com.company;

public class Horse extends  Animal{

    public Horse(String food, String location) {

        super(food, location);
    }
    public Horse() {
    }
    @Override
    void sleep(String sleep) {
        super.sleep(sleep);
    }



    @Override
    void eat() {
        super.eat();
    }

    @Override
    void makeNoise(String name) {
        super.makeNoise(name);
    }
}
