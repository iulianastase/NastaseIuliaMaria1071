package Clase;

public class Parfum extends Cosmetice{

	@Override
	void producere() {
		System.out.println("Se prodeuce parfumul in laborator...");
		
	}

	@Override
	void vanzare() {
		System.out.println("Parfumul este plasata in farmacie si pusa spre vanzare...");
		
	}

}
