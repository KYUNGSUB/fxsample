package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("scenebuilder/root.fxml"));
		Scene scene = new Scene(root);
		
		primaryStage.setTitle("AppMain");
		primaryStage.setScene(scene);
		primaryStage.setOnCloseRequest(event -> System.exit(0));
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}