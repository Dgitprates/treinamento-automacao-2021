package pageObjects;

import elementMapper.HomePageElementMapper;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class HomePage extends HomePageElementMapper {
    public HomePage() {
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public void clickBtnLogin() {
        login.click();
    }

    public void clicksearch_query_top() {
        search_query_top.click();
    }

    public void sendsearch_query_top(String keys) {
        search_query_top.sendKeys(keys);
    }

    public void clicksubmit_search() {
        submit_search.click();
    }

    public void doSearch(String quest) {
        clicksearch_query_top();
        sendsearch_query_top(quest);
        clicksubmit_search();
    }

    public void clickCategoryTShirts() {
        menuTshirts.click();
    }

}
