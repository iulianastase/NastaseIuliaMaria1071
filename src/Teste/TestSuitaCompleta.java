package Teste;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	TestAngajati.class,
	TestMedicamente.class,
	TestReteta.class,
	TestPlata.class
})

public class TestSuitaCompleta {


}
