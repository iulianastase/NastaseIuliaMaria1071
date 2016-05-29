package Clase;
import java.util.ArrayList;
import java.util.List;

public class Angajati {
	private String nume;
	private String pozitie;
	private int salariu;
	private List<Angajati> subordonati=new ArrayList<Angajati>();
	
	
	public Angajati(String nume, String pozitie, int salariu) {
		super();
		this.nume = nume;
		this.pozitie=pozitie;
		this.salariu = salariu;
	}


	public int getSalariu() {
		return salariu;
	}


	public String getNume() {
		return nume;
	}
	
	public List<Angajati> getSubordonati() {
		return subordonati;
	}


	public List<Angajati> adaugareSubordonat(Angajati a)
	{
		if(this.subordonati==null)
			this.subordonati=new ArrayList<Angajati>();
		this.subordonati.add(a);
		return this.subordonati;
	}
	
	public List<Angajati> eliminareSubordonati(Angajati a)
	{
		if(this.subordonati==null)
			System.out.println("Nu exista angajati in lista");
		this.subordonati.remove(a);
		return this.subordonati;
	}


	@Override
	public String toString() {
		return "\n Angajati nume: " + nume + ", pozitie: " + pozitie + "\n subordonati="
				+ subordonati + "";
	}



	
	
	

}
