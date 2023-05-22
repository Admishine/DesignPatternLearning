package org.example;

public class DarkThemeGUIFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new DarkThemeButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new DarkThemeCheckbox();
    }
}