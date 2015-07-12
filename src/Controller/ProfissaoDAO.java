/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Profissao;
import Util.Classes.Manager;
import java.util.List;

/**
 *
 * @author Tadeu
 */
public class ProfissaoDAO extends Manager {

    public List<Profissao> listar() {
        em.getTransaction().begin();
        query = em.createNamedQuery("Profissao.findAll");
        em.getTransaction().commit();
        return query.getResultList();
    }

    public Profissao buscar(String descricao) {
        em.getTransaction().begin();
        query=em.createNamedQuery("Profissao.findByDescricao").setParameter("descricao", descricao);
        em.getTransaction().commit();
        return (Profissao) query.getSingleResult();
    }
}