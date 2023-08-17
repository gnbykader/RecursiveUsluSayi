import java.util.Scanner;

public class Main {
	
    static int power(int base, int  exponent) {	
    	if(exponent == 0)
		return 1;
    	else {
			return base*power(base, exponent-1);
		}
    	
    }

	public static void main(String[] args) {
		
		
		while (true) {
			Scanner inp = new Scanner(System.in);
	    	System.out.println("Taban Degerini Giriniz: ");
	    	int base = inp.nextInt();
	    	System.out.println("Us Degerini Giriniz: ");
	    	int exponent = inp.nextInt();
			System.out.println("Sonuc: "+power(base, exponent));
		}

	}

}
