package org.example;

public class Client {
    public static void main(String[] args) {
        // 根据用户选择的主题创建相应的 GUIFactory
        GUIFactory factory;
        String theme = "LightTheme"; // 可以从配置文件或用户设置中读取主题
        if (theme.equals("LightTheme")) {
            factory = new LightThemeGUIFactory();
        } else if (theme.equals("DarkTheme")) {
            factory = new DarkThemeGUIFactory();
        } else {
            throw new IllegalArgumentException("Invalid theme: " + theme);
        }

        // 使用抽象工厂创建组件
        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        // 渲染组件
        button.render();
        checkbox.render();
    }
}
