import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class PathPages {

    static String url = "http://www.google.com";
    static String title = "Unlimited Online Developer, IT and Cyber Security Training | Pluralsight";
    public void goTo() {
        Browser.goTo(url);
    }

    public void gotToJavaPath() {
        WebElement input = Browser.driver.findElement(By.id("lst-ib"));
        input.sendKeys("pluralsight");
        input.submit();

        WebElement link = Browser.driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div/div/div"));
        Actions actions = new Actions(Browser.driver);
        actions.moveToElement(link).click().build().perform();

        WebElement title = Browser.driver.findElement(By.linkText("Pluralsight: Unlimited Online Developer, IT and Cyber Security Training"));
        Actions actions1 = new Actions(Browser.driver);
        actions1.moveToElement(title).click().build().perform();
    }

    public boolean isAt() {
        return Browser.title().equals(title);
    }
}
