package DAOs.impl;

import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import DAOs.interfaces.UsuarioDAO;
import modelo.Rol;
import modelo.Usuario;


public class UsuarioDAOImpl extends GenericDAOHibernateJPA<Usuario> implements UsuarioDAO{
	

	public UsuarioDAOImpl() {
		super(Usuario.class);
	}
	
	@Override
	public Usuario getUsuario(String username) {
		this.getTransaction().begin();
		TypedQuery <Usuario> consulta = this.getEntityManager().createQuery("select u from Usuario u where username = :username ", Usuario.class);
		this.getTransaction().commit();
		consulta.setParameter("username", username);
		Usuario resultado = null;
		try {
			resultado = consulta.getSingleResult();
		} catch(NoResultException e) {
			System.out.println("La consulta no arroja resultados");
		}
		return resultado;
	}
	
	
	@Override
	public void borrar(String username) {
		TypedQuery <Usuario> consulta = this.getEntityManager().createQuery("select u from Usuario u where username = :username ", Usuario.class);
		consulta.setParameter("username", username);
		try {
			Usuario resultado = consulta.getSingleResult();
			this.getTransaction().begin();
			this.getEntityManager().remove(resultado);
			this.getTransaction().commit();
			
		} catch(NoResultException e) {
			System.out.println("La consulta no arroja resultados");
		}
		
	}
	
	@Override
	public List<Usuario> getusuariosPorNombreRol(String nombreRol){
		this.getTransaction().begin();
		TypedQuery <Usuario> consulta = this.getEntityManager().createQuery("select u from Usuario u where rol.id = (select id from Rol where nombre_rol = :nombreRol) ", Usuario.class);
		this.getTransaction().commit();
		consulta.setParameter("nombreRol", nombreRol);
		List<Usuario> resultado = consulta.getResultList();
		return resultado;
	}

}
