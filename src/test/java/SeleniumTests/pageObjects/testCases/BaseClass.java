package SeleniumTests.pageObjects.testCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseClass {
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
    //for generating random data
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
