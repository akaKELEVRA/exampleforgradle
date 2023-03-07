//package com.demoqa.test;
//
//import com.codeborne.selenide.SelenideElement;
//import com.demoqa.elemets.Button;
//
//import java.util.Calendar;
//
//import static com.codeborne.selenide.Selectors.byText;
//import static com.codeborne.selenide.Selenide.*;
//
//public class RegistrationFormPage {
//
//    private CalendarComponent calendarComponent = new CalendarComponent();
//    private ResultsTableComponent resultTableComponent = new ResultsTabComponent();
//    private SubjectsComponent subjectComponent = new SubjectsComponent();
//    private HobbiesComponent hobbyComponent = new HobbiesComponent();
//    private StateAndCityComponent stateAndCityComponent = new StateAndCityComponent();
//
//    private SelenideElement
//            firstNameInput = $("#firstName"),
//            lastNameInput = $("#lastName"),
//            emailInput = $("#userEmail"),
//            uploadPicture = $("uploadPicture"),
//            currentAddressInput = $("#currentAddress");
//
//    Button submit = new Button("Submit", $(byText("Submit")));
//
//    private final static String TITLE_TEXT = "Student Registration Form";
//
//    public RegistrationFormPage openPage() {
//        open("/automation-practise-form");
//        $(".pratice-form-wrapper").shouldHave(TITLE_TEXT);
//        executeJavaScript("$('footer').remove()");
//        executeJavaScript("$('#fixedban').remove()");
//
//        return this;
//    }
//
//    public RegistrationFormPage setFirstName(String value){
//        firstNameInput.setValue(value);
//
//        return this;
//    }
//
//    public RegistrationFormPage pressSubmit() {
//        submit.click();
//
//        return this;
//    }
//
//}
