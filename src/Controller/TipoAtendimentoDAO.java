/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.TipoAtendimento;
import Util.Classes.Conexao;
import java.util.List;

/**
 *
 * @author Tadeu
 */
public class TipoAtendimentoDAO extends Conexao {

    public void salvar(TipoAtendimento tipo){
        em.getTransaction().begin();
        em.merge(tipo);
        em.getTransaction().commit();
    }
    public List<TipoAtendimento> listar() {
        em.getTransaction().begin();
        query = em.createNamedQuery("TipoAtendimento.findAll");
        em.getTransaction().commit();
        return query.getResultList();
    }

    public TipoAtendimento buscar(String descricao) {
        em.getTransaction().begin();
        query=em.createNamedQuery("TipoAtendimento.findByDescricao").setParameter("descricao", descricao);
        em.getTransaction().commit();
        return (TipoAtendimento) query.getSingleResult();
    }
}
