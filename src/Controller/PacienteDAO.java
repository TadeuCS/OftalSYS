/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Paciente;
import Util.Classes.Conexao;
import java.util.List;

/**
 *
 * @author Tadeu
 */
public class PacienteDAO extends Conexao {

    public void salvar(Paciente paciente){
        em.getTransaction().begin();
        em.merge(paciente);
        em.getTransaction().commit();
    }
    public void remover(Paciente paciente){
        em.getTransaction().begin();
        em.remove(paciente);
        em.getTransaction().commit();
    }
    
    public List<Paciente> listar() {
        em.getTransaction().begin();
        query = em.createNamedQuery("Paciente.findAll");
        em.getTransaction().commit();
        return query.getResultList();
    }
    
    public Paciente findByNome(String nome) {
        em.getTransaction().begin();
        query=em.createNamedQuery("Paciente.findByNome").setParameter("nome", nome);
        em.getTransaction().commit();
        return (Paciente) query.getSingleResult();
    }
    public Paciente buscar(int codigo) {
        em.getTransaction().begin();
        query=em.createNamedQuery("Paciente.findByCodpaciente").setParameter("codpaciente", codigo);
        em.getTransaction().commit();
        return (Paciente) query.getSingleResult();
    }
}
