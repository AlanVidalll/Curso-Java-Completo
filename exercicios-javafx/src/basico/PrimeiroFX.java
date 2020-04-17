package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PrimeiroFX extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button botaoA = new Button("Alan  ");
		Button botaoB = new Button("Bruna");
		Button botaoC = new Button("Carla ");

		botaoA.setOnAction(e -> System.out.println("A"));
		botaoB.setOnAction(e -> System.out.println("B"));
		botaoC.setOnAction(e -> System.exit(0));

		VBox box = new VBox();
		box.setAlignment(Pos.CENTER);
		box.setSpacing(10);
		box.getChildren().add(botaoA);
		box.getChildren().add(botaoB);
		box.getChildren().add(botaoC);

		Scene unicaCena = new Scene(box, 150, 200);

		primaryStage.setScene(unicaCena);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
