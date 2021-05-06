package tests;


import code.Customer;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CustomerTest {

    private Customer customer;

    @Before
    public void setUp() {
        customer = new Customer("Hans");
    }

    @Test
    public void getName() {
        Assertions.assertEquals("Hans", customer.getName());
    }

    @Test
    public void statement() {
        String statement = "Rental Record for Hans" + "\n";
        statement += "Amount owed is " + "0.0" + "\n";
        statement += "You earned " + "0" + " frequent renter points";

        Assertions.assertEquals(statement, customer.statement());
    }

}
