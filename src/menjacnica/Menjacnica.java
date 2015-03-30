package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import kurs.Kurs;
import menjacnicainterfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs{

	public void dodajKurs(GregorianCalendar datum, double prodajniKurs,
			double srednjiKurs, double kupovniKurs) {
		Kurs k = new Kurs();
		LinkedList<Kurs> kurs = new LinkedList<Kurs>();
		k.setDatum(datum);
		k.setKupovniKurs(kupovniKurs);
		k.setSrednjiKurs(srednjiKurs);
		k.setProdajniKurs(prodajniKurs);
		kurs.add(k);
	}

	public Kurs obrisiKurs(GregorianCalendar datum) {
		// TODO Auto-generated method stub
		return null;
	}

	public Kurs pronadjiKurs(GregorianCalendar datum) {
		// TODO Auto-generated method stub
		return null;
	}

}
