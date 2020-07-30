package com.itstep.lesson.steps.version2;

import io.cucumber.java.en.When;

public class StepsVersion2 {

    @When("user clicks to {string} button")
    @When("user click to {string} button")
    public void userClicksToAddToCartButton(String buttonName) {
        System.out.println("User clicks to " + buttonName + " button");
    }

}
