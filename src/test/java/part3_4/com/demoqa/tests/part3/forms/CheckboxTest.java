package part3_4.com.demo.qa.tests.part3.forms;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demo.qa.base.BaseTest;

public class CheckboxTest extends BaseTest {

    @Test
    public void testCheckbox() {
        var formsPage = homePage.goToForms().clickPracticeForm();
        formsPage.clickSportsHobbyCheckbox();
        formsPage.clickReadingHobbyCheckbox();
        formsPage.clickMusicHobbyCheckbox();
        formsPage.unclickReadingHobbyCheckbox();

        boolean isReadingCheckboxSelected =  formsPage.isReadingSelected();
        Assert.assertFalse(isReadingCheckboxSelected, "\n Reading Checkbox Is Selected \n");
    }
}
