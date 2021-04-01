package me.moeux.vtclient;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        WebView webView = new WebView();

        webView.getEngine().load("https://www.virustotal.com/gui/home/upload");

        root.setCenter(webView);

        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.getIcons().add(new Image("logo.png"));
        primaryStage.setResizable(true);
        primaryStage.setTitle("VirusTotal");
        primaryStage.show();
    }
}
