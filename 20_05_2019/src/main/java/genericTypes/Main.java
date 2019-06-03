package genericTypes;

public class Main {
//    public static void main(String[] args) {
//        System.out.println("SumaADouaNumere.getSumaADouaNumere ");
//    }
//}

    public static void main(String[] args) {
        Pair<Person, BankAccount> pair1 = new Pair<>(new Person("gigi"), new BankAccount(1000));
        Pair<Person, BankSavings> pair2
                = new Pair<>(new Person("gogu"), new BankSavings(500));

        Pair [] = pairs = {pair1, pair2};

        for (Pair p : pairs) {
            Person person = (Person) p.getKey();
            BankAccount value = (BankAccount) p.getValue;
            System.out.println(person + "=>" + value);
        }
    }
}