package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Actions;
import pages.TrendyolPages;
import utilities.ConfigReader;
import utilities.Driver;

public class TrendyolStepDefinitions {

    TrendyolPages amazonPages = new TrendyolPages();

    Actions actions=new Actions(Driver.getDriver());


    @Given("user go to the trendyol page")
    public void user_go_to_the_trendyol_page() {
        Driver.getDriver().get(ConfigReader.getProperty("TrendyolURL"));
    }
    @Given("user click to login button")
    public void user_click_to_login_button() {
        amazonPages.homePageLoginIn.click();

    }
    @Then("user click to sign up")
    public void user_click_to_sign_up() {
        amazonPages.signUp.click();

    }
    @Given("user verify registration page")
    public void user_verify_registration_page() {
        amazonPages.trendyolLoginInOrSignUp.isDisplayed();

    }

    @Given("user pick woman or man")
    public void user_pick_woman_or_man() {
        amazonPages.trendyolLoginInOrSignUpMan.click();

    }

    @Given("user click to sign up in registration page")
    public void user_click_to_sign_up_in_registration_page() {
        amazonPages.registrationPageSignUp.click();

    }

    @Then("user see error message")
    public void user_see_error_message() {
        amazonPages.registrationPageErrorMessage.isDisplayed();

    }

    @Given("user write space to blanks")
    public void user_write_space_to_blanks() {
        amazonPages.registrationPageEmail.sendKeys("    ");
        amazonPages.registrationPagePassword.sendKeys("     ");

    }

    @Given("user click to woman button")
    public void user_click_to_woman_button() {
        amazonPages.homePageWomanButton.click();

    }

    @Then("user add first product to cart")
    public void user_add_first_product_to_cart() throws InterruptedException {
        amazonPages.firstProduct.click();
        amazonPages.firstProductAddCart.click();
        amazonPages.wait(20000);

    }

    @Given("user see first product in cart")
    public void user_see_first_product_in_cart() {
        amazonPages.firstProductVisibleInCart.isDisplayed();

    }
    @Then("user add first product favorites")
    public void user_add_first_product_favorites() {
        amazonPages.firstProductAddFavorites.click();

    }
    @Given("user go to cart")
    public void user_go_to_cart() {
        amazonPages.homePageCart.click();

    }
    @Given("user see first product in favorites")
    public void user_see_first_product_in_favorites() {
        amazonPages.firstProductVisibleInFavorites.isDisplayed();

    }

    @Given("user click cart button")
    public void user_click_cart_button() {
        amazonPages.homePageCart.click();

    }
    @Then("user click confirm basket")
    public void user_click_confirm_basket() {
        amazonPages.confirmBasket.click();

    }
    @Given("user click save and continue")
    public void user_click_save_and_continue() {
        amazonPages.saveAndContinue.click();

    }
    @Given("user see pay page successfully")
    public void user_see_pay_page_successfully() {
        amazonPages.trendyolWalletAddAndPay.isDisplayed();
        amazonPages.payment.isDisplayed();

    }

    @Given("user click to logout button")
    public void user_click_to_logout_button() {
        actions.clickAndHold(amazonPages.myAccount).perform();
        amazonPages.logOut.click();


    }

    @Given("user close advertisement")
    public void user_close_advertisement() {
        amazonPages.closeAd.click();
    }



}
