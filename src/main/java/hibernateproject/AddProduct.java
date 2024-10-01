package hibernateproject;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AddProduct {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("cart");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		HibernatePoduct p1=new HibernatePoduct();
		p1.setBrand("philips");
		p1.setPrice(1000);
		et.begin();
		em.persist(p1);
		et.commit();
	}
}
