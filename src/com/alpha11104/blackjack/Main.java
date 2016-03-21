package com.alpha11104.blackjack;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("views/TableView.fxml"));
	
		Image image = new Image(Main.class.getResource("resources/jack_of_clubs2.png").toString());
		ImageView iv = new ImageView();
		iv.setImage(image);
		iv.setFitWidth(100);
        iv.setPreserveRatio(true);
        iv.setSmooth(true);
        
        Image image2 = new Image(Main.class.getResource("resources/queen_of_clubs2.png").toString());
		ImageView iv2 = new ImageView();
		iv2.setImage(image2);
		iv2.setFitWidth(100);
        iv2.setPreserveRatio(true);
        iv2.setSmooth(true);
        
        HBox hBox = new HBox(2);
        hBox.getChildren().add(iv);
        hBox.getChildren().add(iv2);
		
		try {
			BorderPane root = new BorderPane();
			AnchorPane tableView = (AnchorPane) loader.load();
			tableView.getChildren().add(hBox);
			root.setCenter(tableView);
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
