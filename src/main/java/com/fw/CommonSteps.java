package com.fw;

import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class CommonSteps {
    private static Scenario sc1;

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
    public void iShouldBeAbleToConnectToDB_Mongo() throws InterruptedException {

        for (int i=0;i<2;i++){
            Thread.sleep(1000);
            System.out.println("iShouldBeAbleToConnectToDB_Mongo:->i"+i+", Thread:"+Thread.currentThread().getName());
            sc1.log("iShouldBeAbleToConnectToDB_Mongo:->i"+i+", Thread:"+Thread.currentThread().getName());
        }

    }

    @Before
    public  void before_or_after_all(Scenario sc){
        this.sc1=sc;
    }
}
