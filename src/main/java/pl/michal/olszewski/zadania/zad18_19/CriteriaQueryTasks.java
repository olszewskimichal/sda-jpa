package pl.michal.olszewski.zadania.zad18_19;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import pl.michal.olszewski.materialy.Employee;
import pl.michal.olszewski.materialy.EntityManagerSingleton;

public class CriteriaQueryTasks {

  public static void main(String[] args) {

  }

  List<Employee> findAllEmployeesByName(String name) {
    EntityManager entityManager = EntityManagerSingleton.INSTANCE.getEntityManager();
    CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
    CriteriaQuery<Employee> query = criteriaBuilder.createQuery(Employee.class);
    Root<Employee> from = query.from(Employee.class);
    query.select(from)
        .where(
            criteriaBuilder.equal(from.get("name"), name)
        );
    TypedQuery<Employee> tq = entityManager.createQuery(query);
    return tq.getResultList();
  }

  List<Employee> findAllEmployeesWithSalaryBiggerThan(Long salary) {
    EntityManager entityManager = EntityManagerSingleton.INSTANCE.getEntityManager();
    CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
    CriteriaQuery<Employee> query = criteriaBuilder.createQuery(Employee.class);
    Root<Employee> from = query.from(Employee.class);
    query.select(from)
        .where(
            criteriaBuilder.greaterThan(from.get("salary"), salary)
        );
    TypedQuery<Employee> tq = entityManager.createQuery(query);
    return tq.getResultList();
  }
}
