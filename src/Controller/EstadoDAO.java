/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Uf;
import Util.Classes.Conexao;
import java.util.List;

/**
 *
 * @author Tadeu
 */
public class EstadoDAO extends Conexao {

    public List<Uf> listar() {
        em.getTransaction().begin();
        query = em.createNamedQuery("Uf.findAll");
        em.getTransaction().commit();
        return query.getResultList();
    }

    public Uf buscar(String descricao) {
        em.getTransaction().begin();
        query=em.createNamedQuery("Uf.findBySigla").setParameter("sigla", descricao);
        em.getTransaction().commit();
        return (Uf) query.getSingleResult();
    }
}
