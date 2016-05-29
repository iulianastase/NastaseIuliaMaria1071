package Clase;

public class Ceai extends Medicamente{

	public Ceai(String denumire, double pret) {
		super();
		this.denumire = denumire;
		this.pret=pret;
		this.tip=tipMedicament.Ceai;
	}
	
	@Override
	public String toString() {
		return "Ceai -> denumire=" + denumire+" pretul este de "+pret ;
	}


}
