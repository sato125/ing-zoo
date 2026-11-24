package com.ing.zoo;

import java.util.Scanner;

public class Zoo {
    public static void main(String[] args)
    {
        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";

        Lion henk = new Lion("henk");
        Hippo elsa = new Hippo("elsa");
        Pig dora = new Pig("dora");
        Tiger wally = new Tiger("wally");
        Zebra marty = new Zebra("marty");
        Stoat megatron = new Stoat("megatron");
        KomodoDragon cupcake = new KomodoDragon("cupcake");

         Animal[] animals = new Animal[]{henk, elsa, dora, wally, marty, megatron, cupcake};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");


        String input = scanner.nextLine();
        //hello
        if(input.equals(commands[0]))
        {

           for(Animal animal : animals)
           {
               animal.sayHello();
        }
        }
        else if(input.startsWith(commands[0] + " "))
        {
            String name = input.substring(commands[0].length() + 1);
            for (Animal animal : animals)
            {
                if (animal.getName().equals(name))
                {
                    animal.sayHello();
                    return;
                }
            }
            System.out.println("Animal not found: " + name);
        }
        // give leaves
        else if (input.equals(commands[1])){
            for(Animal animal : animals)
            {
                if(animal instanceof Herbivore)
                {
                    ((Herbivore) animal).eatLeaves();
                }
            }
        }
        // give meat
        else if (input.equals(commands[2])){
            for(Animal animal : animals)
            {
                if(animal instanceof Carnivore)
                {
                    ((Carnivore) animal).eatMeat();
                }
            }
        }
        // perform trick
        else if (input.equals(commands[3])){
            for(Animal animal : animals)
            {
                if(animal instanceof Performer)
                {
                    ((Performer) animal).performTrick();
                }
            }
        }
        else
        {
            System.out.println("Unknown command: " + input);
        }
    }
}
