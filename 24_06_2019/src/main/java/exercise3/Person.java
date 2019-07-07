package exercise3;

public class Person {
    private String Name;
    private String Surname;
    private int Age;
    private int PhoneNumber;

    public Person(String Name, String Surname, int Age, int PhoneNumber){
        this.Name = Name;
        this.Surname = Surname;
        this.Age = Age;
        this.PhoneNumber = PhoneNumber;
    }

//    public String getName() {return Name;}
//    public String getSurname(){return Surname;}
//    public int Age() {return Age;}
//    public int PhoneNumber(){return PhoneNumber;}


    public String getName() {return Name;}
//    public void setName(String name) {Name = name;}

    public String getSurname() {return Surname;}
//    public void setSurname(String surname) {Surname = surname;}

    public int getAge() {return Age;}
//    public void setAge(int age) {Age = age;}

    public int getPhoneNumber() {return PhoneNumber;}
//    public void setPhoneNumber(int phoneNumber) {PhoneNumber = phoneNumber;}

}
