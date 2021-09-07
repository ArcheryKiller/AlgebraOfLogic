package lesson5_hw;

public class Exponentiation {
    private int value;
    private int degree;

    public Exponentiation(int value, int degree) {
        this.value = value;
        this.degree = degree;
    }

    public int getValue() {
        return value;
    }

    public int getDegree() {
        return degree;
    }

    public long exponentiation(int value, int degree) {
        long result = 0;
        if (degree <= 0) {
            return 1;
        } else {
            result = value * exponentiation(value, degree - 1);
        }
        return result;
    }
}
