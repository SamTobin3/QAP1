package com.qap1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DateTest {
    @Test
    public void testToString(){
        Date today = new Date(21, 9, 2021);
        assertEquals("21/09/2021", today.toString());
    }
}