package Clase;

public class Farmacie {
	private static Farmacie farmacie;
	private String nume;
	
	public static Farmacie getFarmacie() {
		return farmacie;
	}


	public static void setFarmacie(Farmacie farmacie) {
		Farmacie.farmacie = farmacie;
	}


	public String getNume() {
		return nume;
	}


	public void setNume(String nume) {
		this.nume = nume;
	}


	private Farmacie ()
	{
	}
	

	public static Farmacie getInstance()
	{
		if(farmacie==null)
		{
			farmacie=new Farmacie();
		}
		return farmacie;
	}

}
