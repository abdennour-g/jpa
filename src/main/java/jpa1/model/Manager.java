package jpa1.model;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import jpa1.ent.Person;

public class Manager {
	  private static EntityManagerFactory emf = Persistence.createEntityManagerFactory( "bouaicha" );
	    // @PersistenceContext
	    private static EntityManager        em  = emf.createEntityManager();

	    public static List<Person> showList() {
	        Query q1 = em.createQuery( "SELECT c FROM Person c" );
	        // TypedQuery<Person> q2 = em1
	        // .createQuery( "SELECT c FROM Person c ORDER BY c.id DESC",
	        // Person.class );
	        return q1.getResultList();
	    }


	    // @Transactional
	    public static void insert( Person person ) {
	    	if(person!=null) {
	    	em.getTransaction().begin();
	        em.persist( person );
	        em.getTransaction().commit();
	    	}
	   }
	    

	    public static void update( Person personUpdate,int id ) {
	    	if(personUpdate!=null&&id>0) {
	    	Person person=     em.find(Person.class,id);   	
	     	person.setCin(personUpdate.getCin());
	     	person.setNom(personUpdate.getNom());
	     	person.setPrenom(personUpdate.getPrenom());
	     	person.setTel(personUpdate.getTel());
	     	person.setEmail(personUpdate.getEmail());
	     	em.getTransaction().begin();
	        em.persist( person );
	        em.getTransaction().commit();
	    	}
	    }
	    public static void delete(int id) {
	    	if(id>0) {
	    	Person person=     em.find(Person.class,id);   
	    	em.getTransaction().begin();
	    	em.remove(person);
	    	em.getTransaction().commit();
	    	}
	    }
	    
}
