package com.qap1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TimeTest {
    @Test
    public void testNextSecond(){
        Time t1 = new Time(0, 0, 0);
        t1.setHour(21);
        t1.setMinute(10);
        t1.setSecond(15);

        t1.nextSecond();
        assertEquals("21:10:16", t1.toString());
    }

    @Test
    public void testPreviousSecond(){
        Time t2 = new Time(0, 0, 0);
        t2.setHour(10);
        t2.setMinute(20);
        t2.setSecond(25);

        t2.previousSecond();
        assertEquals("10:20:24", t2.toString());
    }
}
