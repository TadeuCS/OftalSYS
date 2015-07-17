/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Cidade;
import Model.Uf;
import Util.Classes.Conexao;
import java.util.List;

/**
 *
 * @author Tadeu
 */
public class CidadeDAO extends Conexao {

    public List<Cidade> listarByEstado(Uf estado) {
        em.getTransaction().begin();
        query = em.createNamedQuery("Cidade.findByCodEstado").setParameter("codestado", estado);
        em.getTransaction().commit();
        return query.getResultList();
    }

    public Cidade buscar(String descricao) {
        em.getTransaction().begin();
        query=em.createNamedQuery("Cidade.findByDescricao").setParameter("descricao", descricao);
        em.getTransaction().commit();
        return (Cidade) query.getSingleResult();
    }
}
