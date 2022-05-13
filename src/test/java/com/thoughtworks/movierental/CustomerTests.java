package com.thoughtworks.movierental;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CustomerTests {

    @Test
    public void shouldGenerateStatement() {
        Customer customer = new Customer("Bob");
        customer.addRental(new Rental(new Movie("movie-1", Movie.REGULAR), 2));
        customer.addRental(new Rental(new Movie("movie-2", Movie.CHILDRENS), 6));
        customer.addRental(new Rental(new Movie("movie-3", Movie.NEW_RELEASE), 5));
        assertEquals("Rental Record for Bob\n" +
                "\tmovie-1\t2.0\n" +
                "\tmovie-2\t6.0\n" +
                "\tmovie-3\t15.0\n" +
                "Amount owed is 23.0\n" +
                "You earned 4 frequent renter points", customer.statement());
    }
}
