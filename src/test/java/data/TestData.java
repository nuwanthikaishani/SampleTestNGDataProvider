package data;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "loginCredentials")
    public Object[][] getLoginData(){

        return new Object[][]{
                {"standard_user", "secret_sauce"},
                {"locked_out_user", "secret_sauce"},
                {"problem_user", "secret_sauce"}

        };

    }
}
