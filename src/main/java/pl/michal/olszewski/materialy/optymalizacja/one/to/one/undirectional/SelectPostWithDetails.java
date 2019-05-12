package pl.michal.olszewski.materialy.optymalizacja.one.to.one.undirectional;

import static pl.michal.olszewski.materialy.EntityManagerSingleton.INSTANCE;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.Arrays;
import java.util.List;

public class SelectPostWithDetails {

  public static void main(String[] args) {
    EntityManager em = INSTANCE.getEntityManager();

  /*  Query query = em
            .createQuery("select p.title,p.postDetails.id from Post p");
    List resultList = query.getResultList();
    System.out.println(resultList);*/








/*
    TypedQuery<Object[]> typedQuery = em
            .createQuery("select p.title,p.postDetails.id from Post p", Object[].class);
    List<Object[]> resultList1 = typedQuery.getResultList();
    for (Object[] o : resultList1) {
      System.out.println(Arrays.toString(o));
    }*/





    TypedQuery<Result> typedQuery2 = em
            .createQuery("select new pl.michal.olszewski.materialy.optymalizacja.one.to.one.undirectional.Result(p.title,p.postDetails.id) from Post p", Result.class);
    List<Result> resultList2 = typedQuery2.getResultList();
    System.out.println(resultList2);
  }
}
