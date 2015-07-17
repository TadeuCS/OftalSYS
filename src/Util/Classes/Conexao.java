package Util.Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Conexao {

    PropertiesManager prop;
    Connection con;
    Statement st;
    protected Query query;
    protected EntityManagerFactory emf = Persistence.createEntityManagerFactory("OftalSISPU", getParametros());
    protected EntityManager em = emf.createEntityManager();

    public Map getParametros() {
        prop = new PropertiesManager();
        Map map = new HashMap();
        map.put("javax.persistence.jdbc.url", "jdbc:mysql://" + prop.ler("ip") + ":3306/"+prop.ler("banco")+"?zeroDateTimeBehavior=convertToNull");
        return map;
    }

    public Statement getConexao(String ip, String banco, String usuario, String senha) {
        try {
            prop = new PropertiesManager();
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(
                    "jdbc:mysql://"
                    + ip + ":3306/" + banco+"?zeroDateTimeBehavior=convertToNull",
                    usuario,
                    senha);
            st = con.createStatement();
            return st;
        } catch (Exception e) {
            return null;
        }
    }
}
