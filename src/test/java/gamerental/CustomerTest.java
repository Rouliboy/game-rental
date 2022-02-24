package gamerental;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

import org.junit.Test;

public class CustomerTest {

    @Test
    public void test() {
        Customer customer = new Customer("Bob");
        customer.addRental(new Rental(new Game("Jaws", Game.REGULAR), 2));
        customer.addRental(new Rental(new Game("Golden Eye", Game.REGULAR), 3));
        customer.addRental(new Rental(new Game("Short New", Game.NEWLY_RELEASED), 1));
        customer.addRental(new Rental(new Game("Long New", Game.NEWLY_RELEASED), 2));
        customer.addRental(new Rental(new Game("Bambi", Game.CHILDREN), 3));
        customer.addRental(new Rental(new Game("Toy Story", Game.CHILDREN), 4));

        String expected = "" +
                "Games rented by Bob\n" +
                "\tJaws\t2.0\n" +
                "\tGolden Eye\t3.5\n" +
                "\tShort New\t3.0\n" +
                "\tLong New\t6.0\n" +
                "\tBambi\t1.5\n" +
                "\tToy Story\t3.0\n" +
                "Amount is 19.0\n" +
                "You earned 7 loyalty points";

        assertEquals(expected, customer.statement());
    }
}
