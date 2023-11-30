package all;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class AddApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("createmember.fxml"));
        primaryStage.setScene(new Scene(root));
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.show();
        Scene scene = new Scene(root); // rootNode - корневой узел вашей сцены
        scene.getStylesheets().add(getClass().getResource("styling.css").toExternalForm());



    }

    public static void main(String[] args) {
        launch(args);
    }
}