
public class oefening5 {
    public static void main(String[] args) {
    	
    	boolean merc_arr[] = {true, true, false, false};
    	boolean fiat_arr[] = {true, true, true, true};
    	boolean volv_arr[] = {false, false, false, false};
    	
    	Auto mercedes 	= new Auto(merc_arr) ;
    	Auto fiat 		= new Auto(fiat_arr);
    	Auto volvo 		= new Auto(volv_arr);
    	
    	Monteur piet	= new Monteur();
    	
    	piet.reparatie(mercedes);

    }
}

class Auto{
	boolean motor;
	boolean deur;
	boolean voorruit;
	boolean uitlaat;
	
	Auto(boolean arr[]){
		this.motor = arr[0];
		this.deur = arr[1];
		this.voorruit = arr[2];
		this.uitlaat = arr[3];
		
	}
}

class Monteur{
	int reparatie(Auto auto){
		int klusjes = 0;
		
		if(auto.motor==true) {
			klusjes ++;
			auto.motor = false;
		}
		if(auto.deur==true) {
			klusjes ++;
			auto.deur = false;
		}
		if(auto.voorruit==true) {
			klusjes ++;
			auto.voorruit = false;
		}
		if(auto.uitlaat==true) {
			klusjes ++;
			auto.uitlaat = false;
		}
		int kosten = klusjes * 25;
		if(klusjes>0) {
			System.out.println("Uw auto is klaar. Dat is dan €" + kosten + ".");	
		} else {
			System.out.println("Uw auto is helemaal in orde.");
		}

		return kosten;
	}
}