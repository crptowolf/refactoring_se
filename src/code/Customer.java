package code;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    private final String name;
    private final Vector<Rental> rentals = new Vector<>();

    public Customer (String newname){
        name = newname;
    }

    public void addRental(Rental arg) {
        rentals.addElement(arg);
    }
    public String getName (){
        return name;
    }

    private double getTotalCharge() {
        double result = 0;
        Enumeration<Rental> enum_rentals = rentals.elements();
        while (enum_rentals.hasMoreElements()) {
            Rental each = enum_rentals.nextElement();
            result += each.getCharge();
        }
        return result;
    }

    private int getTotalFrequentRenterPoints() {
        int result = 0;
        Enumeration<Rental> enum_rentals = rentals.elements();
        while (enum_rentals.hasMoreElements())  {
            Rental each = enum_rentals.nextElement();
            result += each.getFrequentRenterPoints();
        }
        return result;
    }

    public String statement() {
        Enumeration<Rental> enum_rentals = rentals.elements();
        StringBuilder result = new StringBuilder("Rental Record for " + this.getName() + "\n");

        while (enum_rentals.hasMoreElements()) {
            Rental each = enum_rentals.nextElement();
            each.getFrequentRenterPoints();

            //show figures for this rental
            result.append("\t").append(each.getMovie().getTitle()).append("\t").append("\t").append(each.getDaysRented()).append("\t").append(each.getCharge()).append("\n");
            each.getCharge();
        }
        // add footer lines
        result.append("Amount owed is ").append(getTotalCharge()).append("\n");
        result.append("You earned ").append(getTotalFrequentRenterPoints()).append(" frequent renter points");
        return result.toString();
    }


}
