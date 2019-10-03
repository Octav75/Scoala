package DesignPatterns.demo.demodesignPatterns.prototypePattern;

public class Janitor extends Employee {
    public Janitor (){
        position = "Part-time";
    }
    @Override
    void work() {
        System.out.println("Cleaning the hallway!");
    }
}
