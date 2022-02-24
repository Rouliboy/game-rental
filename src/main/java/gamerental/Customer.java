package gamerental;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String _name;
    private List<Rental> _rentals = new ArrayList<Rental>();

    public Customer(String name) {
        _name = name;
    }

    public void addRental(Rental arg) {
        _rentals.add(arg);
    }

    public String getName() {
        return _name;
    }

    public String statement() {
        double totalAmount = 0;
        int nbLoyaltyPoints = 0;
        String result = "Games rented by " + getName() + "\n";

        for (Rental each : _rentals) {
            double thisAmount = 0;

            //determine amounts for each line
            switch (each.getGame().getPriceCode()) {
                case Game.REGULAR:
                    thisAmount += 2;
                    if (each.getDaysRented() > 2)
                        thisAmount += (each.getDaysRented() - 2) * 1.5;
                    break;
                case Game.NEWLY_RELEASED:
                    thisAmount += each.getDaysRented() * 3;
                    break;
                case Game.CHILDREN:
                    thisAmount += 1.5;
                    if (each.getDaysRented() > 3)
                        thisAmount += (each.getDaysRented() - 3) * 1.5;
                    break;
            }

            // add loyalty points
            nbLoyaltyPoints++;
            // add bonus for a two day famous rental
            if ((each.getGame().getPriceCode() == Game.NEWLY_RELEASED) && each.getDaysRented() > 1)
                nbLoyaltyPoints++;

            // show figures for this rental
            result += "\t" + each.getGame().getTitle() + "\t" + String.valueOf(thisAmount) + "\n";
            totalAmount += thisAmount;
        }

        // add footer lines
        result += "Amount is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(nbLoyaltyPoints) + " loyalty points";

        return result;
    }
}
