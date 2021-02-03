package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import bathDate.normalDates;

public class main {

	public static void main(String[] args) {
		
		normalDates p1 = new normalDates(null, "João", 0.2, 1.3, 2.3, 2, 1, 1);
		
		EntityManagerFactory emf1 = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em1 = emf1.createEntityManager();
		
		System.out.println(p1);
		
		em1.getTransaction().begin();
		em1.persist(p1);
		em1.getTransaction().commit();
		
		System.out.println("End");
		
		em1.close();
		emf1.close();

	}

}
