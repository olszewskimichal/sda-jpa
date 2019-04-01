package pl.michal.olszewski.zadania.zad5;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import pl.michal.olszewski.materialy.Employee;

public class Zad5 {

  private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");

  public static EntityManager getEntityManager() {
    return emf.createEntityManager();
  }

  public static void main(String[] args) {
    Employee employee = getEntityManager().find(Employee.class, 1L);
    System.out.println(employee);
  }

}
