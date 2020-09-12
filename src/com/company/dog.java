package com.company;
import java.util.Scanner;
import java.util.SplittableRandom;

public class dog {
    String name;
    int age;
    public dog()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("name:");
        name=in.nextLine();
        System.out.println("age:");
        age=in.nextInt();
    }
    public void setname(String nm)
    {
        name=nm;
    }
    public void setAge(int a)
    {
        age=a;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public int tohuman()
    {
        return this.age*7;
    }
    @Override
    public String toString()
    {
        return "Dog: name="+name+", age="+age;
    }
}
