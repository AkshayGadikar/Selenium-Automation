import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;

public class UnitTest {

    @Test
    public void canGoToHomePage(){
        Pages.homePage().goTo();
        Assert.assertTrue(Pages.homePage().isAt());
    }

    @Test
    public void canGoToJavaPathPage(){
        Pages.pathPages().goTo();
        Pages.pathPages().gotToJavaPath();
        Assert.assertTrue(Pages.pathPages().isAt());
    }

    @AfterClass
    public static void cleanUp(){
        Browser.close();
    }
}
