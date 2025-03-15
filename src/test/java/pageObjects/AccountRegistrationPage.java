package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage{
    public AccountRegistrationPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//*[@id='input-firstname']")
    WebElement txtFirstName;
    @FindBy(xpath = "//*[@id='input-lastname']")
    WebElement txtLastName;
    @FindBy(xpath = "//*[@id='input-email']")
    WebElement txtEmailId;

    @FindBy(xpath = "//*[@id='input-telephone']")
    WebElement txtPhoneNumber;
    @FindBy(xpath = "//*[@id='input-password']")
    WebElement txtPassword;
    @FindBy(xpath = "//*[@id='input-confirm']")
    WebElement txtConfirmPassword;

    @FindBy(xpath = "//*[@name='agree']")
    WebElement chkBox;
    @FindBy(xpath = "//*[@type='submit']")
    WebElement btnContinue;
    @FindBy(xpath = "//*[@id='content']//h1")
    WebElement msgSuccess;

    public void setFirstName(String firstName)
    {
        txtFirstName.sendKeys(firstName);
    }
    public void setLatName(String lastName)
    {
        txtLastName.sendKeys(lastName);
    }
    public void setEmailId(String emailID)
    {
        txtEmailId.sendKeys(emailID);
    }
    public void setPhoneNum(String phoneNum)
    {
        txtPhoneNumber.sendKeys(phoneNum);
    }
    public void setPassword(String password)
    {
        txtPassword.sendKeys(password);
    }
    public void setConfirmPassword(String password)
    {
       txtConfirmPassword.sendKeys(password);
    }
    public void setPrivacyPolicy()
    {
        chkBox.click();
    }
    public void clickContinue()
    {
        btnContinue.click();
    }
    public String getConfirmationMsg()
    {
        try {
       return msgSuccess.getText();
        }
        catch (Exception e)
        {
           return e.getMessage();
        }
    }

}
