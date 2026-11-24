package com.ing.zoo;

import java.util.Random;

public class Zebra implements Animal, Herbivore {
    private final String name;
    public String helloText;
    public String eatText;
    public String trick;

    public Zebra(String name)
    {
        this.name = name;
    }

    public void sayHello()
    {
        helloText = "zebra zebra";
        System.out.println(helloText);
    }

    public void eatLeaves()
    {
        eatText = "munch munch zank yee bra";
        System.out.println(eatText);
    }
    public String getName() {
        return name;
    }
}
