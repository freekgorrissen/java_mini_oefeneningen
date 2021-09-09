
public class oefening8 {
    public static void main(String[] args) {
    	Boot racer = new Speedboot();
    	Kapitein hendrik = new Kapitein();
    	hendrik.varen(racer);
    	
    	System.out.println(racer.getClass());
    }
}

class Boot{
	String terrein = "water";
	
	void starten(){
		System.out.println("De boot begint te varen.");
	}
}


class Speedboot extends Boot{}


class Kapitein{
	void varen(Boot boot){
		if(boot instanceof Speedboot) {
			System.out.println("Ik zet even mijn pet af.");
		}
		boot.starten();
	}
}