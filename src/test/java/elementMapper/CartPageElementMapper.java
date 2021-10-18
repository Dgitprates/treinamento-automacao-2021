package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPageElementMapper {

    @FindBy(css = ".cart_description .product-name")
    public WebElement productNameCart;

    @FindBy(css = ".standard-checkout > span")
    public WebElement proceedCheckoutSummary;

    @FindBy(css = ".button:nth-child(4) > span")
    public WebElement proceedCheckoutAddress;

    @FindBy(css = "#uniform-cgv #cgv")
    public WebElement checkboxShipping;

    @FindBy(css = ".standard-checkout > span")
    public WebElement proceedCheckoutShipping;

    @FindBy(css = ".bankwire > span")
    public WebElement payByBankBtn;

    @FindBy(css = "#cart_navigation span")
    public WebElement btnConfirmOrder;

    @FindBy(xpath = "//*[@id=\"center_column\"]/div/p/strong")
    public WebElement orderComplete;

}
