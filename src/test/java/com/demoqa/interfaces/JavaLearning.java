package com.demoqa.interfaces;

import com.demoqa.elemets.Button;
import com.demoqa.steps.Step;

public class JavaLearning {
    public static void main(String[] args) {

        Button add = new Button("Add");
        Button ok = new Button("Ok");

        Step log = new Step();
        log.logClick("Нажимаем кнопку", add);
        log.logClick("Нажимаем кнопку", ok);


        log.logClick("Нажимаем кнопку", () -> {
            Button cancel = new Button("Cancel");
            cancel.click();
        });

        log.logClick("Нажимаем кнопку", () -> {
            System.out.println("BlahBlahBlah");
        });
    }


}
