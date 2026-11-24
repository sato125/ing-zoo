package com.ing.zoo;

import java.util.Random;

public class KomodoDragon implements Animal, Carnivore, Performer {
    public String name;
    public String helloText;
    public String eatText;
    public String trick;

    public KomodoDragon()
    {
    }

    public void sayHello()
    {
        helloText = "ribbit";
        System.out.println(helloText);
    }

    public void eatMeat()
    {
        eatText = "chomp chomp crunch slurp";
        System.out.println(eatText);
    }

    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "eats you";
        }
        else
        {
            trick = "eats your friend";
        }
        System.out.println(trick);
    }

    public String getName() {
        return name;
    }

}
