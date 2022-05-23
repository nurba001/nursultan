package com.company;

public abstract class Animal {
    private String food;
    private String location;

    public Animal(String food,String location) {
    this.food=food;
    this.location=location;

    }

    public Animal() {

    }

    void makeNoise(String name){
        System.out.println(name );
    }
    void eat(){
        System.out.println( "eats "+food );
    }
    void sleep(String sleep){
        System.out.println(sleep+" sleepig");

    }

    @Override
    public String toString() {
        return "live "+location;
    }
}
