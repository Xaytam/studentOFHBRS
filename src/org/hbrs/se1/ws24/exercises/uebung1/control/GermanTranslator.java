package org.hbrs.se1.ws24.exercises.uebung1.control;

public class GermanTranslator implements Translator {

	public String date = "Okt/2024"; // Default-Wert
	public String[] zahlen = new String[10];
	public GermanTranslator(){
	zahlen[0] = "eins";
	zahlen[1] = "zwei";
	zahlen[2] = "drei";
	zahlen[3] = "vier";
	zahlen[4] = "fünf";
	zahlen[5] = "sechs";
	zahlen[6] = "sieben";
	zahlen[7] = "acht";
	zahlen[8] = "neun";
	zahlen[9] = "zehn";}
	/**
	 * Methode zur Übersetzung einer Zahl in eine String-Repraesentation
	 */
	public String translateNumber( int number ) {
		// [ihr Source Code aus Übung 1-2]
		try{
		return zahlen[number-1];}
		catch(ArrayIndexOutOfBoundsException e){

			throw new IllegalArgumentException("Übersetzung der Zahl " + number + " nicht möglich");
		}
	}

	/**
	 * Objektmethode der Klasse GermanTranslator zur Ausgabe einer Info.
	 */
	public void printInfo(){
		System.out.println( "GermanTranslator v1.9, erzeugt am " + this.date );
	}

	/**
	 * Setzen des Datums, wann der Uebersetzer erzeugt wurde (Format: Monat/Jahr (Beispiel: "Okt/2024"))
	 * Das Datum sollte system-intern durch eine Factory-Klasse gesetzt werden und nicht von externen View-Klassen
	 */
	public void setDate( String date ) {
		this.date = date;
	}

}
