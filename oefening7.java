import java.util.Scanner;

public class oefening7 {
    public static void main(String[] args) {
    	//Simpele versie van lingo met een vast 5-letter woord
    	
    	String woord = "panda";
    	char correct_arr[] = woord.toCharArray();
    	
    	String hint = "_____";
    	char hint_arr[] = hint.toCharArray();
    	
    	Scanner sc = new Scanner(System.in);
    	
    	// Game loop
    	while(hint.equals("22222") == false) {
        	System.out.println("Uw hint is: " + hint);
        	System.out.println("Wat is het woord?");
        	String invoer = sc.nextLine();
        	
        	if(invoer.length() == 5) { // check of het woord de juiste lengte heeft
            	char invoer_arr[] = invoer.toCharArray();
            	
            	for(int i = 0; i < 5; i ++) {
            		if(correct_arr[i] == invoer_arr[i]) { 
            			hint_arr[i] = '2';
            		} else if(woord.contains(String.valueOf(invoer_arr[i]))) {
            			hint_arr[i] = '1';
                	}
            	}
            	
            	hint = hint.valueOf(hint_arr);
            	
            } else {
            	System.out.println("Een woord van VIJF letters graag.");
        	} //einde van vijf-letter-check
        	
       	} //einde van game loop
    	System.out.println("Gefeliciteerd! Het woord was inderdaad " + woord);
    	sc.close();
    }
}

