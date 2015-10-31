
public class Übung_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean isCapital = true;
		int inhabitants = 250_000;
		double taxPerPersonAndMonth = 430.0;
		
		boolean result = isMetropolis(isCapital,inhabitants,taxPerPersonAndMonth);
		System.out.println("Metropolis? " + result);
		
	}

	public static boolean isMetropolis(boolean isCapital,int inhabitants,double taxPerPersonAndMonth)	 {
		// TODO
	
	//Stadt gilt als Metropole, sofern
		//a) die Hauptstadt nie mehr als 100.000 Einwohner hat oder
		//b) mehr als 200.000 Einwohner sowie mind. 720. Mio. jährliche Steuereinnahmen
		
		//a)
		boolean resultA = isCapital && inhabitants <= 100_000;
		//Zwischenrechnung
		double totalTaxes = inhabitants * taxPerPersonAndMonth * 12;
		//b)
		boolean resultB = inhabitants >= 200_000 && totalTaxes >= 720_000_000;
		
		return resultA || resultB;
			
		
	}
}
