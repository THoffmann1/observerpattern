/**
 * Client.java
 */
public class Client {

	public static void main(String[] args) {
		
		// Erzeugung des Subjektes
		KonkretesSubjekt konkretesSubjekt = new KonkretesSubjekt();
		
		// Erzeugung des Beobachters. Dabei wird
		// das Subjekt �bergeben und registriert.
		KonkreterBeobachter konkreterBeobachter = new KonkreterBeobachter(konkretesSubjekt);
				
		// Zustands�nderung, Subjekt benachrichtigt
		// daraufhin die Beobachter
		konkretesSubjekt.setState(1);
	}
}
