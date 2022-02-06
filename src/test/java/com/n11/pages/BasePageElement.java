package com.n11.pages;

import com.n11.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePageElement {


    public BasePageElement() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(className = "hBotMenuItem")
    public WebElement storesButtonn;

    @FindBy(xpath = "//*[@class='hOpenMenuContent']/a[1]")
    public WebElement showStoreButton;

    @FindBy(className = "dn-slide-deny-btn")
    public WebElement laterPopUpButton;

    @FindBy(id = "myLocation-close-info")
    public WebElement locationButton;

    @FindBy(xpath = "//*[@id=\"cookieUsagePopIn\"]/span")
    public WebElement closCookieButton;

    @FindBy(id = "searchData")
    public static WebElement searchText;


    public void goStorePage() {
        Actions action = new Actions(Driver.get());
        action.moveToElement(storesButtonn).perform();
        showStoreButton.click();
    }

    public void closeCookies() {
        locationButton.click();
        closCookieButton.click();
    }

}
