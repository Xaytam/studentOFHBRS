package org.hbrs.se1.ws24.exercises.uebung1.control;

public class EnglishTranslator implements Translator {

	public String date = "Okt/2024"; // Default-Wert
	String[] zahlen = {"one","two","three","four","five","six","seven","eight","nine","ten"};

	/**
	 * Methode zur Übersetzung einer Zahl in eine String-Repraesentation
	 */
	public String translateNumber( int number ) {
		// [ihr Source Code aus Übung 1-2]
		String tmp = "";
		try{
		tmp = zahlen[number-1];}
		catch(ArrayIndexOutOfBoundsException e){

			tmp = "The number:  " + number + " could not be translated (Version: " + version +")";
		}

		return tmp;
	}

	/**
	 * Objektmethode der Klasse GermanTranslator zur Ausgabe einer Info.
	 */
	public void printInfo(){
		System.out.println( "EnglishTranslator v1.9, erzeugt am " + this.date );
	}

	/**
	 * Setzen des Datums, wann der Uebersetzer erzeugt wurde (Format: Monat/Jahr (Beispiel: "Okt/2024"))
	 * Das Datum sollte system-intern durch eine Factory-Klasse gesetzt werden und nicht von externen View-Klassen
	 */
	public void setDate( String date ) {
		this.date = date;
	}

}
