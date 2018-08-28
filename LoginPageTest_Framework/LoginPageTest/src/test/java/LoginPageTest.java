import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class LoginPageTest {
    @Parameterized.Parameter(value = 0)
    public String username;

    @Parameterized.Parameter(value = 1)
    public String password;

    @Parameterized.Parameter(value = 2)
    public String expectedMsg;


    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"tomsmith","SuperSecretPassword!","You logged into a secure area!\n×"}, //valid combination
                {"temp","SuperSecretPassword!","Your username is invalid!\n×"}, //invalid username
                {"tomsmith","password","Your password is invalid!\n×"}, //invalid password
                {"temp","password","Your username is invalid!\n×"}
        });
    }
    @Test
    public void LoginTests(){
        Pages.homePage().goTo();
        Pages.homePage().checkLogin(username,password);
        Assert.assertTrue(Pages.homePage().verifyMessage(expectedMsg));
    }

    @AfterClass
    public static void cleanUp(){
        Browser.close();
    }
}
