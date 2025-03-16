package SeleniumTests.pageObjects.testCases;

import org.testng.annotations.Test;
import SeleniumTests.pageObjects.HomePage;

public class TC002_LoginTest extends BaseClass{
    @Test
    public void Verify_User_Login ()
    {
        HomePage user = new HomePage( driver);
        user.clickMyAccount();
        user.clickLogin();
        user.setUserLoginEmail("sur1234567890@gmail.com");
        user.setUserLoginPassword("qwerty@1234567890");
        user.LoginBtn();
    }
}
