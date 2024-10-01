package hibernateentityproject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Charger {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int watt;
	@OneToOne
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getWatt() {
		return watt;
	}
	public void setWatt(int watt) {
		this.watt = watt;
	}

}
