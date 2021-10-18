package pageObjects;

import elementMapper.CartPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class CartPage extends CartPageElementMapper {

    public CartPage() {
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public String getNameProductCart() {

        return productNameCart.getText();
    }

    public void clickBtnSummaryProceed() {

        proceedCheckoutSummary.click();
    }

    public void clickBtnAddressProceed() {
        proceedCheckoutAddress.click();
    }

    public void clickCheckBoxShipping(){
        checkboxShipping.click();
    }

    public void clickBtnShippingProceed() {
        proceedCheckoutShipping.click();
    }

    public void clickBtnPayByBankBtn() {
        payByBankBtn.click();
    }

    public void clickBtnConfirmOrder() {
        btnConfirmOrder.click();
    }

    public String getTextOrderComplete() {
        return orderComplete.getText();
    }

    public boolean isTextOrderComplete() {

        return getTextOrderComplete().equals("Your order on My Store is complete.");
    }

}
