
public class Übung_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double celsius = 30, fahrenheit;
		fahrenheit = celsius2fahrenheit(celsius);
		
		//anzeigen
		System.out.println(fahrenheit);
				
	}
		public static double celsius2fahrenheit(double celsius) {
		// TODO
			
		double fahrenheit;
		
		//Rechnung
		fahrenheit = (9.0/5.0) * celsius + 32;
		
		return fahrenheit;
		
	}
		
}
