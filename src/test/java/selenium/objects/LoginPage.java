package selenium.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private By userNameSelect = By.cssSelector("input#usernameId");
    private By passLocator = By.cssSelector("input#passwordId");
    private By btnEnterLocator = By.cssSelector("button.btn_submit");


    public LoginPage selectUserName(String username){
        Select selectUsername = new Select($(userNameSelect).shouldBe(appear));
        selectUsername.selectByVisibleText(username);
        return this;
    }

    public LoginPage typePassword(String pass){
        $(passLocator).shouldBe(appear).clear();
        $(passLocator).sendKeys(pass);
        return this;
    }

    public void submit(){
        $(btnEnterLocator).shouldBe(appear).click();
    }

    public void logInWithStarGate(String userName){
        submit();
    }

    public void logIn(String userName, String password){
        selectUserName(userName).typePassword(password).submit();
    }
}
