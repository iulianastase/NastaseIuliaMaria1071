package Teste;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import Clase.Card;
import Clase.Cash;
import Clase.Pastile;
import Clase.Reteta;

public class TestPlata {

	@Test
	public void testCard() {
		Card card=new Card("Ionescu","Andrei","123B","12/19");
		Assert.assertNotEquals("123C", "123B");
	}
	@Test
	public void testCash()
	{
		Cash cash=new Cash("Popescu","Andreea");
		Assert.assertNotNull(cash.getNume());
	}
	@Test
	public void testPlata()
	{
		Cash cash=new Cash("Popescu","Andreea");
		Reteta reteta=new Reteta();
		Pastile pastile=new Pastile.Builder("Paracetamol",12 ).build();
		reteta.adaugaMedicament(pastile);
		
		Assert.assertNotNull(reteta);
		reteta.plateste(cash);
		
	}

}
