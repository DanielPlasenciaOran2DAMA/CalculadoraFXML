package dad.javafxml.calculadoraxml;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

	private CalculadoraController controller;

	public void start(Stage primaryStage) throws Exception {
		controller = new CalculadoraController();

		Scene scene = new Scene(controller.getView(), 350, 280);
		primaryStage.setTitle("Calculadora");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
