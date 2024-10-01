package hibernateentityproject;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("cart");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Charger charger=new Charger();
		Phone phone=new Phone();
		charger.setWatt(25);
		phone.setPrice(25000);
		phone.setBrand("moto");
		phone.setCharger(charger);
		et.begin();
		em.persist(charger);
		em.persist(phone);
		et.commit();
	}

}
