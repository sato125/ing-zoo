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

        Lion henk = new Lion();
        henk.name = "henk";
        Hippo elsa = new Hippo();
        elsa.name = "elsa";
        Pig dora = new Pig();
        dora.name = "dora";
        Tiger wally = new Tiger();
        wally.name = "wally";
        Zebra marty = new Zebra();
        marty.name = "marty";

         Animal[] animals = new Animal[]{henk, elsa, dora, wally, marty};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");


        String input = scanner.nextLine();
        if(input.equals(commands[0]))
        {

           for(Animal animal : animals)
           {
               printGreeting(animal);
        }
        }
        else if(input.startsWith(commands[0] + " "))
        {
              String name = input.substring(commands[0].length() + 1);
                for(Animal animal : animals)
                {
                    if(animal.getName().equals(name))
                    {
                        printGreeting(animal);
                    }
                }
        }
        else if (input.equals(commands[1])){
            for(Animal animal : animals)
            {
                if(animal instanceof Herbivore)
                {
                    ((Herbivore) animal).eatLeaves();
                }
            }
        }
        else if (input.equals(commands[2])){
            for(Animal animal : animals)
            {
                if(animal instanceof Carnivore)
                {
                    ((Carnivore) animal).eatMeat();
                }
            }
        }
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

    public static void printGreeting(Animal animal)
    {
        animal.sayHello();
    }
}
