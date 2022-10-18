package DAOs.impl;

import java.util.List;

import javax.persistence.TypedQuery;

import DAOs.interfaces.PosteoDAO;
import modelo.Posteo;

public class PosteoDAOImpl extends GenericDAOHibernateJPA<Posteo> implements PosteoDAO{
	
	public PosteoDAOImpl() {
		super(Posteo.class);
	}
	
	@Override
	public List<Posteo> getPosteosPorNombreEmprendimiento(String nombre){
		
		TypedQuery <Posteo> consulta = this.getEntityManager().createQuery("select e from Posteo e where emprendimiento.id = (select id from Emprendimiento where nombre = :nombre) ", Posteo.class);
		consulta.setParameter("nombre", nombre);
		List<Posteo> resultado = consulta.getResultList();
		return resultado;
		
	}

}
