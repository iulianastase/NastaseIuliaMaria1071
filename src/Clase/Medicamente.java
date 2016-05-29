package Clase;

public abstract class Medicamente {
	protected String denumire;
	protected double pret;
	protected tipMedicament tip;
	

	public double getPret() {
		return pret;
	}

	public void setPret(double pret) {
		this.pret = pret;
	}

	public Medicamente(String denumire, double pret, tipMedicament tip) {
		super();
		this.denumire = denumire;
		this.pret = pret;
		this.tip = tip;
	}
	public Medicamente()
	{
		
	}

	public String getDenumire() {
		return denumire;
	}

	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}

	public tipMedicament getTip() {
		return tip;
	}

	public void setTip(tipMedicament tip) {
		this.tip = tip;
	}


	

}
