package shop;

public class ShoppingCart {

    private Product[] products; // Am apelat produsul din clasa Product (in mod privat pentru a nu se putea modifica
    // pretul si numele)
    private int index;

    private ShoppingCart(){

    }
    public ShoppingCart(){
        this.products = new Product[5];
    }
}
