package tests;

import base.BaseTest;
import data.TestData;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {


    @Test(dataProvider = "loginCredentials", dataProviderClass = TestData.class)
    public void testLogin(String email, String password){
        driver.findElement(By.id("user-name")).sendKeys(email);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();

        //Assertionlogic



        System.out.println("Tested login with :"  +email+ " | "+password);

    }

}
