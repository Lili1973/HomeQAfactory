package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.spec.KeySpec;
import java.util.List;


public class XpathClass {
    public static void main(String[] arg){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        ChromeDriver drv = new ChromeDriver();

        drv.get("http://angel.net/~nic/passwd.current.html");
        slp(3);

        System.out.println(drv.getTitle());
        WebElement j=drv.findElementByXPath("//*[@name='master']");
        j.sendKeys("mypass");
        WebElement j1=drv.findElementByXPath("//*[@name='site']");
        j1.sendKeys("mysite");
        //j1.sendKeys(Keys.ENTER);


        WebElement j2=drv.findElementByXPath("//*[@value='Generate']");
        //WebElement j2=drv.findElementByXPath("//tr/td[1]/input");
        j2.click();
        WebElement j3=drv.findElementByXPath("//*[@name='password']");

        System.out.println(j.getAttribute("value"));
        System.out.println(j1.getAttribute("value"));
        System.out.println(j3.getAttribute("value"));


        slp(3);
        drv.quit();
    }
    public static void slp(long sec){
        try {
            Thread.sleep(sec*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}