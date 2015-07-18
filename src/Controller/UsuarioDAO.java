/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.TipoUsuario;
import Model.Usuario;
import Util.Classes.Conexao;
import java.util.List;

/**
 *
 * @author Tadeu
 */
public class UsuarioDAO extends Conexao {

    public void salvar(Usuario usuario) {
        em.getTransaction().begin();
        em.merge(usuario);
        em.getTransaction().commit();
    }

    public List<Usuario> lista() {
        em.getTransaction().begin();
        query = em.createNamedQuery("Usuario.findAll");
        em.getTransaction().commit();
        return query.getResultList();
    }

    public List<Usuario> listaByTipo(TipoUsuario tipo) {
        em.getTransaction().begin();
        query = em.createNamedQuery("Usuario.findByCodTipoUsuario").setParameter("codtipousuario", tipo);
        em.getTransaction().commit();
        return query.getResultList();
    }

    public Usuario buscar(String nome) {
        em.getTransaction().begin();
        query = em.createNamedQuery("Usuario.findByUsuario").setParameter("usuario", nome);
        em.getTransaction().commit();
        return (Usuario) query.getSingleResult();
    }

    public Usuario findByUsuarioAndSenha(String nome, String senha) {
        em.getTransaction().begin();
        query = em.createQuery("SELECT u FROM Usuario u where u.usuario = :nome and u.senha = :pass")
                .setParameter("nome", nome).setParameter("pass", senha);
        em.getTransaction().commit();
        return (Usuario) query.getSingleResult();
    }
}
