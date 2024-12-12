package deng.michelle;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;

public class GUIDriver extends Application {
	
	Die d1 = new Die();
	Die d2 = new Die();
	
	@Override
	public void start(Stage stage) throws Exception {
		VBox vbox = new VBox(10);
		
		// Create and display the title
		Label title = new Label("Shut The Box");
		vbox.getChildren().add(title);
		
		HBox tileBox = new HBox(10);
		
		// Create and display tiles
		Button[] tileBtns = new Button[9];
		Tile[] tiles = new Tile[9];
		vbox.getChildren().add(tileBox);
		tileBox.setAlignment(Pos.CENTER);
		
		// Create and display dice roll and results
		Button btnRoll = new Button("ROLL DICES");
		Label result = new Label("Result");
		Label lblValue = new Label(); // output of results
		Label lblValue2 = new Label(); 
		vbox.getChildren().addAll(btnRoll,result,lblValue,lblValue2);
		vbox.setAlignment(Pos.CENTER);
		
		Button lockIn = new Button("Lock in");
		vbox.getChildren().add(lockIn);
		lockIn.setAlignment(Pos.CENTER);
		
		for (int i=0; i<tileBtns.length; i++) {
			tileBtns[i] = new Button(String.valueOf(i+1));
			tiles[i] = new Tile(i+1);
			tileBox.getChildren().add(tileBtns[i]);
		}
		
		for(Button b: tileBtns) {
			b.setOnAction(e -> {
				b.setStyle("-fx-background-color:#bab0a6");
				if (b.equals(lblValue)) {
					
				}
				
			});
			
		}
		
		btnRoll.setOnAction(e -> {
			int roll1 = d1.roll();
			int roll2 = d2.roll();
			int sum = roll1 + roll2;
			lblValue.setText(String.valueOf(sum));
			lblValue2.setText("Dice one: " + roll1 + "  " + "Dice two: " + roll2);
		});
		
		
		Scene scene = new Scene(vbox,500,300);
		stage.setScene(scene);
		
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
