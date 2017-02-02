package selenium.objects;

import org.junit.AfterClass;
import org.junit.Before;

import java.text.SimpleDateFormat;
import java.util.Date;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;


public abstract class UITest {


    public Boolean authenticate() {
        return true;
    }

    @Before
    public void baseDoAuthentication() {
        if (authenticate()) {
            getWebDriver().manage().window().maximize();
        }
    }

    public String getStrWithPostfix(String s) {
        return s + "_" + new SimpleDateFormat("ddMMyyyyHHmmss").format(new Date());
    }

    @AfterClass
    public static void tearDownBase(){
        try {
            getWebDriver().close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
