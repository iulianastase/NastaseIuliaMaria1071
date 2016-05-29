package Clase;
import java.util.ArrayList;
import java.util.List;

public class Reteta {
	List<Medicamente> medicamente=new ArrayList<Medicamente>();
	List<Pastile> pastile=new ArrayList<Pastile>();
	List<Sirop> sirop=new ArrayList<Sirop>();
	List<Ceai> ceai=new ArrayList<Ceai>();
	//inca 3 liste, si sa fac o metoda, medicamente pt afis nume si pret, in facade fac o met pt afis in care fac pt 
	//fiecare lista sa afis
	private String nrReteta;
	
	public void retineReteta(String nrReteta)
	{
		this.nrReteta=nrReteta;
	}
	public String getNrReteta()
	{
		return this.nrReteta;
	}
	public Memento salveazaStareaInMemento()
	{
		return new Memento(this.nrReteta);
	}
	public void getStareaDinMemento(Memento memento)
	{
		this.nrReteta=memento.getNrReteta();
	}
	public Reteta()
	{
		
	}
	public void adaugaMedicament(Medicamente medicament)
	{ 
		this.medicamente.add(medicament);
		if(medicament.getTip()==tipMedicament.Pastile)
			this.pastile.add((Pastile) medicament);
		else
			if(medicament.getTip()==tipMedicament.Ceai)
				this.ceai.add((Ceai) medicament);
			else 
				if(medicament.getTip()==tipMedicament.Sirop)
					this.sirop.add((Sirop) medicament);
	}
	public void eliminaMedicamente(Medicamente medicamente)
	{
		this.medicamente.remove( medicamente);
	}
	
	public float CalcularePret()
	{
		float suma=0;
		for(Medicamente m:medicamente)
		{
			suma+=m.getPret();
		}
		return suma;
	}
	public void plateste (ModPlata modPlata)
	{
		modPlata.plateste(CalcularePret());
	}
	
	public void afiseazaMedicamente(){
		for(Pastile p : this.pastile)
			System.out.println(p.toString());
		for(Ceai c : this.ceai)
			System.out.println(c.toString());
		for(Sirop s : this.sirop)
			System.out.println(s.toString());
	}
}
