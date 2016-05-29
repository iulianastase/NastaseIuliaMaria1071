package Clase;

public class Main {

	public static void main(String[] args) {
		//SINGLETON
		System.out.println("SINGLETON");
		Farmacie farmacie= Farmacie.getInstance();
		farmacie.setNume("PHARMA");
		System.out.println("Denumirea farmaciei -> "+farmacie.getNume());
		
		//BUILDER
		System.out.println("\n\nBUILDER");
		Pastile p=new Pastile.Builder("Algocalmin", 13)
				.esteRedus() 
				.build();
		
		//SIMPLE FACTORY
		System.out.println("\n\nSIMPLE FACTORY");
		MedicamenteFactory medicamente=new MedicamenteFactory();
		Pastile pastile=(Pastile)medicamente.creareMedicament(tipMedicament.Pastile,"Paracetamol",12);
		Sirop sirop=(Sirop)medicamente.creareMedicament(tipMedicament.Sirop, "Tusin",23);
		Ceai ceai=(Ceai)medicamente.creareMedicament(tipMedicament.Ceai, "Tei",7);
		
		System.out.println(p.toString());
		System.out.println(pastile.toString());
		System.out.println(sirop.toString());
		System.out.println(ceai.toString());
		
		if(pastile.pret!=0)
			System.out.println(pastile.toString());
		
		//STRATEGY
		System.out.println("\n\nSTRATEGY");
		Reteta reteta=new Reteta();
		reteta.adaugaMedicament(pastile);
		reteta.adaugaMedicament(sirop);
		
		Reteta reteta2=new Reteta();
		reteta2.adaugaMedicament(pastile);
		reteta2.adaugaMedicament(ceai);
		reteta2.adaugaMedicament(sirop);
		reteta2.eliminaMedicamente(sirop);
		
		Cash cash=new Cash("Popescu","Andreea");
		Card card=new Card("Ionescu","Andrei","123B","12/19");
		reteta.plateste(cash);
		reteta2.plateste(card);
		
		//Composite
		System.out.println("\n\nCOMPOSITE");
		Angajati manager=new Angajati("Lazar Iulia","Manager",3000);
		Angajati farmacist=new Angajati("Stefanescu Mirela","Farmacist Sef",2500);
		Angajati asFarmacist1=new Angajati("Alexandrescu Victor","Asistent Farmacist",2000);
		Angajati asFarmacist2=new Angajati("Manescu Andreea","Asistent Farmacist",2000);
		Angajati asFarmacist3=new Angajati("Ungureanu Mihaela","Asistent Farmacist",2000);
		Angajati paznic=new Angajati("Bujor Paul","Paznic",1500);
		Angajati ingrijitor=new Angajati("Cotenescu Silviu","Ingrijitor",1500);
		
		manager.adaugareSubordonat(farmacist);
		manager.adaugareSubordonat(paznic);
		manager.adaugareSubordonat(ingrijitor);
		farmacist.adaugareSubordonat(asFarmacist1);
		farmacist.adaugareSubordonat(asFarmacist2);
		farmacist.adaugareSubordonat(asFarmacist3);
		
		System.out.println(manager.toString());
		for(Angajati a:manager.getSubordonati())
			System.out.println(a.getNume());
		
		
		farmacist.eliminareSubordonati(asFarmacist3);
		System.out.println(farmacist.toString());
		for(Angajati a:farmacist.getSubordonati())
			System.out.println(a.getNume());
		
		//MEMENTO
		System.out.println("\n\nMEMENTO");
		Reteta reteta3=new Reteta();
		Registru registru=new Registru();
		
		reteta3.retineReteta("123B");
		reteta3.retineReteta("12G5");
		registru.add(reteta3.salveazaStareaInMemento());
		
		reteta2.retineReteta("152B");
		registru.add(reteta2.salveazaStareaInMemento());

		System.out.println("Ultima reteta adaugata:"+reteta2.getNrReteta());
		reteta3.getStareaDinMemento(registru.get(0));
		System.out.println("Prima reteta din registru este: "+reteta3.getNrReteta());
		
		//Facade
		System.out.println("\n\nFACADE");
		reteta.afiseazaMedicamente();
		
		//TEMPLATE
		System.out.println("\n\nTEMPLATE");
		Crema crema=new Crema();
		Parfum parfum=new Parfum();
		crema.cicluCosmetice();
		System.out.println();
		parfum.cicluCosmetice();
		
				
	}

}
