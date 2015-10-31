
public class ErsteLV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		boolean treeFront = true;
		int numberLeaves =0;
		char meinZeichen = 'X';
		int zahl1 = 5;
		int zahl2 = 9;
		int ergebnis;
		
		System.out.println("Ist ein Baum voraus? " +treeFront);
		System.out.println();
		System.out.println("Anzahl der Blätter: " +meinZeichen);
		System.out.println("Anzahl der Blätter: " +numberLeaves);
	
		numberLeaves = numberLeaves +1;
		System.out.println("Anzahl der Blätter: " +numberLeaves);
		
		//Rechnung 5 + 9 = 14
		ergebnis = zahl1 + zahl2;
		
		//Ausgabe der Rechnung 1
		System.out.println(zahl1 + "+" + zahl2 + "=" + ergebnis);
		
		//Ausgabe der Rechnung 2
		System.out.println(String.format("%d + %d = %d", zahl1, zahl2, ergebnis));
		
	}

}
