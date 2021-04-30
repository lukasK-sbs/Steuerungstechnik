import java.util.Scanner;

public class _3D_Filament_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int kg = 0;
		// float pr = 0.0f;
		float ergebnis = 0.0f;
		int mat_Preis = 0;
		float KWh_verbrauch = 0.6f;
		float KWh_Preis = 0.3f;
		float zeit = 0.0f;
		float matK = 0;

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.println("Welches Material nutzt Du?: ");
		System.out.println("1= PLA");
		System.out.println("2= TPU");
		System.out.println("3= PLTG");
		mat_Preis = input.nextInt();

		System.out.println("Wie lange beträgt die Druckzeit in Stunden?");
		zeit = input.nextFloat();

		System.out.println("Wie hoch sind die Materialkosten?");
		matK = input.nextFloat();

		switch (mat_Preis) {
		case 1:
			ergebnis = kosten(KWh_Preis, zeit, KWh_verbrauch, matK);
			break;

		case 2:
			ergebnis = kosten(KWh_Preis, zeit, KWh_verbrauch, matK);
			break;

		case 3:
			ergebnis = kosten(KWh_Preis, zeit, KWh_verbrauch, matK);
			break;

		}
		System.out.println("Kosten: " + ergebnis + " €");

	}

	private static float kosten(float KWh_Preis, float zeit, float KWh_verbrauch, float matK) {
		float rueckgabe = 0.0f;
		float stromK = KWh_Preis * KWh_verbrauch * zeit;

		rueckgabe = stromK + matK;

		return rueckgabe;
	}

}
