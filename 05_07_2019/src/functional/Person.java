package functional;

public class Person {
    private String name;
    private int difficulty;
    private boolean isPresent;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public boolean isPresent() {
        return isPresent;
    }

    public void setPresent(boolean present) {
        isPresent = present;
    }

    public Person(String name, int difficulty) {
        this.name = name;
        this.difficulty = difficulty;
        isPresent = false;

    }
}
