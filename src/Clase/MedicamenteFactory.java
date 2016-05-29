package Clase;

public class MedicamenteFactory {
	public Medicamente creareMedicament(tipMedicament tip, String denumire, double pret)
	{
		switch(tip)
		{
		case Pastile:
			return new Pastile.Builder(denumire,pret).build();
		case Sirop:
			return new Sirop(denumire,pret);
		case Ceai:
			return new Ceai(denumire,pret);
		}
		return null;
	}

}
