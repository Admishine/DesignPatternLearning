package org.example;

public class LightThemeGUIFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new LightThemeButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LightThemeCheckbox();
    }
}