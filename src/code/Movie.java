package code;

public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private String title;
    private int priceCode;
    public Movie(String newtitle, int newpriceCode) {
        title = newtitle;
        priceCode = newpriceCode;
    }
    public int getPriceCode() {
        return priceCode;
    }
    public void setPriceCode(int arg) {
        priceCode = arg;
    }
    public String getTitle (){
        return title;
    };

    public double getCharge(int daysRented) {
        return Price.getCharge(daysRented);
    }


    public int getFrequentRenterPoints(int daysRented) {
        return Price.getFrequentRenterPoints(daysRented);
    }
}
