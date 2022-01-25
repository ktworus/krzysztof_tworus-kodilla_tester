package dividing;

import io.cucumber.java8.En;
import org.junit.Assert;

public class DividingSteps implements En {
    private int number;
    private String result;

    public DividingSteps(){
        Given("number is {int}", (Integer int1) -> {
            // Write code here that turns the phrase above into concrete actions
            this.number=int1;
        });
        Then("The result is {string}", (String string) -> {
            // Write code here that turns the phrase above into concrete actions
            Assert.assertEquals(string, this.result);
        });

        When("Is it dividable by 3 or 5", () ->{
            Dividing dividing = new Dividing();
            this.result = dividing.moduloCheck(this.number);
        });


    }
}
