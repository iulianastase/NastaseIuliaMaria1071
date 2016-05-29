package Teste;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import Clase.Angajati;

public class TestAngajati {

	@Test
	public void testSubordonati() {
		Angajati manager=new Angajati("Lazar Iulia","Manager",3000);
		Angajati farmacist=new Angajati("Stefanescu Mirela","Farmacist Sef",2500);
		Angajati asFarmacist1=new Angajati("Alexandrescu Victor","Asistent Farmacist",2000);
		Angajati asFarmacist2=new Angajati("Manescu Andreea","Asistent Farmacist",2000);
		Angajati asFarmacist3=new Angajati("Ungureanu Mihaela","Asistent Farmacist",2000);
		Angajati paznic=new Angajati("Bujor Paul","Paznic",1500);
		Angajati ingrijitor=new Angajati("Cotenescu Silviu","Ingrijitor",1500);
		
		Assert.assertNotNull(manager.getSubordonati());

	}
	@Test
	public void testNume()
	{
		Angajati manager=new Angajati("Lazar Iulia","Manager",3000);
		Assert.assertEquals("Lazar Iulia",manager.getNume());
	}
	@Test
	public void testSalariu()
	{
		Angajati farmacist=new Angajati("Stefanescu Mirela","Farmacist Sef",2500);
		Angajati asFarmacist1=new Angajati("Alexandrescu Victor","Asistent Farmacist",2000);
		Angajati asFarmacist2=new Angajati("Manescu Andreea","Asistent Farmacist",2000);
		Angajati asFarmacist3=new Angajati("Ungureanu Mihaela","Asistent Farmacist",2000);
		
		Assert.assertNotEquals(0,farmacist.getSalariu());
	}

}
