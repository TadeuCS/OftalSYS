/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Profissao;
import Util.Classes.Conexao;
import java.util.List;

/**
 *
 * @author Tadeu
 */
public class ProfissaoDAO extends Conexao {

    public void salvar(Profissao profissao) {
        em.getTransaction().begin();
        em.merge(profissao);
        em.getTransaction().commit();
    }

    public List<Profissao> listar() {
        em.getTransaction().begin();
        query = em.createNamedQuery("Profissao.findAll");
        em.getTransaction().commit();
        return query.getResultList();
    }

    public Profissao buscar(String descricao) {
        em.getTransaction().begin();
        query = em.createNamedQuery("Profissao.findByDescricao").setParameter("descricao", descricao);
        em.getTransaction().commit();
        return (Profissao) query.getSingleResult();
    }
}
