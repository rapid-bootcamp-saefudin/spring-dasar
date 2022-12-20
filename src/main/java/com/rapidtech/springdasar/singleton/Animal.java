package com.rapidtech.springdasar.singleton;

public class Animal {
    private static Animal animal;

    public static Animal getInstance(){
        if(animal == null){
            animal = new Animal();
        }
        return animal;
    }

    private Animal(){

    }
}
