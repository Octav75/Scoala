package shop;

import org.junit.Test;

public class Product {
    @Test
    public void testSuccessfulyAddClassProduct(){
        Product p1 = new Product("milk", 10.3);
        Product p2 = new Product("egg", 3.3);
        Product p3 = new Product("bred", 2.3);

        ShoppingCart shoppingCart = new ShoppingCart();
    }
}
