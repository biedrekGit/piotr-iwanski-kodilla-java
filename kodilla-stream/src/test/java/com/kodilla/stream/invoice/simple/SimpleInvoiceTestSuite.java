package com.kodilla.stream.invoice.simple;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleInvoiceTestSuite {

    @Test
    void testGetValueToPay() {
        //Given
        SimpleInvoice invoice = new SimpleInvoice();

        //When
        invoice.addItem(new SimpleItem(new SimpleProduct("Product 1", 17.28), 2.0));
        invoice.addItem(new SimpleItem(new SimpleProduct("Product 2", 11.99), 3.5));
        invoice.addItem(new SimpleItem(new SimpleProduct("Product 3",  6.49), 5.0));

        //Then
        assertEquals(108.975, invoice.getValueToPay(), 0.001);
    }

    @Test
    void testGetValue() {
        //Given
        SimpleItem simpleItem1 = new SimpleItem(new SimpleProduct("Product 1", 25.4), 4.0);
        SimpleItem simpleItem2 = new SimpleItem(new SimpleProduct("Product 2", 45.5), 2.0);
        SimpleItem simpleItem3 = new SimpleItem(new SimpleProduct("Product 3", 35.5), 6.0);
        //When & Then
        assertEquals(101.6, simpleItem1.getValue());
        assertEquals(91.0, simpleItem2.getValue());
        assertEquals(213.0, simpleItem3.getValue());

    }
}
