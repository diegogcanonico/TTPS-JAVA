package DAOs.impl;

import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import DAOs.interfaces.RedSocialDAO;
import modelo.Emprendimiento;
import modelo.RedSocial;

public class RedSocialDAOImpl extends GenericDAOHibernateJPA<RedSocial> implements RedSocialDAO{
	
	public RedSocialDAOImpl() {
		super(RedSocial.class);
	}
	
	@Override
	public List<RedSocial> getRedesPorNombreEmprendimiento(String nombre){
		
		TypedQuery <RedSocial> consulta = this.getEntityManager().createQuery("select e from RedSocial e where emprendimiento.id = (select id from Emprendimiento where nombre = :nombre) ", RedSocial.class);
		consulta.setParameter("nombre", nombre);
		List<RedSocial> resultado = consulta.getResultList();
		return resultado;
		
	}
	
	@Override
	public void borrarPorDominio(String dominio) {
		TypedQuery <RedSocial> consulta = this.getEntityManager().createQuery("select r from RedSocial r where dominio = :dominio ", RedSocial.class);
		consulta.setParameter("dominio", dominio);
		try {
			RedSocial resultado = consulta.getSingleResult();
			this.getEntityManager().remove(resultado);
			
		} catch(NoResultException e) {
			System.out.println("La consulta no arroja resultados");
		}
	}

}
