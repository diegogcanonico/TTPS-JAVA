package DAOs.impl;

import javax.persistence.TypedQuery;

import DAOs.interfaces.RolDAO;
import modelo.Rol;

public class RolDAOImpl extends GenericDAOHibernateJPA<Rol> implements RolDAO{
	
	public RolDAOImpl() {
		super(Rol.class);
	}
	
	@Override
	public Rol getRolPorUsername(String username) {
		TypedQuery <Rol> consulta = this.getEntityManager().createQuery("select r from Rol r where usuario.id = (select id from Usuario where username = :username) ", Rol.class);
		consulta.setParameter("username", username);
		Rol resultado = consulta.getSingleResult();
		return resultado;
	}

}
