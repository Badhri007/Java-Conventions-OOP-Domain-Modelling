package powerpackage;

public class PowerFinder {
    public int findPower(int base, int exponents) {
        int power = 1;
        for (int exponent = 0; exponent < exponents; exponent++) {
            power *= base;
        }
        return power;
    }
}