/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Exame;
import Util.Classes.Conexao;
import java.util.List;

/**
 *
 * @author Tadeu
 */
public class ExamesDAO extends Conexao {

    public void salvar(Exame exame){
        em.getTransaction().begin();
        em.merge(exame);
        em.getTransaction().commit();
    }
    public List<Exame> listar() {
        em.getTransaction().begin();
        query = em.createNamedQuery("Exame.findAll");
        em.getTransaction().commit();
        return query.getResultList();
    }

    public Exame buscar(String descricao) {
        em.getTransaction().begin();
        query=em.createNamedQuery("Exame.findByDescricao").setParameter("descricao", descricao);
        em.getTransaction().commit();
        return (Exame) query.getSingleResult();
    }
}
