package facade;

import ventanas.GeneradorHistorialVentanas;
import ventanas.GeneradorSonidos;
import ventanas.GeneradorVenetanas;

public class VentanaAlertaFacade {

	public void mostrarVentanaDeAlerta(String alerta) {
		//desde aqui me preocupo de conocer y usar otro conjunto 
		//de subsistemas para dar una funcionalidad comun
		
		GeneradorVenetanas generadoVentanas = new GeneradorVenetanas();
		GeneradorSonidos generadorSonidos = new GeneradorSonidos();
		GeneradorHistorialVentanas generadorHistorialVentanas = new GeneradorHistorialVentanas();
		
		
		generadoVentanas.generarVentana(alerta);
		generadorSonidos.generarSonidoAlerta();
		generadorHistorialVentanas.agregarAccionHistorial("Mostrar ventana de alerta: "+alerta);
		
	}
}
