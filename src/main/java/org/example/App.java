package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class App {

    public  static  void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\root\\Desktop\\webdriver\\chromedriver.exe");


        WebDriver driver = new ChromeDriver();

        driver.get("https://www.e-katalog.ru/ek-list.php?katalog_=298&pr_[]=2777");
   // System.out.println(driver.getTitle());

    String txt = driver.findElement( (By.xpath("/html/body/div[5]"  ))).getText();

        System.out.println(txt);




    }





}
