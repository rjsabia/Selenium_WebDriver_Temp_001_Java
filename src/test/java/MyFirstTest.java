import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstTest {

    private WebDriver driver;

    @Before

    public void setup(){

        //String pathToChromeDriver = " /Users/russellsabia/Desktop/Java_Projects/chromedriver";

        System.setProperty("webdriver.chrome.driver", "/Users/russellsabia/Desktop/Java_Projects/chromedriver");

        driver = new ChromeDriver();

    }

    @After
    public void teardown(){
        driver.close();
    }

    @Test
    public void testOne() {
    //test will go here
        driver.navigate().to("http://www.google.com");


    }
}
