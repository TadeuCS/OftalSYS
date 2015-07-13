/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Paciente;
import Model.Telefone;
import Util.Classes.Manager;
import java.util.List;

/**
 *
 * @author Tadeu
 */
public class TelefoneDAO extends Manager {

    public void remover(Telefone telefone){
        em.getTransaction().begin();
        em.remove(telefone);
        em.getTransaction().commit();
    }
    public List<Telefone> listar() {
        em.getTransaction().begin();
        query = em.createNamedQuery("Telefone.findAll");
        em.getTransaction().commit();
        return query.getResultList();
    }
    public List<Telefone> listarbyPaciente(Paciente paciente) {
        em.getTransaction().begin();
        query = em.createNamedQuery("Telefone.findByPaciente").setParameter("codpaciente", paciente);
        em.getTransaction().commit();
        return query.getResultList();
    }

    public Telefone buscar(String descricao) {
        em.getTransaction().begin();
        query=em.createNamedQuery("Telefone.findByNumero").setParameter("numero", descricao);
        em.getTransaction().commit();
        return (Telefone) query.getSingleResult();
    }
}
