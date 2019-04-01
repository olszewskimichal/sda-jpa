package pl.michal.olszewski;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class CriteriaQueryExample {

  public static void main(String[] args) {
    EntityManager entityManager = EntityManagerSingleton.INSTANCE.getEntityManager();
    CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
    CriteriaQuery<Employee> query = criteriaBuilder.createQuery(Employee.class);
    Root<Employee> from = query.from(Employee.class);
    query.select(from)
        .where(
            criteriaBuilder.equal(from.get("id"), 1L)
        );
    TypedQuery<Employee> tq = entityManager.createQuery(query);
    List<Employee> resultList = tq.getResultList();
    System.out.println(resultList);
  }
}
