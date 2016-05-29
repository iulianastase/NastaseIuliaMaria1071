package Clase;

public class Card implements ModPlata {
	String nume;
	String prenume;
	String nrCard;
	String dataExpirare;

	@Override
	public void plateste(double suma) {
		System.out.println(nume+" "+prenume+" plateste cu cardul numarul "+nrCard+" care expira la data de "+dataExpirare+" suma de "+suma);
		
	}

	public Card(String nume, String prenume, String nrCard, String dataExpirare) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.nrCard = nrCard;
		this.dataExpirare = dataExpirare;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public String getNrCard() {
		return nrCard;
	}

	public void setNrCard(String nrCard) {
		this.nrCard = nrCard;
	}

	public String getDataExpirare() {
		return dataExpirare;
	}

	public void setDataExpirare(String dataExpirare) {
		this.dataExpirare = dataExpirare;
	}

	
}
