package epam.hausaufgabe.neu.main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import epam.hausaufgabe.neu.bean.Depo;
import epam.hausaufgabe.neu.bean.Month;
import epam.hausaufgabe.neu.bean.Train;
import epam.hausaufgabe.neu.logic.Logic;
import epam.hausaufgabe.neu.view.Print;

public class Main {

	public static void main(String[] args) {
		Train zug1= new Train(35, "Minsk", new Date(2022-1900, Month.MAY, 1, 17, 45));
		Train zug2= new Train(86, "Pinsk", new Date(2022-1900, Month.MAY, 1, 22, 50));
		Train zug3= new Train(84, "Gomel", new Date(2022-1900, Month.MAY, 1, 13, 8));
		Train zug4= new Train(59, "Brest", new Date(2022-1900, Month.MAY, 1, 23, 4));
		Train zug5= new Train(96, "Minsk", new Date(2022-1900, Month.MAY, 1, 2, 58));
		Train zug6= new Train(82, "Brest", new Date(2022-1900, Month.MAY, 1, 5, 25));
		Train zug7= new Train(51, "Baranovichi", new Date(2022-1900, Month.MAY, 1, 9, 45));
		Train zug8= new Train(15, "Gomel", new Date(2022-1900, Month.MAY, 1, 12, 2));
		Train zug9= new Train(37, "Minsk", new Date(2022-1900, Month.MAY, 1, 15, 24));
		Train zug10= new Train(48, "Pinsk", new Date(2022-1900, Month.MAY, 1, 16, 35)); 
		
		Depo depo= new Depo();
		depo.add(zug10);
		depo.add(zug9);
		depo.add(zug8);
		depo.add(zug7);
		depo.add(zug6);
		depo.add(zug5);
		depo.add(zug4);
		depo.add(zug3);
		depo.add(zug2);
		depo.add(zug1);
		
		Logic lgc= new Logic();
		Print prnt= new Print();
		
		lgc.find(86, (List<Train>) depo);
		lgc.findCityAndTime(depo);
		
		prnt.print(lgc.find(86, (List<Train>) depo));
		
		prnt.print(lgc.findCityAndTime(depo));
	}

}
