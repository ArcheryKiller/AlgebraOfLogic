import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LessonTwo {
    private static Random random;
    private static int stepInPrice;
    private static int minPrice;
    private static int maxPrice;
    private static int minRam;
    private static int maxRam;
    private static int stepInRam;
    private static int numberOfNotes;
    private static String[] brands = {"Lenuvo", "Asos", "MacNote", "Eser", "Xamiou"};
    private static ArrayList<Notebook> listOfNotes;

    public static void main(String[] args) {
        //settings
        minPrice = 500;
        maxPrice = 1000;
        stepInPrice = 100;
        minRam = 4;
        maxRam = 12;
        stepInRam = 4;
        numberOfNotes = 5000;

        //Create
        listOfNotes = createListNotebook();

        //Sort
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(listOfNotes);
        showNotebook(listOfNotes);

    }

    private static ArrayList<Notebook> createListNotebook() {
        ArrayList<Notebook> arrayList = new ArrayList<>();
        for (int i = 0; i < numberOfNotes; i++) {
            arrayList.add(new Notebook(randomPrice(), randomRam(), randomBrand(brands)));
        }
        return arrayList;
    }

    private static int randomPrice() {
        random = new Random();
        int price = 0;
        try {
            if (stepInPrice < 0) {
                throw new ArithmeticException();
            }
            price = minPrice + (random.nextInt((maxPrice - minPrice) / stepInPrice + 1) * stepInPrice);
        } catch (IllegalArgumentException e) {
            System.out.println("maxPrice cannot be less than the minPrice");
        } catch (ArithmeticException e) {
            System.out.println("stepInPrice should be > 0");
        }
        return price;
    }

    private static int randomRam() {
        random = new Random();
        int price = 0;
        try {
            if (stepInRam < 0) {
                throw new ArithmeticException();
            }
            price = minRam + (random.nextInt((maxRam - minRam) / stepInRam + 1) * stepInRam);
        } catch (IllegalArgumentException e) {
            System.out.println("maxPrice cannot be less than the minPrice");
        } catch (ArithmeticException e) {
            System.out.println("stepInPrice should be > 0");
        }
        return price;
    }

    private static String randomBrand(String[] array) {
        random = new Random();
        String brand = "";
        try {
            brand = array[random.nextInt(array.length)];
        } catch (IllegalArgumentException e) {
            System.out.println("empty brand list");
        }
        return brand;
    }

    public static void showNotebook(List<Notebook> list) {
        for (Notebook n : list) {
            System.out.printf("Notebook: price - %drub, memory - %dgb, brand - %s\n", n.getPrice(), n.getRam(), n.getBrand());
        }
    }
}

/*
1. Отсортировать массив, состоящий из экземпляров класса Notebook в количестве 5000 штук.
    Условия для сортировки:

        1) по цене. От 500 до 1000 долларов с шагом в 100
            если цена равная, то

        2) по кол-ву оперативной памяти (от 4 до 12 с шагом 4)
            если памяти тоже равное количество, то 3) по производителю:
            Lenuvo > Asos > MacNote > Eser > Xamiou
            Добиваться максимально оптимальной сложности О-большая
 */
