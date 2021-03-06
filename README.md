# Game Rental

You are working in a company that developed a very simple games rental application.
There is an already existing feature, which is to display, in text format, the output of a rental statement:

```
Games rented by Martin
  The Brain 3.5
  Virus of the mind 2.0
Amount is 5.5
You earned 2 loyalty points
```

The guy that developed this feature left the company. And your boss told you to implement a new feature: he wants 
the application to be able to display the rental statement in HTML:

```
<h1>Games rented by <em>Martin</em></h1>
<table>
  <tr><td>The Brain</td><td>3.5</td></tr>
  <tr><td>Virus of the mind</td><td>2.0</td></tr>
</table>
<p>Amount is <em>5.5</em></p>
<p>You earned <em>2</em> loyalty points</p>
```

You will first have to understand what the business rules are, and then implement this new feature, showing us your design/refactoring skills.

## Build

All you need to build this project is Java 11 or later, Maven 3.0 or later.

## Testing

Unit tests can be run using maven[1]:

    $ mvn test

Tests are located in the test directory and run using Junit.
