package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Actions;
import pages.TrendyolPages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSutils;
import utilities.ReusableMethods;

import java.io.IOException;

public class TrendyolStepDefinitions {

    TrendyolPages trendyolPages = new TrendyolPages();

    Actions actions=new Actions(Driver.getDriver());


    @Given("user go to the trendyol page")
    public void user_go_to_the_trendyol_page() {
        Driver.getDriver().get(ConfigReader.getProperty("TrendyolURL"));
    }
    @Given("user click to login button")
    public void user_click_to_login_button() {
        trendyolPages.homePageLoginIn.click();

    }
    @Then("user click to sign up")
    public void user_click_to_sign_up() {
        trendyolPages.signUp.click();

    }
    @Given("user verify registration page")
    public void user_verify_registration_page() {
        trendyolPages.trendyolLoginInOrSignUp.isDisplayed();

    }

    @Given("user pick woman or man")
    public void user_pick_woman_or_man() {
        trendyolPages.trendyolLoginInOrSignUpMan.click();

    }

    @Given("user click to sign up in registration page")
    public void user_click_to_sign_up_in_registration_page() {
        trendyolPages.registrationPageSignUp.click();

    }

    @Then("user see error message")
    public void user_see_error_message() {
        trendyolPages.registrationPageErrorMessage.isDisplayed();

    }

    @Given("user write space to blanks")
    public void user_write_space_to_blanks() {
        trendyolPages.registrationPageEmail.sendKeys("    ");
        trendyolPages.registrationPagePassword.sendKeys("     ");

    }

    @Given("user click to woman button")
    public void user_click_to_woman_button() {
        trendyolPages.homePageWomanButton.click();

    }

    @Then("user add first product to cart")
    public void user_add_first_product_to_cart() throws InterruptedException {
        trendyolPages.firstProduct.click();
        trendyolPages.firstProductAddCart.click();
        trendyolPages.wait(20000);

    }

    @Given("user see first product in cart")
    public void user_see_first_product_in_cart() {
        trendyolPages.firstProductVisibleInCart.isDisplayed();

    }
    @Then("user add first product favorites")
    public void user_add_first_product_favorites() {
        trendyolPages.firstProductAddFavorites.click();

    }
    @Given("user go to cart")
    public void user_go_to_cart() {
        trendyolPages.homePageCart.click();

    }
    @Given("user see first product in favorites")
    public void user_see_first_product_in_favorites() {
        trendyolPages.firstProductVisibleInFavorites.isDisplayed();

    }

    @Given("user click cart button")
    public void user_click_cart_button() {
        trendyolPages.homePageCart.click();

    }
    @Then("user click confirm basket")
    public void user_click_confirm_basket() {
        trendyolPages.confirmBasket.click();

    }
    @Given("user click save and continue")
    public void user_click_save_and_continue() {
        trendyolPages.saveAndContinue.click();

    }
    @Given("user see pay page successfully")
    public void user_see_pay_page_successfully() {
        trendyolPages.trendyolWalletAddAndPay.isDisplayed();
        trendyolPages.payment.isDisplayed();

    }

    @Given("user click to logout button")
    public void user_click_to_logout_button() {
        actions.clickAndHold(trendyolPages.myAccount).perform();
        trendyolPages.logOut.click();


    }

    @Given("user close advertisement")
    public void user_close_advertisement() {
        trendyolPages.closeAd.click();
    }

    @Given("user click supermarket")
    public void user_click_supermarket() {
        trendyolPages.homePageSupermarket.click();
    }
    @Given("user click first product in supermarket")
    public void user_click_first_product_in_supermarket() {
        trendyolPages.supermarketFirstProduct.click();
    }
    @Then("user click product questions")
    public void user_click_product_questions() {
        trendyolPages.supermarketFirstProductQuestions.click();

    }
    @Given("user see first product question and answer")
    public void user_see_first_product_question_and_answer() {
        trendyolPages.supermarketFirstProductQuestionsFirstQuestion.isDisplayed();
        trendyolPages.supermarketFirstProductQuestionsFirstQuestionAnswer.isDisplayed();
    }
    @Given("user report to screenshot product questions and answers frame")
    public void user_report_to_screenshot_product_questions_and_answers_frame() {
        JSutils.tumSayfaScreenshot();
    }



}
