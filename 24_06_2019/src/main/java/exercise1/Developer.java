package exercise1;

public class Developer extends Person {

    private CodingLanguage codingLanguage;

    public Developer(String name, int age) {
        super(name, age);
        System.out.println("I am a new developer!");
    }

    enum CodingLanguage {
        JAVA,
        C,
        Python
    }

    public Developer(CodingLanguage codingLanguage) {
        super();
        this.codingLanguage = codingLanguage;}
    protected void code (){
        System.out.println("I'm happy coding!");
    }

    public boolean knowsC(){
        return codingLanguage.equals(CodingLanguage.C);
    }
}
