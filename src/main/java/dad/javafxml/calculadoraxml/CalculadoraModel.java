package dad.javafxml.calculadoraxml;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class CalculadoraModel {

	private StringProperty dato = new SimpleStringProperty();

	public final StringProperty datoProperty() {
		return this.dato;
	}

	public final String getDato() {
		return this.datoProperty().get();
	}

	public final void setDato(final String dato) {
		this.datoProperty().set(dato);
	}

}
