package epam.hausaufgabe.neu.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Depo {
private List<Train> zug = new ArrayList<Train>();
	
	public Depo() {
		
	}

	public Depo(List<Train> zug) {
		this.zug = zug;
	}

	public List<Train> getZug() {
		return zug;
	}

	public void setZug(List<Train> zug) {
		this.zug = zug;
	}
	
	public Train getZug(int number) {
		return zug.get(number);
	}
	
	public void setZug(int number, Train train) {
		zug.set(number, train);
	}
	
	public int ountTrans() {
		return zug.size();
	}
	
	public void add(Train tr) {
		zug.add(tr);
	}

	@Override
	public int hashCode() {
		return Objects.hash(zug);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Depo other = (Depo) obj;
		return Objects.equals(zug, other.zug);
	}

	@Override
	public String toString() {
		return "Depo [zug=" + zug + "]";
	}

}
