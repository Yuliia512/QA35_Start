import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class login1 {
    WebDriver wd;

    @Test
    public void login1(){
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        wd.navigate().to("https://trello.com/");

        WebElement loginButton= wd.findElement(By.cssSelector("[href='/login']"));
        loginButton.click(); // click Log in button

        WebElement emailButton= wd.findElement(By.cssSelector("#user"));
        emailButton.click();
        emailButton.clear();
        emailButton.sendKeys("juliaklarissa@gmail.com");// enter email

        WebElement attlassianButton= wd.findElement(By.cssSelector("#login"));
        attlassianButton.click();

        WebElement passwordInput= wd.findElement(By.cssSelector("#password"));
        passwordInput.click();
        passwordInput.clear();
        passwordInput.sendKeys("423090y$#");

        WebElement submitButton = wd.findElement(By.cssSelector("#login-submit"));
        submitButton.click();

        wd.close();
        wd.quit();

    }

}