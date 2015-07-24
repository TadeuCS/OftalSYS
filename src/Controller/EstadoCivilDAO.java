/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.EstadoCivil;
import Util.Classes.Conexao;
import java.util.List;

/**
 *
 * @author Tadeu
 */
public class EstadoCivilDAO extends Conexao {

    public void salvar(EstadoCivil estadoCivil){
        em.getTransaction().begin();
        em.merge(estadoCivil);
        em.getTransaction().commit();
    }
    public List<EstadoCivil> listar() {
        em.getTransaction().begin();
        query = em.createNamedQuery("EstadoCivil.findAll");
        em.getTransaction().commit();
        return query.getResultList();
    }

    public EstadoCivil buscar(String descricao) {
        em.getTransaction().begin();
        query=em.createNamedQuery("EstadoCivil.findByDescricao").setParameter("descricao", descricao);
        em.getTransaction().commit();
        return (EstadoCivil) query.getSingleResult();
    }
}
