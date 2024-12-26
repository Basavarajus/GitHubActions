import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromiumDriverManager;
import org.apache.commons.collections.bag.SynchronizedSortedBag;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Auto {

    @Test(enabled = true)
    public void Testcase1(){
        System.out.println("Hellow testcase1");
    }

    @Test(enabled = true)
    public void Testcase2(){
        System.out.println("Hello testcase2 ");
    }

    @Test
    public void NulTest(){
        System.out.println("Helllowww i'm also exectint");
    }

    @Test
    public void Selenium() {
        WebDriverManager.chromedriver().setup();
        //  System.setProperty("webdriver.chrome.driver","/Users/nagarajs/Desktop/WebDrivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
        driver.close();
        driver.quit();
    }
}
