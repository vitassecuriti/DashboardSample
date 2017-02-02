package selenium.tests;

import org.junit.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.CHROME;

public class test {

    @Test
    public void test() {
        System.getProperty("os.name").startsWith("Windows");
        String path = "./src/test/resources/driver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", path);

            com.codeborne.selenide.Configuration.timeout = 10000;
            com.codeborne.selenide.Configuration.browser = CHROME;
            com.codeborne.selenide.Configuration.startMaximized = true;
    open("https://nba10.vimpelcom.ru:1862/dashboard/starGate");

    }

}
