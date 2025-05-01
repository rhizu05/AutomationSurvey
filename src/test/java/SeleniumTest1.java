import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class SeleniumTest1 {
    WebDriver driver;

    @Test
    public void loginTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tally.so/r/nrvgzM");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Klik tombol Next
        By nextButton = By.xpath("//button[.//span[text()='Next']]");
        wait.until(ExpectedConditions.elementToBeClickable(nextButton)).click();

        // Tunggu teks "Usia" muncul
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Usia']")));

        // Klik label 20-30 tahun pakai JS
        By usiaOption = By.xpath("//label[contains(text(),'20-30')]");
        WebElement usiaLabel = wait.until(ExpectedConditions.elementToBeClickable(usiaOption));
        js.executeScript("arguments[0].click();", usiaLabel);

        // Klik label Laki-laki
        By kelaminOption = By.xpath("//label[contains(text(),'Laki')]");
        WebElement kelaminLabel = wait.until(ExpectedConditions.elementToBeClickable(kelaminOption));
        js.executeScript("arguments[0].click();", kelaminLabel);

        // Klik label Frekuensi
        By frekuensiOption = By.xpath("//label[contains(text(),'Baru pertama kali')]");
        WebElement frekuensiLabel = wait.until(ExpectedConditions.elementToBeClickable(frekuensiOption));
        js.executeScript("arguments[0].click();", frekuensiLabel);

        // Klik label Sering
        By seringOption = By.xpath("//label[contains(text(),'pernah')]");
        WebElement seringLabel = wait.until(ExpectedConditions.elementToBeClickable(seringOption));
        js.executeScript("arguments[0].click();", seringLabel);

        // Klik label Jenis
        By jenisOption = By.xpath("//label[contains(text(),'Motor')]");
        WebElement jenisLabel = wait.until(ExpectedConditions.elementToBeClickable(jenisOption));
        js.executeScript("arguments[0].click();", jenisLabel);

        // Klik label Nyaman
        By nyamanOption = By.xpath("//label[contains(text(),'nyaman')]");
        WebElement nyamanLabel = wait.until(ExpectedConditions.elementToBeClickable(nyamanOption));
        js.executeScript("arguments[0].click();", nyamanLabel);

        // Klik tombol Next
        By nextButton1 = By.xpath("//button[.//span[text()='Next']]");
        wait.until(ExpectedConditions.elementToBeClickable(nextButton1)).click();

        // Tunggu teks "Aplikasi" muncul
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Aplikasi']")));

        // Klik label Nyaman
        By us1Option = By.xpath("//label[@for='number_0b548669-feb5-4c33-8c35-c04a1771cd85_5']");
        WebElement us1Label = wait.until(ExpectedConditions.elementToBeClickable(us1Option));
        js.executeScript("arguments[0].click();", us1Label);


    }
}