package fxmll;

import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AppFXML extends Application{
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		String arquivoCSS = getClass().getResource("/fxmll/Login.css").toExternalForm();
		URL arquivoFXML = getClass().getResource("/fxmll/Login.fxml");
        GridPane rais = FXMLLoader.load(arquivoFXML);
		
		Scene cena = new Scene(rais,400,400);
		cena.getStylesheets().add(arquivoCSS);
	    
		primaryStage.setResizable(false);
		primaryStage.setTitle("Tela de Login");
		primaryStage.setScene(cena);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
