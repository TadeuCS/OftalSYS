/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Cor;
import Util.Classes.Conexao;
import java.util.List;

/**
 *
 * @author Tadeu
 */
public class CorDAO extends Conexao {

    public void salvar(Cor cor){
        em.getTransaction().begin();
        em.merge(cor);
        em.getTransaction().commit();
    }
    public List<Cor> listar() {
        em.getTransaction().begin();
        query = em.createNamedQuery("Cor.findAll");
        em.getTransaction().commit();
        return query.getResultList();
    }

    public Cor buscar(String descricao) {
        em.getTransaction().begin();
        query=em.createNamedQuery("Cor.findByDescricao").setParameter("descricao", descricao);
        em.getTransaction().commit();
        return (Cor) query.getSingleResult();
    }
}
