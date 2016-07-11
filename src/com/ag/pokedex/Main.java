package com.ag.pokedex;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application{
	
	public static void main(String [] args){
		launch(args);
	}

	
	public void start(Stage primaryStage){
		
		menu(primaryStage);
		
		primaryStage.setTitle("Pokèdex");
		primaryStage.show();
	}
	
	public static void menu(Stage p){
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		
		addText(grid, "Pokèmon", 0, 0, 25);
		
		Scene firstChoice = new Scene(grid, 500, 500, Color.RED);
		p.setScene(firstChoice);		
	}
	
	public static void numInput(Stage p){
		
	}
	
	public static void nameInput(Stage p){
		
	}
	
	public static void addText(GridPane grid, String text, int col, int row){
		Text rules = new Text();
		rules.setText(text);
		grid.add(rules, col, row);
	}
	
	public static void addText(GridPane grid, String text, int col, int row, Color fill){
		Text rules = new Text();
		rules.setText(text);
		rules.setFill(fill);
		grid.add(rules, col, row);
	}
	
	public static void addText(GridPane grid, String text, int col, int row, int fontSize){
		Text rules = new Text();
		rules.setText(text);
		rules.setFont(new Font(fontSize));
		grid.add(rules, col, row);
	}
	
	public static void addText(GridPane grid, String text, int col, int row, int fontSize, Color fill){
		Text rules = new Text();
		rules.setText(text);
		rules.setFont(new Font(fontSize));
		rules.setFill(fill);
		grid.add(rules, col, row);
	}
	
}
