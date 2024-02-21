package Task20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class iframe {
    public static void main(String[] args) {
        
        // Launch ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Maximize the window
        driver.manage().window().maximize();

        // Navigate to the URL
        driver.get("https://jqueryui.com/datepicker/");
        
        driver.switchTo().frame(0);
        
        WebElement frame =driver.findElement(By.id("datepicker"));
        
        frame.click();
        
    
        WebElement dateButton = driver.findElement(By.xpath("//a[text()='22']"));
        dateButton.click();
        
        String selectedDate = dateButton.getText();
        System.out.println("Selected date: " + selectedDate);
        
        
    }
}
