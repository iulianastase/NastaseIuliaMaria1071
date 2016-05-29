package Clase;

public class Cash implements ModPlata{
	String nume;
	String prenume;

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

	public Cash(String nume, String prenume) {
		super();
		this.nume = nume;
		this.prenume = prenume;
	}

	@Override
	public void plateste(double suma) {
	System.out.println(nume+" "+prenume+" achita cash suma de "+suma);
		
	}

}
