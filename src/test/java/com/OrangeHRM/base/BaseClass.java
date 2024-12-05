package com.OrangeHRM.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class BaseClass
{
    public static WebDriver driver;
    @BeforeTest
    public void openBrowser()
    {
         driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();

    }
    @Test
    public void logIn()
    {
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//*[text()=\" Login \"]")).click();
        driver.findElement(By.xpath("(//*[text()=\"Time\"])[1]")).click();
        driver.findElement(By.xpath("//*[text()=\"Attendance \"]")).click();

    }
     @AfterTest
    public void closebrow()
    {
        driver.close();
    }



}
