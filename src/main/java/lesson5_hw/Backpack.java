package lesson5_hw;

import java.util.ArrayList;
import java.util.List;

public class Backpack {
    private List<Item> bestItems = null;

    private int maxW;
    private int bestPrice;

    private int calcWeigth(List<Item> items) {
        int result = 0;
        for (Item item : items) {
            result += item.getWeight();
        }
        return result;
    }

    private int calcPrice(List<Item> items) {
        int result = 0;
        for (Item item : items) {
            result += item.getPrice();
        }
        return result;
    }

    private void checkSet(List<Item> items) {
        if (this.bestItems == null) {
            if (this.calcWeigth(items) <= this.maxW) {
                this.bestItems = items;
                this.bestPrice = this.calcPrice(items);
            }
        } else {
            if (this.calcWeigth(items) <= this.maxW && this.calcPrice(items) > this.bestPrice) {
                this.bestItems = items;
                this.bestPrice = this.calcPrice(items);
            }
        }
    }

    public void makeAllSets(List<Item> items) {
        if (items.size() > 0) {
            this.checkSet(items);
        }
        for (int i = 0; i < items.size(); i++) {
            List<Item> newSet = new ArrayList<>(items);
            newSet.remove(i);
            makeAllSets(newSet);
        }
    }

    public Backpack(int maxW) {
        this.maxW = maxW;
    }

    public List<Item> getBestItems() {
        return this.bestItems;
    }
}
