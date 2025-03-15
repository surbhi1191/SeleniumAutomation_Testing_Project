package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    //constructor
    public  HomePage(WebDriver driver)
    {
    super(driver);
    }
    //locators
    @FindBy(xpath = "//*[@class='caret']")
    WebElement lnkMyAccount;
    @FindBy(xpath = "//*[text()='Register']")
    WebElement lnkRegister;

    //actions
 public void clickMyAccount()
 {
     lnkMyAccount.click();
 }

    public void clickRegister()
    {
        lnkRegister.click();
    }

}
