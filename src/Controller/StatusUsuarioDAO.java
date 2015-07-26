/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.StatusUsuario;
import Util.Classes.Conexao;
import java.util.List;

/**
 *
 * @author Tadeu
 */
public class StatusUsuarioDAO extends Conexao {

    public void salvar(StatusUsuario status){
        em.getTransaction().begin();
        em.merge(status);
        em.getTransaction().commit();
    }
    public List<StatusUsuario> listar() {
        em.getTransaction().begin();
        query = em.createNamedQuery("StatusUsuario.findAll");
        em.getTransaction().commit();
        return query.getResultList();
    }

    public StatusUsuario buscar(String descricao) {
        em.getTransaction().begin();
        query=em.createNamedQuery("StatusUsuario.findByDescricao").setParameter("descricao", descricao);
        em.getTransaction().commit();
        return (StatusUsuario) query.getSingleResult();
    }
}
