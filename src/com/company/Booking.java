package com.company;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.Date;

public class Booking {
    public static String url = "http://booking.uz.gov.ua/";

    public static void setFrom(String value) {
        TestHelper.drv.findElement(By.xpath("//*[@id='station_from']/input")).sendKeys(value);
        TestHelper.slp(3);
        TestHelper.drv.findElement(
                By.xpath("//*[@id='stations_from']/div[@title='" + value + "']")).click();
    }

    public static void setDestination(String value) {
        TestHelper.drv.findElement(By.xpath("//*[@id='station_till']/input")).sendKeys(value);
        TestHelper.slp(3);
        TestHelper.drv.findElement(
                By.xpath("//*[@id='stations_till']/div[@title='" + value + "']")).click();
    }

    public static void dateDeparture(String value) {
        TestHelper.drv.findElement(By.xpath("//*[@id='date_dep']")).clear();
        TestHelper.drv.findElement(By.xpath("//*[@id='date_dep']")).sendKeys(value);
        TestHelper.drv.findElement(By.xpath("//*[@id='date_dep']")).sendKeys(Keys.ENTER);
        TestHelper.slp(3);
    }

    public static void search() {
        TestHelper.drv.findElement(By.xpath("//button[@name='search']")).click();
        TestHelper.slp(3);
    }

    public static void selectTrain(String value) {
        TestHelper.drv.findElement(By.xpath("//*[@class='num']/a[text()='"+value+"']")).click();
        TestHelper.slp(5);
    }
    public static String getRouteWindowTitle () {
        return TestHelper.drv.findElement(By.xpath("//*[@class='vToolsPopupHeader']/span")).getText();
    }
    public static void closeRouteWindow() {
        TestHelper.drv.findElement(By.xpath("//button[text()='Ok']")).click();
        TestHelper.slp(5);
    }
}
