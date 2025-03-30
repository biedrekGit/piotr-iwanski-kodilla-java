package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BigmacTestSuite {

    @Test
    void testBigmacNew() {
        //Give
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("sesame")
                .burgers(2)
                .sauce("standard")
                .ingredient("cucumber")
                .ingredient("lettuce")
                .ingredient("onion")
                .ingredient("bacon")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        String whatSauce = bigmac.getSauce();
        int howManuBurgers = bigmac.getBurgers();
        String whatBun = bigmac.getBun();
        //Then
        assertEquals(4, howManyIngredients);
        assertEquals("standard", whatSauce);
        assertEquals(2, howManuBurgers);
        assertEquals("sesame", whatBun);
    }
}
