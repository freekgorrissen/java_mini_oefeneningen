import java.util.ArrayList;
import java.util.Scanner;

public class oefening10 {
    public static void main(String[] args) {
    // Schrijf een programma voor het 'ik ga op reis en ik neem mee' spel
    	ikgaopreis("paraplu");
}



static void ikgaopreis(String begin) {
	ArrayList lijst = new ArrayList();
	lijst.add(begin);
	
	Scanner sc = new Scanner(System.in);

	while(true) {
		System.out.println("Gezegd is: " + lijst);
		System.out.println("Wat is het volgende woord?");
		
		String invoer = sc.nextLine();
		
		char eersteletter = invoer.charAt(0);
		
		String laatstewoord = lijst.get(lijst.size()-1).toString();
		int lengte = laatstewoord.length();
		char laatsteletter = laatstewoord.charAt(lengte-1);
		
		if(laatsteletter != eersteletter) {
			System.out.println("Het woord moet beginnen met de laatste letter van het vorige woord.");
		} else {
			lijst.add(invoer);
		}
	}
	


}
}		



