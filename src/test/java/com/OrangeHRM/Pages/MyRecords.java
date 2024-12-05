package com.OrangeHRM.Pages;

import com.OrangeHRM.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyRecords extends BaseClass {
    WebDriver driver;

    public MyRecords(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);

    }
    //Locators of My records tab
    @FindBy(xpath = "//*[text()=\"My Records\"]")
    WebElement myrecord;

    @FindBy(xpath="//*[@class=\"oxd-icon bi-calendar oxd-date-input-icon\"]")
    WebElement date;

    




}
