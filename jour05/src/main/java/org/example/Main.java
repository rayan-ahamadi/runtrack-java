package org.example;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class Main  extends Application {
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Ma fenêtre JavaFX");

        Button quitButton = new Button("Quitter");
        quitButton.setOnAction(e -> primaryStage.close());

        BorderPane root = new BorderPane();

        HBox bottomBox = new HBox(10);
        bottomBox.setAlignment(Pos.CENTER);
        bottomBox.getChildren().add(quitButton);
        root.setBottom(bottomBox);


        Scene scene = new Scene(root, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }


}