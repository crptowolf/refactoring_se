package code;

abstract class Price {
    abstract int getPriceCode();

    static double getCharge(int daysRented) {
        return 0;
    }

    static int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
