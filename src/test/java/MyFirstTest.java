import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MyFirstTest {

    private WebDriver driver;

    @Before

    public void setup() {

        //String pathToChromeDriver = " /Users/russellsabia/Desktop/Java_Projects/chromedriver";

        System.setProperty("webdriver.chrome.driver", "/Users/russellsabia/Desktop/Java_Projects/chromedriver");


        //establish new driver
        driver = new ChromeDriver();


    }

    @After
    public void teardown() {
        driver.close();
    }

    @Test
    public void testOne() {

        // testing parameters
        String searchParam = "Testing bot";
        String searchParam2 = "F22 Raptor";
        String email = "rjsabia@gmail.com";
        String url = "http://www.google.com";

        // count parameters
        int sec = 5;
        int sleep = 3000;

        JavascriptExecutor js = (JavascriptExecutor) driver;

        //example test using google

        driver.navigate().to(url);

        driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);

        driver.findElement(By.name("q")).sendKeys(searchParam, Keys.ENTER);

        driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//*[@id=\"gb_70\"]")).click();

        driver.findElement(By.id("identifierId")).sendKeys(email);

        driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();

        driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);

        driver.navigate().back();

        driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);

        driver.navigate().back();

        driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);

        driver.findElement(By.name("q")).sendKeys(searchParam2, Keys.ENTER);

        driver.findElement(By.xpath("//*[@id=\"hdtb-msb-vis\"]/div[2]/a")).click();

        driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);

        js.executeScript("window.scrollBy(0, 500)");

        //This forces a pause, not best practice, but good for me to see the test execute
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        //End Google Program test
        // **************
        // example test with the ilendx site

        //driver.navigate().to("https://ilendx.com");

        //driver.findElement(By.id("guide-button")).click();

        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

//        driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[2]/a")).click();
//
//        WebDriverWait wait = new WebDriverWait(driver, 20);
//        wait.until(ExpectedConditions.elementToBeClickable(By.id("andy"))).click();
//
//        driver.findElement(By.id("andy")).click();
//
//        driver.findElement(By.id("luther")).click();
//
//        driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a")).click();

        //driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");


    }
}
