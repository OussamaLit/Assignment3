package de.uniba.wiai.dsg.ajp.assignment3;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class ChildrensPriceTest {

    @BeforeEach
    @ParameterizedTest
    @ValueSource(ints = {4, 7, 5})
    public void getChargeTest(int value){
        ChildrensPrice ChildrenPrice = new ChildrensPrice();
        boolean b = (ChildrenPrice.getCharge(value) > 0);
        assertEquals(true,
                b);
     }



   }