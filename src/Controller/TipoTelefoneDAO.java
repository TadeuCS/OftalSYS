/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.TipoTelefone;
import Util.Classes.Manager;
import java.util.List;

/**
 *
 * @author Tadeu
 */
public class TipoTelefoneDAO extends Manager {

    public List<TipoTelefone> listar() {
        em.getTransaction().begin();
        query = em.createNamedQuery("TipoTelefone.findAll");
        em.getTransaction().commit();
        return query.getResultList();
    }

    public TipoTelefone buscar(String descricao) {
        em.getTransaction().begin();
        query=em.createNamedQuery("TipoTelefone.findByDescricao").setParameter("descricao", descricao);
        em.getTransaction().commit();
        return (TipoTelefone) query.getSingleResult();
    }
}
