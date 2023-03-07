package com.demoqa.steps;

import com.demoqa.interfaces.Clickable;

public class Step {

    public void logClick (String message, Clickable clickable) {
        System.out.println(message);
        clickable.click();
    }
}
