
public class oefening3 {
    public static void main(String[] args) {
    	int arr[] = {15, 17, 5, 4, 6, 15};
    	
    	int arr_sum1 = 0;
    	for(int x = 0; x < arr.length; x ++) {
    	arr_sum1 += arr[x];
    	}
    	
    	System.out.println("De som van de array waarden is " + arr_sum1);
    	
    	int arr_sum2 = 0;
    	for (int value : arr) {
    		arr_sum2 += value;
    	}
    	System.out.println("De som van de array waarden is " + arr_sum2);
    	
    }
}
