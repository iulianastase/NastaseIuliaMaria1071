package Clase;

public class Pastile extends Medicamente {
	private boolean redus;

	public Pastile()
	{
		this.tip=tipMedicament.Pastile;
	}
	
	
	
	public static class Builder
	{
		Pastile p=new Pastile(); 
		
		public Builder(String denumire,double pret)
		{
			p.denumire=denumire;
			p.pret=pret;
		}
		
		public Builder esteRedus()
		{
			p.redus=true;
			return this;
		}
		
		public Pastile build()
		{
			if(p.redus==true)
			{
				System.out.println(" --- Medicamentul "+p.denumire+" este redus");
				return p;
				
			}
			else
			return p;
		}
		
		
	} 

	@Override
	public String toString() {
		return "Pastile -> denumire=" + denumire+" pretul este de "+pret ;
	}



}
