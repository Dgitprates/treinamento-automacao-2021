package tests;

import org.junit.Test;
import pageObjects.*;

import static org.junit.Assert.*;

public class FluxoCriacaoConta extends BaseTests{

    @Test

    public void testFluxoCriacaoConta() {

        HomePage home = new HomePage();
        LoginPage login = new LoginPage();
        CreateAccountPage create = new CreateAccountPage();

        home.clickBtnLogin();
    //    login.fillEmailCreate();
    //    login.clickBtnCreateAccount();
    //    create.clickRadioBtn();
    //    create.fillFirstNamePersonalInformation();
    //    create.fillLastNamePersonalInformation();
    //    create.fillPassword();
    //    create.clickDayDateOfBirth();
    //    create.clickDayOfBirth();
    //    create.clickMonthsDateOfBirth();
    //    create.clickMonthsOfBirth();
    //    create.clickYearsDateOfBirth();
    //    create.clickYearsOfBirth();
    //    create.fillFirstNameYourAddress();
    //    create.fillLastNameYourAddress();
    //    create.fillCompanyYourAddress();
    //    create.fillAddress1YourAddress();
    //    create.fillAddress2YourAddress();
    //    create.fillCityYourAddress();
    //    create.clickStateYourAddress();
    //    create.clickYourStateYourAddress();
    //    create.fillZipYourAddress();
    //    create.fillMobilePhoneYourAddress();
    //    create.clickBtnRegister();

    //    assertTrue(create.isTextMyAccount());

    }

}