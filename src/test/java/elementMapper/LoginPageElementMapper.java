package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageElementMapper {

    public WebElement email;

    public WebElement passwd;

    public WebElement SubmitLogin;

    public WebElement email_create;

    @FindBy(css = "#SubmitCreate > span")
    public WebElement BtnCreateAccount;

}
