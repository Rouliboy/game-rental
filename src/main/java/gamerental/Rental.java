package gamerental;

/**
 * The rental class represents a customer renting a game.
 */
public class Rental {

    private Game _game;
    private int _daysRented;

    public Rental(Game game, int daysRented) {
        _game = game;
        _daysRented = daysRented;
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public Game getGame() {
        return _game;
    }
}
