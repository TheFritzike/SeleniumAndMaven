import common.CommonMethods;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductPage;

public class SmokeTest {
    CommonMethods objCommon = new CommonMethods();
    LoginPage objLogin = new LoginPage();
    ProductPage objProduct = new ProductPage();
    @Test
    public void SauceDemo(){
        //Test base setup
        objCommon.browserSetup();
        //Tests
        Assert.assertTrue(objLogin.userInputSearch());
        Assert.assertTrue(objLogin.passwordInputSearch());
        Assert.assertTrue(objLogin.loginPress());
        Assert.assertTrue(objProduct.verifyProductsText("Products"));
        //Test end
        objCommon.browserTearDown();
    }
}
