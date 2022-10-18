package DAOs.impl;


import java.util.List;

import javax.persistence.TypedQuery;

import DAOs.interfaces.DonacionDAO;
import modelo.Donacion;

public class DonacionDAOImpl extends GenericDAOHibernateJPA<Donacion> implements DonacionDAO{
	
	public DonacionDAOImpl() {
		super(Donacion.class);
	}
	
	@Override
	public List<Donacion> getDonacionesPorEmprendimiento(String nombreEmprendimiento) {
		
		TypedQuery <Donacion> consulta = this.getEntityManager().createQuery("select e from Donacion e where emprendimiento.id = (select id from Emprendimiento where nombreEmprendimiento = :nombreEmprendimiento) ", Donacion.class);
		consulta.setParameter("nombreEmprendimiento", nombreEmprendimiento);
		List<Donacion> resultado = consulta.getResultList();
		return resultado;
		
	}

}
