package SeleniumTests.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    //constructor
    public HomePage(WebDriver driver) {
        super(driver);
    }

    //locators
    @FindBy(xpath = "//*[@class='caret']")
    WebElement lnkMyAccount;
    @FindBy(xpath = "//*[text()='Register']")
    WebElement lnkRegister;
    @FindBy(xpath = "//*[@class='dropdown-menu dropdown-menu-right']//li[2]")
    WebElement lnkLogin;
    @FindBy(xpath = "//*[@id='input-email']")
    WebElement txtLoginEmail;
    @FindBy(xpath = "//*[@id='input-password']")
    WebElement txtLoginUserPassword;
    @FindBy(xpath = "//*[@value='Login']")
    WebElement btnLogin;

    //actions
    public void clickMyAccount() {
        lnkMyAccount.click();
    }

    public void clickRegister() {
        lnkRegister.click();
    }

    public void clickLogin() {
        lnkLogin.click();
    }

    public void setUserLoginEmail(String useremail)
    {
        txtLoginEmail.sendKeys(useremail);
    }
    public void setUserLoginPassword(String userpassword)
    {
        txtLoginUserPassword.sendKeys(userpassword);
    }
   public void LoginBtn()
   {
       btnLogin.click();
   }
}
