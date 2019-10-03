package DesignPatterns.demo.StructuralDesignPatterns.AdapterPattern;

public class Main {
    public static void main(String[] args) {
        BuilderImplementation builderImpl = new BuilderImplementation();

        builderImpl.build("house", "Downtown");
        builderImpl.build("Skyscrapper", "City Center");
        builderImpl.build("Skyscrapper", "Outskirts");
        builderImpl.build("Hotel", "City Center");
    }
}
