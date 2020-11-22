package dad.javafxml.calculadoraxml;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class CalculadoraController implements Initializable {

	private CalculadoraModel model = new CalculadoraModel();
	private Calculadora calculadora = new Calculadora();

	@FXML
	private GridPane view;

	@FXML
	private TextField datosText;

	public CalculadoraController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/CalculadoraView.fxml"));
		loader.setController(this);
		loader.load();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		model.datoProperty().bindBidirectional(datosText.textProperty());
	}

	@FXML
	void onBorrarButtonAction(ActionEvent event) {
		calculadora.borrar();
		model.setDato(calculadora.getPantalla());
	}

	@FXML
	void onBorrarTodoButtonAction(ActionEvent event) {
		calculadora.borrarTodo();
		model.setDato(calculadora.getPantalla());
	}

	@FXML
	void onCeroButtonAction(ActionEvent event) {
		calculadora.insertar('0');
		model.setDato(calculadora.getPantalla());
	}

	@FXML
	void onCincoButtonAction(ActionEvent event) {
		calculadora.insertar('5');
		model.setDato(calculadora.getPantalla());
	}

	@FXML
	void onComaButtonAction(ActionEvent event) {
		calculadora.insertarComa();
		model.setDato(calculadora.getPantalla());
	}

	@FXML
	void onCuatroButtonAction(ActionEvent event) {
		calculadora.insertar('4');
		model.setDato(calculadora.getPantalla());
	}

	@FXML
	void onDividirButtonAction(ActionEvent event) {
		calculadora.operar(Calculadora.DIVIDIR);
		model.setDato(calculadora.getPantalla());
	}

	@FXML
	void onDosButtonAction(ActionEvent event) {
		calculadora.insertar('2');
		model.setDato(calculadora.getPantalla());
	}

	@FXML
	void onIgualButtonAction(ActionEvent event) {
		calculadora.operar(Calculadora.IGUAL);
		model.setDato(calculadora.getPantalla());
	}

	@FXML
	void onMultiplicacionButtonAction(ActionEvent event) {
		calculadora.operar(Calculadora.MULTIPLICAR);
		model.setDato(calculadora.getPantalla());
	}

	@FXML
	void onNueveButtonAction(ActionEvent event) {
		calculadora.insertar('9');
		model.setDato(calculadora.getPantalla());
	}

	@FXML
	void onOchoButtonAction(ActionEvent event) {
		calculadora.insertar('8');
		model.setDato(calculadora.getPantalla());
	}

	@FXML
	void onRestaButtonAction(ActionEvent event) {
		calculadora.operar(Calculadora.RESTAR);
		model.setDato(calculadora.getPantalla());
	}

	@FXML
	void onSeisButtonAction(ActionEvent event) {
		calculadora.insertar('6');
		model.setDato(calculadora.getPantalla());
	}

	@FXML
	void onSieteButtonAction(ActionEvent event) {
		calculadora.insertar('7');
		model.setDato(calculadora.getPantalla());
	}

	@FXML
	void onSumaButtonAction(ActionEvent event) {
		calculadora.operar(Calculadora.SUMAR);
		model.setDato(calculadora.getPantalla());
	}

	@FXML
	void onTresButtonAction(ActionEvent event) {
		calculadora.insertar('3');
		model.setDato(calculadora.getPantalla());
	}

	@FXML
	void onUnoButtonAction(ActionEvent event) {
		calculadora.insertar('1');
		model.setDato(calculadora.getPantalla());
	}

	public GridPane getView() {
		return this.view;
	}
}
