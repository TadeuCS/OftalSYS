/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Cor;
import Model.TipoUsuario;
import Util.Classes.Conexao;
import java.util.List;

/**
 *
 * @author Tadeu
 */
public class TipoUsuarioDAO extends Conexao {

    public void salvar(TipoUsuario cor){
        em.getTransaction().begin();
        em.merge(cor);
        em.getTransaction().commit();
    }
    public List<TipoUsuario> listar() {
        em.getTransaction().begin();
        query = em.createNamedQuery("TipoUsuario.findAll");
        em.getTransaction().commit();
        return query.getResultList();
    }

    public TipoUsuario buscar(String descricao) {
        em.getTransaction().begin();
        query=em.createNamedQuery("TipoUsuario.findByDescricao").setParameter("descricao", descricao);
        em.getTransaction().commit();
        return (TipoUsuario) query.getSingleResult();
    }
}
