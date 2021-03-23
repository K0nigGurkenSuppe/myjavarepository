import javax.swing.*;

public class hufeisen {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Wie willst du bezahlen? \nEntweder für alle 24 Nägel zusammen 2 Silbermark \noder für den ersten Nagel 1 Pfennig, für den zweiten Nagel 2 Pfennig, für den dritten Nagel 4 Pfennig und so fort?", "Hufeisenschmied Checkout", JOptionPane.PLAIN_MESSAGE);

		int price = 0;
		int iC = 1;
		for(iC = 1; iC <= 24; iC++) {

			price = iC*iC -1;
            if(price == 0) { price = 1; };if(price == 8) { price = 7; };
			System.out.println("Der " + iC + " Nagel kostet " + price);

		}
		JOptionPane.showMessageDialog(null,"Auswertung:\nDer Gesammtpreis liegt bei " + price + " Pfenning\n1 Silbermark ist umgerechnet 256 Pfenning.\nEs wurden somit umgerechnet " + price / 256 + " Mark Gezahlt!", "Hufeisenschmied Checkout", JOptionPane.PLAIN_MESSAGE);
		exit(args);
	}

	public static void exit(String[] args) {
		JOptionPane.showMessageDialog(null, "Das Programm wurde beendet!", "Exit", JOptionPane.PLAIN_MESSAGE);
		System.exit(0);
	}

}
