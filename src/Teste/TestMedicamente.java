package Teste;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import Clase.Ceai;
import Clase.MedicamenteFactory;
import Clase.Pastile;
import Clase.Sirop;

public class TestMedicamente {

	@Test
	public void test() {
		Pastile pastile=new Pastile.Builder("Nurofen",18).build();
		Assert.assertNotNull(pastile.getPret());
	}

}
