package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JSutils {
    public static void clickElementByJS(WebElement element) {
        JavascriptExecutor jsexecutor = ((JavascriptExecutor) Driver.getDriver());
        jsexecutor.executeScript("arguments[0].click();", element);
    }


    public static void scrollIntoVIewJS(WebElement element) {
        JavascriptExecutor jsexecutor = ((JavascriptExecutor) Driver.getDriver());
        jsexecutor.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void tumSayfaScreenshot() {
        TakesScreenshot tss = (TakesScreenshot) Driver.getDriver();

        String tarih = new SimpleDateFormat("yyMMddhhmmss").format(new Date());

        File tumSayfaSS = new File("target/screenShot/tumSayfa" + tarih + ".jpeg");
        File gecici = tss.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(gecici, tumSayfaSS);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}