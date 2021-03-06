/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Atendimento;
import Model.Paciente;
import Util.Classes.Conexao;
import java.util.List;

/**
 *
 * @author Tadeu
 */
public class AtendimentoDAO extends Conexao {

    public void salvar(Atendimento att) {
        em.getTransaction().begin();
        em.merge(att);
        em.getTransaction().commit();
    }

    public void remove(Atendimento att) {
        em.getTransaction().begin();
        em.remove(att);
        em.getTransaction().commit();
    }

    public List<Atendimento> listar() {
        em.getTransaction().begin();
        query = em.createNamedQuery("Atendimento.findAll");
        em.getTransaction().commit();
        return query.getResultList();
    }

    public Atendimento buscar(int codigo) {
        em.getTransaction().begin();
        query = em.createNamedQuery("Atendimento.findByCodatendimento").setParameter("codatendimento", codigo);
        em.getTransaction().commit();
        return (Atendimento) query.getSingleResult();
    }

    public List<Atendimento> listarByPaciente(Paciente paciente) {
        em.getTransaction().begin();
        query = em.createNamedQuery("Atendimento.findByCodpaciente").setParameter("codpaciente", paciente);
        em.getTransaction().commit();
        return query.getResultList();
    }
}
