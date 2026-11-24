package com.ing.zoo;

public class Hippo implements Animal, Herbivore {
    private final String name;
    public String helloText;
    public String eatText;

    public Hippo(String name)
    {
        this.name = name;
    }

    public void sayHello()
    {
        helloText = "splash";
        System.out.println(helloText);
    }

    public void eatLeaves()
    {
        eatText = "munch munch lovely";
        System.out.println(eatText);
    }
    public String getName() {
        return name;
    }
}
