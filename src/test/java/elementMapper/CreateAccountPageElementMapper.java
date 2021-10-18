package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPageElementMapper {

    @FindBy(css = "#id_gender1")
    public WebElement radioBtn;

    @FindBy(css = "#customer_firstname")
    public WebElement firstNamePersonalInformation;

    @FindBy(css = "#customer_lastname")
    public WebElement lastNamePersonalInformation;

    @FindBy(css = "#passwd")
    public WebElement password;

    public WebElement days;

    @FindBy(xpath = "//*[@id=\"days\"]/option[7]")
    public WebElement dayOfBirth;

    public WebElement months;

    @FindBy(xpath = "//*[@id=\"months\"]/option[2]")
    public WebElement monthsOfBirth;

    public WebElement years;

    @FindBy(xpath = "//*[@id=\"years\"]/option[33]")
    public WebElement yearsOfBirth;

    public WebElement firstname;

    public WebElement lastname;

    public WebElement company;

    public WebElement address1;

    public WebElement address2;

    public WebElement city;

    public WebElement id_state;

    @FindBy(xpath = "//*[@id=\"id_state\"]/option[34]")
    public WebElement yourStateYourAddress;

    public WebElement postcode;

    public WebElement phone_mobile;

    @FindBy(css = "#submitAccount > span")
    public WebElement btnRegister;

    @FindBy(className = "page-heading")
    public WebElement myAccount;

}
