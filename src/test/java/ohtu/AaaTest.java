package ohtu;

import javafx.application.Application;
import javafx.stage.Stage;
import org.junit.*;
import org.testfx.framework.junit.ApplicationTest;

public class AaaTest extends ApplicationTest {

    @Override
    public void start(Stage stage) throws Exception {
        Main sovellus = new Main();

        Application app = Application.class.cast(sovellus);
        app.start(stage);
    }

    @Test
    public void dummyTest() {    
    } 
}
