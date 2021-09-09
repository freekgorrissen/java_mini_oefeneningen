
public class oefening3 {
    public static void main(String[] args) {
    	
    	// Array om te tellen
    	int arr[] = {15, 17, 5, 4, 6, 15};
    	
    	// Voor de hand liggende optie met for loop, zoals in tutorial
    	int arr_sum1 = 0;
    	for(int x = 0; x < arr.length; x ++) {
    	arr_sum1 += arr[x];
    	}
    	
    	System.out.println("De som van de array waarden is " + arr_sum1);
    	
    	// van internet geplukt, geen idee hoe deze loop werkt. Resultaat is hetzelfde
    	int arr_sum2 = 0;
    	for (int value : arr) {
    		arr_sum2 += value;
    	}
    	
    	System.out.println("De som van de array waarden is " + arr_sum2);
    	
    }
}
