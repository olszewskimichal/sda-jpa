package pl.michal.olszewski.materialy;

import static pl.michal.olszewski.materialy.EntityManagerSingleton.INSTANCE;

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
