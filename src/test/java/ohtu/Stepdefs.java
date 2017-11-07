package ohtu;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import static org.junit.Assert.*;
import static org.testfx.api.FxAssert.verifyThat;
import org.testfx.framework.junit.ApplicationTest;
import static org.testfx.matcher.base.NodeMatchers.hasText;

public class Stepdefs extends ApplicationTest {
 
    @Given("^Text \"([^\"]*)\" is written to left textfield$")
    public void text_is_written_to_left_textfield(String text) throws Throwable {
        TextField teksti = find("#vasen_teksti");
        teksti.setText(text);
    }

    @When("^Button is clicker$")
    public void button_is_clicker() throws Throwable {
        clickOn("#nappi");
    }

    @Then("^Text \"([^\"]*)\" is copied to right textfield$")
    public void text_is_copied_to_right_textfield(String text) throws Throwable {
        verifyThat("#oikea_teksti", hasText(text));
    }    
    
    public <T extends Node> T find(final String query) {
        /** TestFX provides many operations to retrieve elements from the loaded GUI. */
        return lookup(query).query();
    }    
}