package ohtu;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.junit.*;
import static org.testfx.api.FxAssert.verifyThat;
import org.testfx.framework.junit.ApplicationTest;
import static org.testfx.matcher.base.NodeMatchers.hasText;

public class DummyTest extends ApplicationTest {

    private Stage stage;

    @Override
    public void start(Stage stage) throws Exception {
        Main sovellus = new Main();

        Application app = Application.class.cast(sovellus);
        app.start(stage);

        this.stage = stage;
        System.out.println("xxxx");
    }

    @Test
    public void dummyTest() {    
    }
    
    public <T extends Node> T find(final String query) {
        /** TestFX provides many operations to retrieve elements from the loaded GUI. */
        return lookup(query).query();
    }
}
