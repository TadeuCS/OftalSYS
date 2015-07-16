package Util.Classes;

import java.util.HashMap;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Manager {

    protected Query query;
    protected EntityManagerFactory emf = Persistence.createEntityManagerFactory("OftalSISPU", getParametros());
    protected EntityManager em = emf.createEntityManager();

    public Map getParametros() {
        PropertiesManager prop = new PropertiesManager();
        Map map = new HashMap();
        map.put("javax.persistence.jdbc.url", "jdbc:mysql://" + prop.ler("ip") + ":3306/oftaldb?zeroDateTimeBehavior=convertToNull");
        return map;
    }
}
