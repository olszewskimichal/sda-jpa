package pl.michal.olszewski;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SelectEmployeeById {

  private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");

  public static EntityManager getEntityManager() {
    return emf.createEntityManager();
  }

  public static void main(String[] args) {
    Employee employee = getEntityManager().find(Employee.class, 1L);
    System.out.println(employee);
  }

}
