package Clase;

public class Sirop extends Medicamente{

	@Override
	public String toString() {
		return "Sirop -> denumire=" + denumire+" pretul este de "+pret;
	}

	public Sirop(String denumire,double pret) {
		super();
		this.denumire = denumire;
		this.pret=pret;
		this.tip=tipMedicament.Sirop;
	}




}
