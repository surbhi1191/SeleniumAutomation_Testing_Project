package SeleniumTests.pageObjects.testCases;
import org.testng.Assert;
import org.testng.annotations.Test;
import SeleniumTests.pageObjects.AccountRegistrationPage;
import SeleniumTests.pageObjects.HomePage;

public class TC001_AccountRegistrationTest extends BaseClass{
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

}
