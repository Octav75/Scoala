package exercise2;

public class Player {
    private String nameOfThePlayer;
    private int number;
    private int price;

    public Player(String nameOfThePlayer, int number, int price) {
       setName(nameOfThePlayer);
       setNumber(number);
       setPrice(price);
    }

    public String getName() {
        return nameOfThePlayer;
    }
    public void setName(String name) {
        this.nameOfThePlayer = name;
    }

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }

    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }
}
