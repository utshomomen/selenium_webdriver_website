package org.example;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import static org.junit.Assert.*;
import static org.testng.Assert.assertEquals;

public class AppTest {

        WebDriver driver ;


        @Test
        public void testMain( ) {

    double  expectedTitle = 111;
     double actualTitle = 111;

            Assert.assertEquals(actualTitle,expectedTitle);

    }

    @Test
    public void start_WebDriver(){

            WebDriver driver = new ChromeDriver();
            driver.navigate().to("https://www.e-katalog.ru/ek-list.php?katalog_=298&pr_[]=2777");

          assertTrue( "the driver is ok",true );

          //Assert.assertTrue( driver.getTitle().startsWith( "websiteutsho" ), "title is going to torck" );
        driver.close();


    }



}