package com.kodilla.hibernate.invoice.dao;


import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Product table = new Product("table");
        Item tables1 = new Item(table, new BigDecimal(250), 5, new BigDecimal(1250));
        Item tables2 = new Item(table, new BigDecimal(400), 4, new BigDecimal(1600));
        Invoice invoiceTest = new Invoice("Invoice 001");
        invoiceTest.getItems().add(tables1);
        invoiceTest.getItems().add(tables2);
        //When
        invoiceDao.save(invoiceTest);
        int invoiceId = invoiceTest.getId();
        //Then
        assertNotEquals(0, invoiceId);
        //CleanUp
        invoiceDao.deleteById(invoiceId);

    }
}
