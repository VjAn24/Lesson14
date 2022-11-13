package epam.hausaufgabe.neu.bean;

import java.sql.Date;
import java.util.Objects;
import epam.hausaufgabe.neu.view.Print;

public class Train {
	private int number;
	private String destination;
	private Date deparTime;
	
	public Train() {
		
	}

	public Train(int number, String destination, java.util.Date date) {
		this.destination = destination;
		this.number = number;
		this.deparTime = (Date) date;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Date getDeparTime() {
		return deparTime;
	}

	public void setDeparTime(Date deparTime) {
		this.deparTime = deparTime;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(deparTime, destination, number);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return Objects.equals(deparTime, other.deparTime) && Objects.equals(destination, other.destination)
				&& number == other.number;
	}

	@Override
	public String toString() {
		return "Train [destination=" + destination + ", number=" + number + ", deparTime=" + deparTime + "]";
	}

}
