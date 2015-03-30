package menjacnicainterfejs;

import java.util.GregorianCalendar;

import kurs.Kurs;

public interface MenjacnicaInterfejs {
	public void dodajKurs(GregorianCalendar datum, double prodajniKurs,
			double srednjiKurs, double kupovniKurs);
	public Kurs obrisiKurs(GregorianCalendar datum);
	public Kurs pronadjiKurs(GregorianCalendar datum);
}
