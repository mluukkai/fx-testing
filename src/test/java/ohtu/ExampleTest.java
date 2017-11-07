package ohtu;

import static java.awt.Event.ENTER;
import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;
import org.junit.*;
import static org.testfx.api.FxAssert.verifyThat;
import org.testfx.framework.junit.ApplicationTest;
import static org.testfx.matcher.base.NodeMatchers.hasText;

public class ExampleTest extends ApplicationTest {

    private Stage stage;

    /*
    static {
        if (Boolean.getBoolean("SERVER")) {
            System.setProperty("testfx.robot", "glass");
            System.setProperty("testfx.headless", "true");
            System.setProperty("prism.order", "sw");
            System.setProperty("glass.platform", "Monocle");
            System.setProperty("monocle.platform", "Headless");
            System.setProperty("java.awt.headless", "false");
        }
    }
*/

    @Override
    public void start(Stage stage) throws Exception {
        Main sovellus = new Main();

        Application app = Application.class.cast(sovellus);
        app.start(stage);

        this.stage = stage;
    }

    @Test
    public void loytyyHalututElementit() {    

        TextField teksti = find("#vasen_teksti");
        teksti.setText("koe");
        
        
        clickOn("#nappi");
        verifyThat("#oikea_teksti", hasText("koe"));
    }
    
    public <T extends Node> T find(final String query) {
        /** TestFX provides many operations to retrieve elements from the loaded GUI. */
        return lookup(query).query();
    }
}
