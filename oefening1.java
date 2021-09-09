
public class oefening1 {
    public static void main(String[] args) {
    	String str1 = "Hello ";
    	String str2 = "world! ";
    	String str3 = "How you doing?";
    	
    	String zin1 = str1 + str2 + str3;
    	
    	System.out.println(zin1);
    	
    	String zin2 = "";
    	zin2 = zin2.concat(str1);
    	zin2 = zin2.concat(str2);
    	zin2 = zin2.concat(str3);
    	
    	System.out.println(zin2);
    	
    }
}
