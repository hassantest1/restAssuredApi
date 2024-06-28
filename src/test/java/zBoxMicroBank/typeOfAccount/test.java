package zBoxMicroBank.typeOfAccount;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.sql.DriverManager;

public class test {
    @Test
    public void test(){
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.com");
        driver.findElement(By.id(""));
    }

}
