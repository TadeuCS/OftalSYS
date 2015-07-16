/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.TipoUsuario;
import Model.Usuario;
import Util.Classes.Manager;
import java.util.List;

/**
 *
 * @author Tadeu
 */
public class UsuarioDAO extends Manager{
    
    public void salvar(Usuario usuario){
        em.getTransaction().begin();
        em.merge(usuario);
        em.getTransaction().commit();
    }
    
    public List<Usuario> lista(){
        em.getTransaction().begin();
        query=em.createNamedQuery("Usuario.findAll");
        em.getTransaction().commit();
        return query.getResultList();
    }
    public List<Usuario> listaByTipo(TipoUsuario tipo){
        em.getTransaction().begin();
        query=em.createNamedQuery("Usuario.findByCodTipoUsuario").setParameter("codtipousuario", tipo);
        em.getTransaction().commit();
        return query.getResultList();
    }
    
    public Usuario buscar(String nome){
        em.getTransaction().begin();
        query=em.createNamedQuery("Usuario.findByUsuario").setParameter("usuario", nome);
        em.getTransaction().commit();
        return (Usuario) query.getSingleResult();
    }

    public Object findByUsuarioAndSenha(String nome, String senha) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
