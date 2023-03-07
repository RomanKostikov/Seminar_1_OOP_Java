package org.example.cw4;

public class Cat extends Animal implements AnimalInterface, NewInterface {
    @Override
    public void voice(String name) {
        System.out.println("meow " + "im " + name);
    }
}
