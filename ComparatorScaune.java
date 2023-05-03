package scaun;

import java.util.Comparator;

public class ComparatorScaune implements Comparator<Scaun>{

	@Override
	public int compare(Scaun o1, Scaun o2) {
		if(o1.getPret() > o2.getPret())
			return 1;
		if(o1.getPret() < o2.getPret())
			return -1;
		return 0;
	}
	
}
