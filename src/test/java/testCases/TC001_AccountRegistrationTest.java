package testCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import pageObjects.BasePage;


import java.time.Duration;

public class TC001_AccountRegistrationTest {
    WebDriver driver;
   @BeforeClass
    public void setup()
    {
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://tutorialsninja.com/demo/");
    driver.manage().window().maximize();
    }

    @AfterClass
   public void tearDown()
    {
    driver.quit();
    }
    @Test
   public void verify_account_registration() throws InterruptedException {
       HomePage homepage = new HomePage(driver);
       homepage.clickMyAccount();
       homepage.clickRegister();
       AccountRegistrationPage regPage = new AccountRegistrationPage(driver);
       regPage.setFirstName(randomString().toUpperCase());
       regPage.setLatName(randomString().toUpperCase());
       regPage.setEmailId(randomString()+"@gmail.com");
       regPage.setPhoneNum(randomNumber());
       String password = randomAlphanumeric();
       regPage.setPassword(password);
       regPage.setConfirmPassword(password);
       regPage.setPrivacyPolicy();
       regPage.clickContinue();
      String comfmsg = regPage.getConfirmationMsg();
        Assert.assertEquals(comfmsg,"Your Account Has Been Created!");
       Thread.sleep(1000);


   }
    public String randomString()
    {
        String generatedString = RandomStringUtils.randomAlphabetic(6);
        return generatedString;
    }
    public String randomNumber()
    {
        String generatedNum = RandomStringUtils.randomNumeric(10);
        return generatedNum;
    }
    public String randomAlphanumeric()
    {
        String generatedAlphanum = RandomStringUtils.randomAlphanumeric(6);
        return generatedAlphanum;
    }
}
