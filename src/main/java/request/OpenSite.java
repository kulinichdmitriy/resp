package request;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenSite {
    Log logger = new Log();

    public void openSite(String sitename) {
        System.setProperty("webdriver.chrome.driver", "Z://request//chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get(sitename);
        driver.close();
    }
}