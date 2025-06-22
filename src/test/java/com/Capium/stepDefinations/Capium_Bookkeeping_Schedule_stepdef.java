package com.Capium.stepDefinations;

import com.Capium.Actions.Capium_Bookkeeping_Schedule_Actions;
import com.Capium.Utilies.Log;
import com.Capium.Utilies.StepTracker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Capium_Bookkeeping_Schedule_stepdef {

    Capium_Bookkeeping_Schedule_Actions scheduleactions = new Capium_Bookkeeping_Schedule_Actions();

    @Given("Validate schedule")
    public void validate_schedule() throws InterruptedException {
        scheduleactions.Validateschedule();
        StepTracker.setCurrentStep("Validate schedule");
        Log.info("Sucecssfully Validated schedule");
    }

    @Then("Validate minutes of meetings")
    public void validate_minutes_of_meetings() {
        System.out.println("Validated Minutes of meeting");
        StepTracker.setCurrentStep("Validate minutes of meetings");
        Log.info(" Successfully Validated minutes of meetings");
    }

    @Then("Validate Notes")
    public void validate_notes() throws InterruptedException {
        scheduleactions.ValidateAddNote();
        StepTracker.setCurrentStep("Validate Notes");
        Log.info("Successfully Validated Notes");
    }
}
