import java.util.Arrays;
import java.util.Scanner;

public class oefening6 {
    public static void main(String[] args) {
    //Scanner maken om iets in de voeren
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Vul hier uw zin in: ");
    	String invoer = sc.nextLine();
    	sc.close();
    	
    // Print van de invoer string
    	System.out.println("Dit is uw zin:");
    	System.out.println(invoer);
    	
    // String sorteren op alfabetische volgorde, handmatig
    	
    	// Lege array met lengte van de invoer
    	char sortarr[] = new char[invoer.length()];
    	
    	// Loop over de invoer zin, voeg elke letter toe aan array
    	for(int i = 0; i < invoer.length(); i ++) {
    		sortarr[i] = invoer.charAt(i);
    	}
    	// Sorteer de nieuwe array
    	Arrays.sort(sortarr);
    	String sortstring = new String(sortarr);
    	
    	// Print de gesorteerde array
    	System.out.println("Methode 1: " + sortstring);
    	
    // String sorteren m.b.v. method
    	char sortarr2[] = invoer.toCharArray();
    	Arrays.sort(sortarr2);
    	String sortstring2 = new String(sortarr2);
    	System.out.println("Methode 2: "+ sortstring2);
    	 
    }
}
