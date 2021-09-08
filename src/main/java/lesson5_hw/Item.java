package lesson5_hw;

public class Item {
    private String name;
    private int weight;
    private int price;

    public Item(String name, int weigth, int price) {
        this.name = name;
        this.weight = weigth;
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Предмет: " + name +
                ", вес=" + weight +
                ", цена=" + price + "\n";
    }
}
