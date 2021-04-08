package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application{
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getClass().getResource("/interfaces/Main.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}
//	public static final String StyleSheet="StylerSheet.css";
	public static void main(String args[]) {
		launch(args);
	}
}
