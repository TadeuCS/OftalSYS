package Util.Classes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class Manager {
    protected Query query;
    protected EntityManagerFactory emf= Persistence.createEntityManagerFactory("OftalSISPU");
    protected EntityManager em= emf.createEntityManager();
}
