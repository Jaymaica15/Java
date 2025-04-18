package ui;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;


public class HelloWorldFX extends Application {
	
	private TextArea outputArea;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) {
			VBox layout = new VBox(20);
			layout.setPadding(new Insets(20));
			
			Button helloWorld = new Button("Press here.");
			
	        outputArea = new TextArea();
	        outputArea.setEditable(false);
	        outputArea.setPrefHeight(1000);
			
			layout.getChildren().addAll(helloWorld, outputArea);
			
			helloWorld.setOnAction(_ -> textHello());
			
			Scene scene = new Scene(layout, 600, 400);
			scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
	}
	
	public void textHello() {
		String hello = new String("Hello World!");
		outputArea.setText(hello);
	}
	
}
