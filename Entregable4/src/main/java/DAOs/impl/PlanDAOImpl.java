package DAOs.impl;


import java.util.List;

import javax.persistence.TypedQuery;

import DAOs.interfaces.PlanDAO;
import modelo.Plan;

public class PlanDAOImpl extends GenericDAOHibernateJPA<Plan> implements PlanDAO{
	
	public PlanDAOImpl() {
		super(Plan.class);
	}
	
	@Override
	public List<Plan> getPlanesPorNombreEmprendimiento(String nombre){
		
		TypedQuery <Plan> consulta = this.getEntityManager().createQuery("select e from Plan e where emprendimiento.id = (select id from Emprendimiento where nombre = :nombre) ", Plan.class);
		consulta.setParameter("nombre", nombre);
		List<Plan> resultado = consulta.getResultList();
		return resultado;
		
	}
	
}
