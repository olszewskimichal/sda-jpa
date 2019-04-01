package pl.michal.olszewski;

import static pl.michal.olszewski.EntityManagerSingleton.INSTANCE;

import javax.persistence.EntityTransaction;

public class PersistNewEmployee {

  public static void main(String[] args) {
    EntityTransaction transaction = INSTANCE.getEntityManager().getTransaction();
    transaction.begin();
    Employee employee = new Employee("nowynowy1", 12341L);
    INSTANCE.getEntityManager().persist(employee);
    transaction.commit();
    System.err.println(employee);
  }

}
