package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application{
	public void start(Stage primaryStage) {
		Group grp=new Group();
		Scene scene=new Scene(grp,600,600,Color.CORAL);
		scene.getStylesheets().add(StyleSheet);
	    primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	public static final String StyleSheet="StylerSheet.css";
	public static void main(String args[]) {
		launch(args);
	}
}
