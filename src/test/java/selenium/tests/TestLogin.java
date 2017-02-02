package selenium.tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import selenium.objects.LoginPage;
import selenium.objects.UITest;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.CHROME;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class TestLogin extends UITest {

    @Override
    public Boolean authenticate() {
        return false;
    }

    private By pageLabel = By.cssSelector("div.header-inline");
    private LoginPage loginPage;
    @Before
    public void setUp(){
//            System.getProperty("os.name").startsWith("Windows");
//            String path = "./src/test/resources/driver/chromedriver.exe";
//            System.setProperty("webdriver.chrome.driver", path);
            com.codeborne.selenide.Configuration.baseUrl = "https://nba10.vimpelcom.ru:1862/dashboard";
            com.codeborne.selenide.Configuration.timeout = 10000;
            com.codeborne.selenide.Configuration.browser = CHROME;
            com.codeborne.selenide.Configuration.startMaximized = true;
            com.codeborne.selenide.Configuration.remote = "http://10.50.8.125:4444/wd/hub";
        getWebDriver().manage().window().maximize();
        loginPage = open("https://nba10.vimpelcom.ru:1862/dashboard/starGate", LoginPage.class);
        Assert.assertTrue("Страница авторизации не доступна!",$(pageLabel).shouldBe(appear).getText().equals("CM Dashboard"));
    }

    @Test
    public void loginWithStarGate(){
        loginPage.logInWithStarGate("Администратор");
        Assert.assertTrue("", $(By.cssSelector("div.pull-left h1")).getText().equals("CM Dashboard"));
    }

//    @After
//    public void tearDown(){
//        close();
//    }

}
