package com.demoqa.elemets;

import com.codeborne.selenide.SelenideElement;
import com.demoqa.interfaces.Clickable;
import io.qameta.allure.Step;

public class Button implements Clickable {

    private final String name;


    public Button(String name) {
        this.name = name;
    }

    @Override
    public void click() {
        System.out.println("нажать кнопку " + name);
    }
}
