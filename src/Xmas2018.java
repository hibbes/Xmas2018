
public class Xmas2018 {
 
 
	public static void main(String[] args) {
		int breite = 11;  // Zeichenbreite des Baums an dickster Stelle
		int count = 1;    // Z�hler f�r Ausgabe der Bl�tter (2. FOR-Schleife)
	
	while(breite>0){       
		for(int i = 0; i<breite/2; i++){   	// Die Schleife f�r die Leerzeichen 
											//in jeder Zeile, l�uft, solange der Wert < 
											// als die H�lfte der Gesamtbreite ist
			System.out.print(" ");
		}
		breite--;							// nach jeder Zeile wird ein Leerzeichen weniger ausgegeben 
											// Vergleichswert "Breite" -1
		
		for(int i = 0; i<count; i++){		// Schleife f�r Bl�tter, Anzahl steigt mit jedem Durchlauf.
			System.out.print("@");
		}
		System.out.println();
		count++;							// Counter +1, damit die Anzahl der Bl�tter in jeder Zeile steigt. 
	}
	
	   //Stamm 
		
		for(int i= 0; i<(count/2)-1;i++){
			System.out.print(" ");
		}
		for(int i = 0; i<2; i++){		// Schleife f�r Bl�tter, Anzahl steigt mit jedem Durchlauf.
			System.out.print("@");
		}
		
		
		
	    }
	}

