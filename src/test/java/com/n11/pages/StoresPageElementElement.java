package com.n11.pages;

import com.n11.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class StoresPageElementElement extends BasePageElement {
    static WebDriver driver = Driver.get();


    @FindBy(xpath = "//*[@id=\"contentSellerList\"]/div/div[2]/div/div[1]/ul/li[4]/div/h3")
    public WebElement allStores;

   public void AllStoresButton(){
      allStores.click();
   }

    @FindBy(xpath = "//*[@class=\"letters\"]/span")
    public static List<WebElement> storeList;

    public static WebElement getStoreCharacter(int StoreCharacter) {
        return driver.findElement(By.xpath("//*[@class=\"letters\"]/span[" + StoreCharacter + "]"));
    }

    public static List<WebElement> getStoreListNames() {
        return driver.findElements(By.xpath("(//*[@class=\"sellerListHolder\"])[4]/ul"));
    }

    @FindBy(className = "sallerName")
    public static WebElement sellerName;

    @FindBy(xpath = "//*[@class=\"tab\"]/ul/li[2]/div/h3/a")
    public static WebElement storeComments;

    @FindBy(className = "selectedReview")
    public static WebElement selectedReview;

    @FindBy(xpath = "//*[@class = 'cont']/h1")
    public WebElement storesCont;

    @FindBy(className = "infoText")
    public WebElement infoTxt;


}
