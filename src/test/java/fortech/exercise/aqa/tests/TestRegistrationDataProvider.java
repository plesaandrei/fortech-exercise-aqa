package fortech.exercise.aqa.tests;

import fortech.exercise.aqa.models.RegistrationFormModel;
import fortech.exercise.aqa.pages.HomeCategoriesPage;
import fortech.exercise.aqa.pages.ItemsElementsPage;
import fortech.exercise.aqa.pages.ItemsElementsWebTablePage;
import fortech.exercise.aqa.pages.RegistrationFormPage;
import fortech.exercise.aqa.reader.ExcelReader;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;

public class TestRegistrationDataProvider extends BaseTest{

    @Test(dataProvider = "ExcelDataProvider")
    public void registerTestWithExcelDP(RegistrationFormModel registrationFormModel) {
        register(registrationFormModel);
    }


    private void register(RegistrationFormModel registrationFormModel) {


        driver.get("https://demoqa.com");

        HomeCategoriesPage homeCategoriesPage = new HomeCategoriesPage(driver);
        homeCategoriesPage.getElementsElement().click();

        ItemsElementsPage itemsElementsPage = new ItemsElementsPage(driver);
        itemsElementsPage.getWebTablesElement().click();

        ItemsElementsWebTablePage itemsElementsWebTablePage = new ItemsElementsWebTablePage(driver);
        itemsElementsWebTablePage.getAddButtonElement().click();

        System.out.println("FFFF NNNN"+registrationFormModel.getFirstName());

        RegistrationFormPage registrationFormPage=new RegistrationFormPage(driver);
        registrationFormPage.register(registrationFormModel);

        System.out.println(registrationFormPage.getFirstNameWebElement().getCssValue("border-top-color").toString());

    }
    @DataProvider(name = "ExcelDataProvider")
    public Object[][] excelDataProviderTable() throws Exception {

        ClassLoader classLoader = getClass().getClassLoader();
        File excelFile = getFileFromResources("excel/RegisterData.xlsx");
        String[][] excelData = ExcelReader.readExcelFile(excelFile, "Sheet1", true, true);
        Object[][] dp = new Object[excelData.length][1];

        for (int i = 0; i < dp.length; i++) {

            RegistrationFormModel registrationFormModel = new RegistrationFormModel();

            registrationFormModel.setFirstName(excelData[i][0]);
            registrationFormModel.setLastName(excelData[i][1]);
            registrationFormModel.setEmail(excelData[i][2]);
            registrationFormModel.setAge(excelData[i][3]);
            registrationFormModel.setSalary(excelData[i][4]);
            registrationFormModel.setDepartment(excelData[i][5]);

            dp[i][0] = registrationFormModel;
        }
        return dp;
    }





}
