package epam.hausaufgabe.neu.view;

import epam.hausaufgabe.neu.bean.Depo;
import epam.hausaufgabe.neu.bean.Train;

public class Print {
	Depo depo= new Depo();
	Train tr = new Train();
	
	public void print() {
		for (Train tr: depo.getZug()) {
			System.out.println(tr);
		}
	}
	
	public void print(Train findCityAndTime) {
		for (Train tr: depo.getZug()) {
			System.out.println(tr);
	
		}
	}

	public void print(Depo find) {
		for (Train tr: depo.getZug()) {
			System.out.println(tr);
		}
		
	}
}
