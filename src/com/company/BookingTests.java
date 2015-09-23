package com.company;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BookingTests {
    @Before
    public void beforeDriver() {
        TestHelper.setup(Booking.url);
    }

    @Test
    public void test1() {
        Booking.setFrom("Киев");
        TestHelper.slp(1);
        Booking.setDestination("Ивано-Франковск");
        TestHelper.slp(1);
        Booking.dateDeparture("20.10.2015");
        TestHelper.slp(3);
        Booking.search();
        TestHelper.slp(5);
        Booking.selectTrain("043 К");
        Assert.assertEquals("Маршрут поезда", Booking.getRouteWindowTitle());
        Booking.closeRouteWindow();
        TestHelper.slp(3);
    }
    @After
    public void aftertest(){
        TestHelper.quit();
    }
}