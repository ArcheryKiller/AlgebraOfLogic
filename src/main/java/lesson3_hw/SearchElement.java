package lesson3_hw;

public class SearchElement {
    private int[] arr = {1, 2 ,3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16};

    public int[] getArr() {
        return arr;
    }

    //Задание 1
    public int startSearch(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int binary = (start + end) / 2;
            if (arr[binary] == binary + 1) {
                start = binary + 1;
            } else {
                end = binary - 1;
            }
        }
        return ++start;
    }
}
