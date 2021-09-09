
public class oefening2 {
    public static void main(String[] args) {
    	String zin = "Dit is een testzin. U wordt vriendelijke verzocht deze zin niet te lezen.";
    	
    	int aantal_e1 = 0;
    	
    	for(int letter = 0; letter < zin.length(); letter ++) {
    		if(zin.charAt(letter) == 'e') {
    			aantal_e1 ++;
    		}
    	}
    	
    	System.out.println(zin);
    	System.out.println("Het aantals e's in bovenstaande zin is: " + aantal_e1);
    			
    }
}
