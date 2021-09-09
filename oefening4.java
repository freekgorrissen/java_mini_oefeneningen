import java.util.Arrays;
import java.util.Random;

public class oefening4 {
    public static void main(String[] args) {
    	
    	// De random generator maken
    	Random r = new Random();
    	
    	// Methode 1, met Arrays method. 
    	
    	// De te sorteren random arrays
    	// Array 1 wordt random gegenereerd
    	int arr1[] = new int[10];
    	for(int i = 0; i < arr1.length; i ++) {
    		arr1[i] = r.nextInt(1000);
    	}
    	// Array 2 is gelijk aan array 1
    	int arr2[] = arr1;

    	// Sorteren met behulp van array method
    	Arrays.sort(arr1);
    	System.out.println("Methode 1: " + Arrays.toString(arr1));
    	
    	
    	
    	// Methode 2. Helemaal handmatig. De ongesoorteerde array is gelijk aan die van methode 1.

    	// Lege array met zelfde lengte (sortarray)
    	int arr2sort[] = new int[arr2.length];
    	
    	// Loop over alle elementen in de originele array
    	for(int i = 0; i < arr2.length; i ++) {
    		// stap 1: kopiëer elk element naar de nieuwe array
    		arr2sort[i] = arr2[i];
    		 
    		 // Print van de array tot nu toe, wanneer een waarde wordt toegevoegd. Voor testen.
			 // System.out.println("Add:  " + Arrays.toString(arr2sort));
    		 
    		 // Stap 2: Wandel over de hele sortarray (tot dan toe) van achter naar voor
			 for(int j = i; j > 0 ; j --) {
				 // Stap 3: Check of de waarde kleiner is dan vorige waarde
    			 if(arr2sort[j] < arr2sort[j-1]) {
    				 // Zo ja, wissel dan de laatste en voorlaatste waarde
    				 int x0 = arr2sort[j-1];
    				 int x1 = arr2sort[j];
    				 arr2sort[j] = x0;
    				 arr2sort[j-1] = x1;
    				 
    				 // Print van sortarray tot dan toe, alleen geprint als sortloop gebruikt wordt. Voor testen.
    				 // System.out.println("Sort: " + Arrays.toString(arr2sort));
    			 }
			 }
    	}
    	
    	System.out.println("Methode 2: " + Arrays.toString(arr2sort));
    	
    	
    }
}
