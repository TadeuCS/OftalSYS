/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Convenio;
import Util.Classes.Conexao;
import java.util.List;

/**
 *
 * @author Tadeu
 */
public class ConvenioDAO extends Conexao {

    public void salvar(Convenio convenio) {
        em.getTransaction().begin();
        em.merge(convenio);
        em.getTransaction().commit();
    }

    public List<Convenio> listar() {
        em.getTransaction().begin();
        query = em.createNamedQuery("Convenio.findAll");
        em.getTransaction().commit();
        return query.getResultList();
    }

    public Convenio buscar(String descricao) {
        em.getTransaction().begin();
        query = em.createNamedQuery("Convenio.findByDescricao").setParameter("descricao", descricao);
        em.getTransaction().commit();
        return (Convenio) query.getSingleResult();
    }
}
