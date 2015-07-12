/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Paciente;
import Util.Classes.Manager;
import java.util.List;

/**
 *
 * @author Tadeu
 */
public class PacienteDAO extends Manager {

    public List<Paciente> listar() {
        em.getTransaction().begin();
        query = em.createNamedQuery("Paciente.findAll");
        em.getTransaction().commit();
        return query.getResultList();
    }

    public Paciente buscar(int codigo) {
        em.getTransaction().begin();
        query=em.createNamedQuery("Paciente.findByCodpaciente").setParameter("codpaciente", codigo);
        em.getTransaction().commit();
        return (Paciente) query.getSingleResult();
    }
}
