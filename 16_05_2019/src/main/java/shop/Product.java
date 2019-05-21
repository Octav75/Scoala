package shop;

public class Product {
    String name;    // Aici declar valoare numelui produsului care este de tip string (default)
    double price;   // Aici declar pretul.

    public Product (String name, double price){
        this.name = name;   // Aici declar produsul caracterizat de nume si pret
        this.price = price;
    }
            // Fac getter pentru name si price pentru a le atribuii Produsului
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString(){
        return name + "=>" + price;
    }
}
