package com.demoqa.pages.forms;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.clickJS;
import static utilities.JavaScriptUtility.scrollToElementJS;

public class PracticeFormPage extends FormsPage {

    private By femaleRadioButton = By.id("gender-radio-2");
    private By sporstHobbyCheckbox = By.id("hobbies-checkbox-1");
    private By readingHobbyCheckbox = By.id("hobbies-checkbox-2");
    private By musictHobbyCheckbox = By.id("hobbies-checkbox-3");
    private By submitButton = By.id("submit");

    public void clickFemaleRadioButton() {
        scrollToElementJS(femaleRadioButton);
        clickJS(femaleRadioButton);
    }

    public boolean isFemaleSelected() {
        return find(femaleRadioButton).isSelected();
    }

    public void clickReadingHobbyCheckbox() {
        if (!find(readingHobbyCheckbox).isSelected()) {
            scrollToElementJS(readingHobbyCheckbox);
            clickJS(readingHobbyCheckbox);
        }
    }

    public void clickSportsHobbyCheckbox() {
        if (!find(sporstHobbyCheckbox).isSelected()) {
            scrollToElementJS(sporstHobbyCheckbox);
            clickJS(sporstHobbyCheckbox);
        }
    }

    public void clickMusicHobbyCheckbox() {
        if (!find(musictHobbyCheckbox).isSelected()) {
            scrollToElementJS(musictHobbyCheckbox);
            clickJS(musictHobbyCheckbox);
        }
    }

    public void unclickReadingHobbyCheckbox() {
        if (find(readingHobbyCheckbox).isSelected()) {
            scrollToElementJS(readingHobbyCheckbox);
            clickJS(readingHobbyCheckbox);
        }
    }

    public boolean isReadingSelected() {
        return find(readingHobbyCheckbox).isSelected();
    }

    public void clickSubmitButton() {
        click(submitButton);
    }
}