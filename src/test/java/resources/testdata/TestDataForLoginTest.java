package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestDataForLoginTest{

    @DataProvider(name = "DataSet")
    public Object[][] getData() {

        Object[][] data = new Object[][]{
                {" ", " ", "Required"},
                {"test123@gmail.com", " ", "Required"},
                {" ", "test123", "Required"},
                {"test123@gmail.com", "test123", "Invalid credentials"}
        };
        return data;
    }
}
