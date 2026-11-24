package com.ing.zoo;

public class Stoat implements Animal, Carnivore, Performer {
    public String name;
    public String helloText;
    public String eatText;
    public String performText;

    public Stoat()
    {
    }

    public void sayHello()
    {
        helloText = "squeak";
        System.out.println(helloText);
    }

    public void eatMeat()
    {
        eatText = "rip squelch snap";
        System.out.println(eatText);
    }

    public void performTrick()
    {
        performText = "backflips!";
        System.out.println(performText);
    }

    public String getName() {
        return name;
    }

}
