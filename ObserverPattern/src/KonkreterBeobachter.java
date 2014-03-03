/**
 * KonkreterBeobachter.java
 */
public class KonkreterBeobachter implements Beobachter {

	private KonkretesSubjekt konkretesSubjekt;

	public KonkreterBeobachter(KonkretesSubjekt konkretesSubjekt) {
		this.konkretesSubjekt = konkretesSubjekt;
		
		// Durchf�hrung der Registrierung beim �bergebenen Subjekt
		this.konkretesSubjekt.addBeobachter(this);
	}
	
	@Override
	public void update() {
		int newState = konkretesSubjekt.getState();
		// ...auf neuen Status reagieren
	}
}
