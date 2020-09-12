package com.company;

public class shape {
    String name;
    String color;

    public void setname(String nm) {
        name = nm;
    }

    public String getname() {
        return name;
    }

    public void setColor(String cl) {
        color = cl;
    }

    public String getColor() {
        return color;
    }
    @Override
    public String toString()
    {
        return "name= "+name+", color= "+color;
    }
}
