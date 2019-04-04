package hellofx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.web.WebView;
import javafx.stage.Stage;


public class HelloFX extends Application {

    @Override
    public void start(Stage stage) {

        WebView web = new WebView();

        String userDir = System.getProperty("user.dir");
        Label l = new Label("user.dir: "  + userDir);
        Scene scene = new Scene(new StackPane(l), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}