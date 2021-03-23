public class zähler {
	public static void main(String[] args) {

		System.out.println("For Loop");
		for(int forI = 1; forI <= 1001; forI += 4) {
			System.out.print(forI + " + ");
		}
		System.out.println("\nWhile");
		int wI = 1;
		while(wI <= 1001) {
			wI = wI + 4;
			System.out.print(wI + " + ");
		}

		System.out.println("\nDo While");
		int dI = 1;
		do{
			dI = dI + 4;
			System.out.print(dI + " + ");
		}while(dI <= 1001);

		System.exit(0);
	}
}
