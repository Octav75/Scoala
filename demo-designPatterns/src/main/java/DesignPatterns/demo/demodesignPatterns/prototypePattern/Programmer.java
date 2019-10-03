package DesignPatterns.demo.demodesignPatterns.prototypePattern;

public class Programmer extends Employee {
    public Programmer(){
        position = "Senior";
    }
    @Override
    void work() {
        System.out.println("Writting code!");
    }
}
