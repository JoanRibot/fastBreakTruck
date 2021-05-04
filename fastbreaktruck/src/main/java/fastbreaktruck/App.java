package fastbreaktruck;

import fastbreaktruck.bahaviour.FastBreakTruck;
import fastbreaktruck.domain.Desayuno;
 

public class App {

	public static void main(String[] args) {

		/**
		 * Desayuno Eyeholes
		 */

		Desayuno eyeDes = FastBreakTruck.prepararEyeHoles();
		System.out.println("\nNo abras la caja de Eyeholes!");
		eyeDes.mostrarItem();
		System.out.print("Precio pedido: " + eyeDes.getCoste());

		/**
		 * Desayuno Smiggles
		 */
		
		Desayuno smigDes = FastBreakTruck.prepararSmiggles();
		System.out.println("\nSmiggles per als nins!");
		smigDes.mostrarItem();
		System.out.print("Precio pedido: " + smigDes.getCoste());

		/**
		 * Plumbus
		 */

		eyeDes = FastBreakTruck.prepararEyeHoles();
		// FastBreakTruck.incluirJuguete(eyeDes);
		System.out.println("\nEyeholes con plumbus!");
		eyeDes.mostrarItem();
		System.out.print("Precio pedido: " + eyeDes.getCoste());
	}
}