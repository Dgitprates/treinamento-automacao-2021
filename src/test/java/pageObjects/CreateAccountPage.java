package pageObjects;

import elementMapper.CreateAccountPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class CreateAccountPage extends CreateAccountPageElementMapper {

    public CreateAccountPage() {
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public void clickRadioBtn(){
        radioBtn.click();
    }

    public void fillFirstNamePersonalInformation() {
        firstNamePersonalInformation.sendKeys("Diego"); }

    public void fillLastNamePersonalInformation() {
        lastNamePersonalInformation.sendKeys("Prates"); }

    public void fillPassword() {
        password.sendKeys("123456"); }

    public void clickDayDateOfBirth(){
       days.click();
    }

    public void clickDayOfBirth(){
        dayOfBirth.click();
    }

    public void clickMonthsDateOfBirth(){

        months.click();
    }

    public void clickMonthsOfBirth(){

        monthsOfBirth.click();
    }

    public void clickYearsDateOfBirth(){

        years.click();
    }

    public void clickYearsOfBirth(){

        yearsOfBirth.click();
    }

    public void fillFirstNameYourAddress() {
        firstname.sendKeys("Diego"); }

    public void fillLastNameYourAddress() {
        lastname.sendKeys("Prates"); }

    public void fillCompanyYourAddress() {
        company.sendKeys("CWI"); }

    public void fillAddress1YourAddress() {
        address1.sendKeys("Teste 1"); }

    public void fillAddress2YourAddress() {
        address2.sendKeys("Teste 2"); }

    public void fillCityYourAddress() {
        city.sendKeys("New York"); }

    public void clickStateYourAddress(){

        id_state.click();
    }

    public void clickYourStateYourAddress(){

        yourStateYourAddress.click();
    }

    public void fillZipYourAddress() {
        postcode.sendKeys("10001"); }

    public void fillMobilePhoneYourAddress() {
        phone_mobile.sendKeys("+5551999661122"); }

    public void clickBtnRegister(){

        btnRegister.click();
    }

    public String getTextMyAccount() {

        return myAccount.getText();
    }

    public boolean isTextMyAccount(){
        return getTextMyAccount().equals("MY ACCOUNT");
    }

}

