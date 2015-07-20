/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.StatusAtendimento;
import Util.Classes.Conexao;
import java.util.List;

/**
 *
 * @author Tadeu
 */
public class StatusAtendimentoDAO extends Conexao {

    public void salvar(StatusAtendimento cor){
        em.getTransaction().begin();
        em.merge(cor);
        em.getTransaction().commit();
    }
    public List<StatusAtendimento> listar() {
        em.getTransaction().begin();
        query = em.createNamedQuery("StatusAtendimento.findAll");
        em.getTransaction().commit();
        return query.getResultList();
    }

    public StatusAtendimento buscar(String descricao) {
        em.getTransaction().begin();
        query=em.createNamedQuery("StatusAtendimento.findByDescricao").setParameter("descricao", descricao);
        em.getTransaction().commit();
        return (StatusAtendimento) query.getSingleResult();
    }
}
