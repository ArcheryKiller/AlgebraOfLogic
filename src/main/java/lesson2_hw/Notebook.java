package lesson2_hw;

public class Notebook implements Comparable<Notebook>{
    private Integer price;
    private Integer ram;
    private String brand;

    public Notebook(int price, int ram, String brand) {
        this.price = price;
        this.ram = ram;
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public int getRam() {
        return ram;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public int compareTo(Notebook notebook) {
        int result = price.compareTo(notebook.getPrice());

        if (result == 0) {
            result = Integer.compare(ram, notebook.getRam());

            if (result == 0) {
                return brand.compareTo(notebook.getBrand());
            }
        }
        return result;
    }
}
