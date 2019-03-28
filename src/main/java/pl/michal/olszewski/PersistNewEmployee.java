package pl.michal.olszewski;

import org.hibernate.Hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.transaction.Transactional;

import static pl.michal.olszewski.EntityManagerSingleton.INSTANCE;

public class PersistNewEmployee {

    /*private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");

    public static EntityManager getEntityManager(){
        return emf.createEntityManager();
    }*/

    public static void main(String[] args) {
        EntityTransaction transaction = INSTANCE.getEntityManager().getTransaction();
        transaction.begin();
        Employee nowynowy = new Employee("nowynowy1", 12341L);
        INSTANCE.getEntityManager().persist(nowynowy);
        transaction.commit();
        System.err.println(nowynowy);
    }

}
