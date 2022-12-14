package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TrendyolPages {

    public TrendyolPages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//p[contains(text(),'Giriş Yap')]")
    public WebElement homePageLoginIn;

    @FindBy(xpath = "//button[contains(@class,'q-secondary q-button-medium q-button tab button right')]")
    public WebElement signUp;

    @FindBy(xpath = "//h3[contains(text(),'Trendyol’a giriş yap veya hesap oluştur, indirimle')]")
    public WebElement trendyolLoginInOrSignUp;

    @FindBy(xpath = "//span[normalize-space()='Erkek']")
    public WebElement trendyolLoginInOrSignUpMan;

    @FindBy(xpath = "//button[contains(@type,'submit')]//span[contains(text(),'Üye Ol')]")
    public WebElement registrationPageSignUp;

    @FindBy(xpath = "//input[@id='register-email']")
    public WebElement registrationPageEmail;

    @FindBy(xpath = "//input[@id='register-password-input']")
    public WebElement registrationPagePassword;

    @FindBy(xpath = "//span[@class='message']")
    public WebElement registrationPageErrorMessage;

    @FindBy(xpath = "//a[@class='category-header'][contains(text(),'Kadın')]")
    public WebElement homePageWomanButton;

    @FindBy(xpath = "//div[@title='Kadın Siyah Korse Tayt']//div[@class='custom-stamp-box-wrapper']")
    public WebElement firstProduct;

    @FindBy(xpath = "//button[@class='add-to-basket']")
    public WebElement firstProductAddCart;

    @FindBy(xpath = "//p[normalize-space()='Sepetim']")
    public WebElement homePageCart;

    @FindBy(xpath = "//button[@class='fv']//i[@class='i-heart']")
    public WebElement firstProductAddFavorites;

    @FindBy(xpath = "//p[@title='Light Black Kadın Siyah Korse Tayt']//span[contains(text(),'Light Black')]")
    public WebElement firstProductVisibleInCart;

    @FindBy(xpath = "//p[normalize-space()='Favorilerim']")
    public WebElement homePageFavorites;

    @FindBy(xpath = "//img[@class='p-card-img']")
    public WebElement firstProductVisibleInFavorites;

    @FindBy(xpath = "//p[@title='Light Black Kadın Siyah Korse Tayt']//span[contains(text(),'Light Black')]")
    public WebElement firstProductVisible;

    @FindBy(xpath = "//aside[@class='sticky']//div[5]//a[1]")
    public WebElement confirmBasket;

    @FindBy(xpath = "//aside[@class='sticky']//div[4]//button[1]")
    public WebElement saveAndContinue;

    @FindBy(xpath = "//span[contains(text(),'Trendyol Cüzdanıma Yükle ve Öde')]")
    public WebElement trendyolWalletAddAndPay;

    @FindBy(xpath = "//aside[@class='sticky']//div[4]//button[1]")
    public WebElement payment;

    @FindBy(xpath = "//p[contains(text(),'Çıkış Yap')]")
    public WebElement logOut;

    @FindBy(xpath = "//p[contains(text(),'Hesabım')]")
    public WebElement myAccount;

    @FindBy(xpath = "//div[@class='modal-close']")
    public WebElement closeAd;

    @FindBy(xpath = "//a[normalize-space()='Süpermarket']")
    public WebElement homePageSupermarket;

    @FindBy(xpath = "//article[5]//div[1]//div[1]//div[3]//div[2]//div[1]//a[1]//div[1]//div[1]//div[2]")
    public WebElement supermarketFirstProduct;

    @FindBy(xpath = "//span[contains(text(),'Ürün Soruları (3185)')]")
    public WebElement supermarketFirstProductQuestions;

    @FindBy(xpath = "//div[@class='seller-questions-toggle-container']")
    public WebElement supermarketFirstProductQuestionsFirstQuestion;

    @FindBy(xpath = "//body/div[@id='container']/div[@data-fragment-name='Questions']/div[@id='questions-and-answers-app']/div[@class='questions-app-container-v2']/div/div/div[@class='pr-qna-v2']/div[@class='pr-qna-cnt-bs']/div[@class='pr-qna-cnt gnr-cnt-br']/div[2]/div[2]")
    public WebElement supermarketFirstProductQuestionsFirstQuestionAnswer;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]")
    public WebElement supermarketFirstProductQuestionsFrame;



}
