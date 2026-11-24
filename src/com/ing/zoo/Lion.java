package com.ing.zoo;

public class Lion implements Animal, Carnivore {
    private final String name;
    public String helloText;
    public String eatText;

    public Lion(String name)
    {
        this.name = name;
    }

    public void sayHello()
    {
        helloText = "roooaoaaaaar";
        System.out.println(helloText);
    }

    public void eatMeat()
    {
        eatText = "nomnomnom thx mate";
        System.out.println(eatText);
    }

    public String getName() {
        return name;
    }
}
