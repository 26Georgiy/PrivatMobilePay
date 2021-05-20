import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class privatMobile  {
    @Test
            public void testP2P(){

    System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
        driver.get("https://next.privat24.ua/mobile");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        By PhoNum = By.xpath("//input[@data-qa-node='phone-number']");
        driver.findElement(PhoNum).sendKeys("992725554");
        By Amount = By.xpath("//input[@data-qa-node='amount']");
        driver.findElement(Amount).sendKeys("100");
        By Card = By.xpath("//input[@data-qa-node='numberdebitSource']");
        driver.findElement(Card).sendKeys("5309233034765085");
        By ExDate = By.xpath("//input[@data-qa-node='expiredebitSource']");
        driver.findElement(ExDate).sendKeys("01/24");
        By Cvv = By.xpath("//input[@data-qa-node='cvvdebitSource']");
        driver.findElement(Cvv).sendKeys("891");
        By Name = By.xpath("//input[@data-qa-node='firstNamedebitSource']");
        driver.findElement(Name).sendKeys("Denis");
        By LastN = By.xpath("//input[@data-qa-node='lastNamedebitSource']");
        driver.findElement(LastN).sendKeys("Rodman");
        By submit = By.xpath("//button[contains(text(),'В кошик')]");
        driver.findElement(submit).click();

        By PayerCard = By.xpath("//td[@data-qa-node= 'card']");
        Assert.assertEquals("5309 **** **** 5085", driver.findElement(PayerCard).getText());


        By PayAmount = By.xpath("//span[@data-qa-node='amount']");
        Assert.assertEquals("100",driver.findElement(PayAmount).getText());






    }
}
