package ohtu;

import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
 
 
public class Main extends Application {
     
    @Override
    public void start(Stage ikkuna){
        TextField vasenTeksti = new TextField();
        vasenTeksti.setId("vasen_teksti");
        TextField oikeaTeksti = new TextField();
        oikeaTeksti.setId("oikea_teksti");
        Button nappi = new Button("Kopioi");
        nappi.setId("nappi");
        
        nappi.setOnAction((event) -> {
            oikeaTeksti.setText(vasenTeksti.getText());
        });

        HBox komponenttiryhma = new HBox();
        komponenttiryhma.setSpacing(20);
        komponenttiryhma.getChildren().addAll(vasenTeksti, nappi, oikeaTeksti);

        Scene nakyma = new Scene(komponenttiryhma);

        ikkuna.setScene(nakyma);
        ikkuna.show();
    }

    public static void main(String[] args) {
        launch(Main.class);
    }
 
}