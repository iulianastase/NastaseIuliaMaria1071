package Clase;

public class Crema extends Cosmetice{

	@Override
	void producere() {
		System.out.println("Se produce crema in laborator...");
	}

	@Override
	void vanzare() {
		System.out.println("Crema este plasata in farmacie si pusa spre vanzare...");
		
	}

}
