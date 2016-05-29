package Teste;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import Clase.Medicamente;
import Clase.Pastile;
import Clase.Reteta;
import Clase.tipMedicament;

public class TestReteta {


	@Test
	public void existentaInRegistru(){
		ArrayList<String> registru=new ArrayList<String>();
		Assert.assertNotNull("Nu exista intrari in registru!", registru);

	}
	@Test
	public void nrReteta()
	{
		ArrayList<String> registru=new ArrayList<String>();
		registru.add("125B");
		
		Assert.assertEquals("125B", registru.get(0));
	}
	@Test
	public void adaugareinReteta()
	{
		Reteta reteta=new Reteta();
		Medicamente m=new Medicamente() {
		};
		reteta.adaugaMedicament(m);
		Assert.assertNotNull(reteta);
	}
	

}
