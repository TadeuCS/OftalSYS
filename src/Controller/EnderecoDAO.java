/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Cep;
import Model.Endereco;
import Util.Classes.Manager;
import java.util.List;

/**
 *
 * @author Tadeu
 */
public class EnderecoDAO extends Manager {

    public List<Endereco> listar() {
        em.getTransaction().begin();
        query = em.createNamedQuery("Endereco.findAll");
        em.getTransaction().commit();
        return query.getResultList();
    }
    public Cep findByCEP(String descricao) {
        em.getTransaction().begin();
        query = em.createNamedQuery("Cep.findByCep").setParameter("cep", descricao);
        em.getTransaction().commit();
        return (Cep) query.getSingleResult();
    }

}
