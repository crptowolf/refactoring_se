package code;

public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private final String title;
    private int priceCode;
    private Price price;

    public Movie(String newtitle, int priceCode) {
        title = newtitle;
        setPriceCode(priceCode);
    }

    public double getCharge(int daysRented) {
        return price.getCharge(daysRented);
    }

    public int getFrequentRenterPoints(int daysRented) {
        return price.getFrequentRenterPoints(daysRented);
    }

    public void setPriceCode(int arg) {
        switch (arg) {
            case REGULAR -> price = new Regular();
            case CHILDRENS -> price = new Childrens();
            case NEW_RELEASE -> price = new NewRelease();
            default -> throw new IllegalArgumentException("Incorrect Price Code");
        }
    }


    public String getTitle (){
        return title;
    }

    public int getPriceCode() {
        return priceCode;
    }
}
