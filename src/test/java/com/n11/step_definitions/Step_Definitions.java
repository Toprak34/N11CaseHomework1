package com.n11.step_definitions;

import com.n11.methods.ExportExcelNames;
import com.n11.pages.BasePageElement;
import com.n11.pages.StoresPageElementElement;
import com.n11.utilities.ConfigurationReader;
import com.n11.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class Step_Definitions {

    WebDriver driver = Driver.get();
    BasePageElement basePageElement = new BasePageElement();
    StoresPageElementElement storesPageElement = new StoresPageElementElement();
    ExportExcelNames exportExcelNames = new ExportExcelNames();


    @Given("User open the browser and go to the stores page")
    public void user_open_the_browser_and_go_to_the_stores_page() {
        driver.get(ConfigurationReader.get("url"));
        Assert.assertEquals(ConfigurationReader.get("url"),driver.getCurrentUrl());
        basePageElement.closeCookies();
        basePageElement.goStorePage();
        Assert.assertTrue(storesPageElement.storesCont.isDisplayed());
        storesPageElement.AllStoresButton();
        Assert.assertTrue(storesPageElement.infoTxt.getText().contains("içeren sonuçlar"));
        System.out.println("pass");
    }
    @When("All store names are printed in excel file")
    public void allStoreNamesArePrintedInExcelFile() throws IOException, InterruptedException {
        exportExcelNames.getAllStoreNames();
    }
    @When("User selects desired store")
    public void user_selects_desired_store() throws IOException {
        exportExcelNames.getStoreNameToExcel();
    }
    @Then("User see store reviews")
    public void user_see_store_reviews() {
        exportExcelNames.goToStorePage();
        Assert.assertTrue(StoresPageElementElement.selectedReview.getText().contains("yorum"));
    }


}
