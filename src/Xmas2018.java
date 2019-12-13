import java.util.Random;

public class Xmas2018 {
 
 
	public static void main(String[] args) {
		
		int breite = 100;  // Zeichenbreite des Baums an dickster Stelle
		int count = 1;    // Z�hler f�r Ausgabe der Bl�tter (2. FOR-Schleife)
		Random random = new Random(); // Zufallszahl-Objekt erstellen
		int zufallszahl; // Zufallszahl-Variable deklarieren
	    int stamm = breite; // Breite speichern f�r Stammberechnung
	    
	    
	while(breite>0){       
		for(int i = 0; i<breite/2; i++){   	// Die Schleife f�r die Leerzeichen 
											//in jeder Zeile, l�uft, solange der Wert < 
											// als die H�lfte der Gesamtbreite ist
			System.out.print(" ");
		}
		breite--;							// nach jeder Zeile wird ein Leerzeichen weniger ausgegeben 
											// Vergleichswert "Breite" -1
		
		for(int i = 0; i<count; i++){ 	// Schleife f�r Bl�tter, Anzahl steigt mit jedem Durchlauf.
			zufallszahl= 1 + random.nextInt(7); // Zufallszahl zwischen 0 und 7, f�r Christbaumschmuck
	    	  if(zufallszahl%7==0){ // Wenn Zahl == 0, dann Christbaumkugel
	    		  System.out.print("@");}
	    	  	else{System.out.print("X");}  // Sonst Tannennadeln
		}
		System.out.println();
		count++;							// Counter +1, damit die Anzahl der Bl�tter in jeder Zeile steigt. 
	}
	
	   //Stamm 
		
		for(int i= 0; i<(count/2)-1;i++){
			System.out.print(" ");
		}
		
		if(count%2==0){count = 2;}else{count = 3;}
		
		for(int i = 0; i<count; i++){		// Schleife f�r Stamm
			System.out.print("|");
		}
		
		
		
	    }
	}

