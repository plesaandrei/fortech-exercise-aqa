package fortech.exercise.aqa.tests;

import fortech.exercise.aqa.models.RegistrationFormModel;
import fortech.exercise.aqa.pages.*;
import org.testng.annotations.Test;


public class TestItems extends BaseTest{

    @Test
    public void testItemsElements() {

        driver.get("https://demoqa.com");

        HomeCategoriesPage homeCategoriesPage = new HomeCategoriesPage(driver);
        homeCategoriesPage.getElementsElement().click();

        ItemsElementsPage itemsElementsPage = new ItemsElementsPage(driver);

        itemsElementsPage.getTextBoxElement().click();
        itemsElementsPage.getCheckBoxElement().click();
        itemsElementsPage.getRadioButtonElement().click();
        itemsElementsPage.getWebTablesElement().click();
        itemsElementsPage.getButtonsElement().click();
        itemsElementsPage.getLinksElement().click();
        itemsElementsPage.getBrokenLinksElement();
        itemsElementsPage.getUploadDownloadElement().click();
        itemsElementsPage.getDynamicPropertiesElement().click();
    }

    @Test
    public void testForms() {

        driver.get("https://demoqa.com");

        HomeCategoriesPage homeCategoriesPage = new HomeCategoriesPage(driver);
        homeCategoriesPage.getFormsElement().click();

        ItemsFormsPage itemsFormsPage = new ItemsFormsPage(driver);

        itemsFormsPage.getPracticeFormElement().click();
    }

    @Test
    public void testItemsAlertsFrameWindows() {

        driver.get("https://demoqa.com");

        HomeCategoriesPage homeCategoriesPage = new HomeCategoriesPage(driver);
        homeCategoriesPage.getAlertsFrameWindowsElement().click();

        ItemsAlertsFrameWindowsPage itemsAlertsFrameWindowsPage = new ItemsAlertsFrameWindowsPage(driver);

        itemsAlertsFrameWindowsPage.getBrowserWindowElement().click();
        itemsAlertsFrameWindowsPage.getAlertsElement().click();
        itemsAlertsFrameWindowsPage.getFramesElement().click();
        itemsAlertsFrameWindowsPage.getNestedFramesElement().click();
        itemsAlertsFrameWindowsPage.getModalDialogsElement().click();
    }

    @Test
    public void testItemsWidgets() {

        driver.get("https://demoqa.com");

        HomeCategoriesPage homeCategoriesPage = new HomeCategoriesPage(driver);
        homeCategoriesPage.getWidgetsElement().click();

        ItemsWidgetsPage itemsWidgetsPage = new ItemsWidgetsPage(driver);

        itemsWidgetsPage.getAccordianElement().click();
        itemsWidgetsPage.getAutoCompleteElement().click();
        itemsWidgetsPage.getDatePickerElement().click();
        itemsWidgetsPage.getSliderElement().click();
        itemsWidgetsPage.getProgressBarElement().click();
        itemsWidgetsPage.getTabsElement().click();
        itemsWidgetsPage.getToolTipsElement().click();
        itemsWidgetsPage.getMenuElement().click();
        itemsWidgetsPage.getSelectMenuElement().click();
    }

    @Test
    public void testInteractions() {

        driver.get("https://demoqa.com");

        HomeCategoriesPage homeCategoriesPage = new HomeCategoriesPage(driver);
        homeCategoriesPage.getInteractionsElement().click();

        ItemsInteractionsPage itemsInteractionsPage = new ItemsInteractionsPage(driver);

        itemsInteractionsPage.getSortableElement().click();
        itemsInteractionsPage.getSelectableElement().click();
        itemsInteractionsPage.getResizableElement().click();
        itemsInteractionsPage.getDroppableElement().click();
        itemsInteractionsPage.getDragabbleElement().click();
    }

    @Test
    public void testBookStoreApplication() {

        driver.get("https://demoqa.com");

        HomeCategoriesPage homeCategoriesPage = new HomeCategoriesPage(driver);
        homeCategoriesPage.getBookStoreApplicationElement().click();

        ItemsBookStorePage itemsBookStorePage = new ItemsBookStorePage(driver);

        itemsBookStorePage.getLoginElement().click();
        itemsBookStorePage.getBookStoreElement().click();
        itemsBookStorePage.getProfileElement().click();
        itemsBookStorePage.getBookStoreApiElement().click();
    }

}
