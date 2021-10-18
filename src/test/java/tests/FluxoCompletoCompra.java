package tests;

import org.junit.Test;
import pageObjects.*;

import static org.junit.Assert.*;

public class FluxoCompletoCompra extends BaseTests{

    @Test

    public void testFluxoCompletoCompra() {

        HomePage home = new HomePage();
        LoginPage login = new LoginPage();
        CategoryPage category = new CategoryPage();
        ProductPage product = new ProductPage();
        CartPage cart = new CartPage();

        home.clickBtnLogin();
        login.fillEmail();
        login.fillPasswd();
        login.clickBtnSubmitLogin();
        home.clickCategoryTShirts();
        category.clickProductAddToProductPage();
        product.clickButtonAddToCart();
        product.clickButtonModalProceedToCheckout();
        cart.clickBtnSummaryProceed();
        cart.clickBtnAddressProceed();
        cart.clickCheckBoxShipping();
        cart.clickBtnShippingProceed();
        cart.clickBtnPayByBankBtn();
        cart.clickBtnConfirmOrder();

        assertTrue(cart.isTextOrderComplete());

    }

}