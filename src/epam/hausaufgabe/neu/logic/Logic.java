package epam.hausaufgabe.neu.logic;


import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import epam.hausaufgabe.neu.bean.Depo;
import epam.hausaufgabe.neu.bean.Train;
import epam.hausaufgabe.neu.view.Print;

public class Logic {
	
	public Depo find(int number, List<Train> zug) {
		for (Train trn: zug) {
			if (number==trn.getNumber()) {
			}
		}
		return null;
	}
	
	

	public Depo findCityAndTime(Depo de) {
		Collections.sort(de.getZug(), new Comparator<Train>() {
			public int compare(Train a, Train b) {
				if (a.getDestination().equals(b.getDestination())) {
					return a.getDeparTime().compareTo(b.getDeparTime());
				} else {
					return a.getDestination().compareTo(b.getDestination());
				}
			}
		});
		return de;
	}

}
