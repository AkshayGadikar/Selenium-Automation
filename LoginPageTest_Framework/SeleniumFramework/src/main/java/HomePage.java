//class specifying links and targets to actual resources


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage {

    static String url = "http://the-internet.herokuapp.com/login";
    static String title = "The Internet";

    public void goTo() {
        Browser.goTo(url);
    }

    public boolean isAt() {
        return Browser.title().equals(title);
    }

    public void checkLogin(String username, String password) {
        WebElement userName = Browser.driver.findElement(By.id("username"));
        userName.sendKeys(username);
        WebElement passWord = Browser.driver.findElement(By.id("password"));
        passWord.sendKeys(password);
        WebElement loginButton = Browser.driver.findElement(By.xpath("/html/body/div[2]/div/div/form/button"));
        loginButton.click();
    }


    public boolean verifyMessage(String expectedMsg) {
        String obtainedMsg = Browser.driver.findElement(By.id("flash")).getText();
        System.out.println(obtainedMsg);
        return obtainedMsg.equals(expectedMsg);
    }
}
