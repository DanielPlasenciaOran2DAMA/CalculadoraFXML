package dad.javafxml.calculadoraxml;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class CalculadoraController {

	private CalculadoraModel model = new CalculadoraModel();
	private Calculadora calculadora = new Calculadora();

	@FXML
	private GridPane view;

	@FXML
	private TextField datosText;

	public CalculadoraController() throws IOException {
		FXMLLoader vistaXML = new FXMLLoader(getClass().getResource("/fxml/CalculadoraView.fxml"));
		vistaXML.setController(this);
		vistaXML.load();

		model.datoProperty().bindBidirectional(datosText.textProperty());
	}

	@FXML
	public void onCeroButtonAction(ActionEvent e) {
		calculadora.insertar('0');
		model.setDato(calculadora.getPantalla());
	}

	@FXML
	public void onUnoButtonAction(ActionEvent e) {
		calculadora.insertar('1');
		model.setDato(calculadora.getPantalla());
	}

	@FXML
	public void onDosButtonAction(ActionEvent e) {
		calculadora.insertar('2');
		model.setDato(calculadora.getPantalla());
	}

	@FXML
	public void onTresButtonAction(ActionEvent e) {
		calculadora.insertar('3');
		model.setDato(calculadora.getPantalla());
	}

	@FXML
	public void onCuatroButtonAction(ActionEvent e) {
		calculadora.insertar('4');
		model.setDato(calculadora.getPantalla());
	}

	@FXML
	public void onCincoButtonAction(ActionEvent e) {
		calculadora.insertar('5');
		model.setDato(calculadora.getPantalla());
	}

	@FXML
	public void onSeisButtonAction(ActionEvent e) {
		calculadora.insertar('6');
		model.setDato(calculadora.getPantalla());
	}

	@FXML
	public void onSieteButtonAction(ActionEvent e) {
		calculadora.insertar('7');
		model.setDato(calculadora.getPantalla());
	}

	@FXML
	public void onOchoButtonAction(ActionEvent e) {
		calculadora.insertar('8');
		model.setDato(calculadora.getPantalla());
	}

	@FXML
	public void onNueveButtonAction(ActionEvent e) {
		calculadora.insertar('9');
		model.setDato(calculadora.getPantalla());
	}

	@FXML
	public void onComaButtonAction(ActionEvent e) {
		calculadora.insertarComa();
		model.setDato(calculadora.getPantalla());
	}

	@FXML
	public void onSumaButtonAction(ActionEvent e) {
		calculadora.operar(calculadora.SUMAR);
		model.setDato(calculadora.getPantalla());
	}

	@FXML
	public void onRestaButtonAction(ActionEvent e) {
		calculadora.operar(calculadora.RESTAR);
		model.setDato(calculadora.getPantalla());
	}

	@FXML
	public void onMultiplicacionButtonAction(ActionEvent e) {
		calculadora.operar(calculadora.MULTIPLICAR);
		model.setDato(calculadora.getPantalla());
	}

	@FXML
	public void onDividirButtonAction(ActionEvent e) {
		calculadora.operar(calculadora.DIVIDIR);
		model.setDato(calculadora.getPantalla());
	}

	@FXML
	public void onIgualButtonAction(ActionEvent e) {
		calculadora.operar(calculadora.IGUAL);
		model.setDato(calculadora.getPantalla());
	}

	@FXML
	public void onBorrarButtonAction(ActionEvent e) {
		calculadora.borrar();
		model.setDato(calculadora.getPantalla());
	}

	@FXML
	public void onBorrarTodoButtonAction(ActionEvent e) {
		calculadora.borrarTodo();
		model.setDato(calculadora.getPantalla());
	}

	public GridPane getView() {
		return this.view;
	}
}
