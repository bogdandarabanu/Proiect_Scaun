package scaun;

import java.util.ArrayList;
import java.util.Collections;

public class TestScaun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scaun s1 = new Scaun(1, 50, 3, 2000);
		Scaun s2 = new Scaun(2, 90, 4, 1990);
		Scaun s3 = new Scaun(3, 40, 5, 2010);
		Scaun s4 = new Scaun(4, 30, 2, 1995);

		ArrayList<Scaun> scaune = new ArrayList<>();
		scaune.add(s1);
		scaune.add(s2);
		scaune.add(s3);
		scaune.add(s4);

		s1.testAnFabricatie();
		s1.nrPicioareScaun();
		s1.comparareDupaPret(s2);

		Scaun deComparat = new Scaun(2, 50, 3, 2000);
		if (s1.apartineLista(scaune, deComparat) == true)
			System.out.println("Scaunul cu " + deComparat.toString() + " APARTINE listei.");
		else
			System.out.println("Scaunul cu " + deComparat.toString() + " NU apartine listei.");
		
		Collections.sort(scaune, new ComparatorScaune());
		System.out.println("\nLista de scaune sortata descrescator este: ");
		
		for(Scaun a: scaune)
			System.out.println(a.toString());
		scaune.get(0).testAnFabricatie();
	}

}
