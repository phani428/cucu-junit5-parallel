package com.fw;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommonSteps {
    private static Logger log = LoggerFactory.getLogger(CommonSteps.class);
    public CommonSteps(){

    }


    @And("I wait for {int} seconds")
    public void iWaitForSeconds(int seconds) {
        System.out.println("iWaitForSeconds");
    }

    @Given("I should be able to connect to CBB1 DB")
    public void iShouldBeAbleToConnectToDB_CBB1() {
        System.out.println("iShouldBeAbleToConnectToDB_CBB1");

    }

    @Given("I should be able to connect to CBB2 DB")
    public void iShouldBeAbleToConnectToDB_CBB2() {
        System.out.println("iShouldBeAbleToConnectToDB_CBB2");

    }

    @Given("I should be able to connect to Mongo DB")
    public void iShouldBeAbleToConnectToDB_Mongo() {
        System.out.println("iShouldBeAbleToConnectToDB_Mongo");

    }
}
