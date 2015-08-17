package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/**
 * Created by Lilia.Sokolova on 17.08.2015.
 */
public class XpathHWork1 {
    public static void main(String[] arg){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        ChromeDriver drv = new ChromeDriver();
//**********************************//
        /*1. Открьіть сайт https://stage.tether.to
        2. Напечатать в консоль заголовок сайта.
        3. Нажать на ссьілку Request access.
        4. Напечатать в консоль заголовок единственного поля для ввода на открьівшейся странице.
        5. Нажать на ссьілку Already have an invite code?
        6. Напечатать в консоль заголовки всех полей кроме вьібора страньі.
        7. Заполнить первьіе 3 поля.
        8. Напечатать в консоль ошибку которая появилась возле первого поля.*/
//******************************************************//
        drv.get("https://stage.tether.to");
        slp(3);
        System.out.println(drv.getTitle());

//3 4-----------
        WebElement j=drv.findElementByXPath("//div/a[text()='Request access']");
        j.click();
        WebElement j1=drv.findElementByXPath("//label");
        System.out.println(j1.getText());
//5--------------
        WebElement j2=drv.findElementByXPath("//div/a[text()='Already have an invite code?']");
        j2.click();
//6-------------
       // WebElement a1=drv.findElementByXPath("//md-input-container/label[text()='Invite Code']");
       // System.out.println(a1.getText());
        List<WebElement> d=drv.findElementsByXPath("//md-whiteframe");
        WebElement res1=d.get(0);
        System.out.println(res1.getText());
       // List<WebElement> res=drv.findElementByXPath("//md-input-container/label[text()='Invite Code']");
        /*WebElement j=drv.findElementByXPath("//*[@name='master']");
        j.sendKeys("mypass");
        WebElement j1=drv.findElementByXPath("//*[@name='site']");
        j1.sendKeys("mysite");
        //j1.sendKeys(Keys.ENTER);


        WebElement j2=drv.findElementByXPath("//*[@value='Generate']");
        //WebElement j2=drv.findElementByXPath("//tr/td[1]/input");
        j2.click();
        WebElement j3=drv.findElementByXPath("//*[@name='password']");*/


        //System.out.println(j1.getAttribute("value"));
        //System.out.println(j3.getAttribute("value"));*/


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

