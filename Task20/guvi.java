package Task20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class guvi {
    public static void main(String[] args) {
   

        
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.guvi.in/");

        
        WebElement signupButton = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='btn btn-danger btn-lg btn-sign-up']")));
        signupButton.click();

        
        WebElement nameInput = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated(By.id("signupname")));
        nameInput.sendKeys("YourName");
        WebElement emailInput = driver.findElement(By.id("signupemail"));
        emailInput.sendKeys("jodogad992@minhlun.com");
        WebElement passwordInput = driver.findElement(By.id("signuppassword"));
        passwordInput.sendKeys("Jod@12345");

      
        WebElement signupSubmitButton = driver.findElement(By.xpath("//button[@type='submit' and text()='Sign up']"));
        signupSubmitButton.click();

       
        new WebDriverWait(driver, 10).until(ExpectedConditions.urlContains("/dashboard"));


        WebElement loginButton = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='btn btn-success btn-lg btn-sign-in']")));
        loginButton.click();

       
        WebElement loginEmailInput = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated(By.id("loginemail")));
        loginEmailInput.sendKeys("jodogad992@minhlun.com");
        WebElement loginPasswordInput = driver.findElement(By.id("loginpassword"));
        loginPasswordInput.sendKeys("Jod@12345");

        // Click on the Login button to submit the form
        WebElement loginSubmitButton = driver.findElement(By.xpath("//button[@type='submit' and text()='Login']"));
        loginSubmitButton.click();

        
        new WebDriverWait(driver, 10).until(ExpectedConditions.urlContains("/dashboard"));

        
        driver.quit();
    }
}
