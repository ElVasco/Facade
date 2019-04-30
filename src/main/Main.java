package main;

import facade.VentanaAlertaFacade;

public class Main {

	public static void main(String[] args) {
		VentanaAlertaFacade ventanaAlertaFacade = new VentanaAlertaFacade();
		ventanaAlertaFacade.mostrarVentanaDeAlerta("memoria insuficiente");
	}

}
