package DAOs.impl;


import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import DAOs.interfaces.EmprendimientoDAO;
import modelo.Emprendimiento;

public class EmprendimientoDAOImpl extends GenericDAOHibernateJPA<Emprendimiento> implements EmprendimientoDAO{
	
	public EmprendimientoDAOImpl() {
		super(Emprendimiento.class);
	}
	
	@Override
	public Emprendimiento getEmprendimientoPorNombre(String nombre) {
		TypedQuery <Emprendimiento> consulta = this.getEntityManager().createQuery("select u from Emprendimiento u where nombre = :nombre ", Emprendimiento.class);
		consulta.setParameter("nombre", nombre);
		Emprendimiento resultado = null;
		try {
			resultado = consulta.getSingleResult();
		} catch(NoResultException e) {
			System.out.println("La consulta no arroja resultados");
		}
		return resultado;
	}
	
	@Override
	public Emprendimiento getEmprendimientoPorUsuario(String username){
		TypedQuery <Emprendimiento> consulta = this.getEntityManager().createQuery("select e from Emprendimiento e where usuario.id = (select id from Usuario where username = :username) ", Emprendimiento.class);
		consulta.setParameter("username", username);
		Emprendimiento resultado = consulta.getSingleResult();
		return resultado;
		
	}
	
	@Override
	public void borrarPorNombre(String nombre) {
		TypedQuery <Emprendimiento> consulta = this.getEntityManager().createQuery("select u from Emprendimiento u where nombre = :nombre ", Emprendimiento.class);
		consulta.setParameter("nombre", nombre);
		try {
			Emprendimiento resultado = consulta.getSingleResult();
			this.getEntityManager().remove(resultado);
			
		} catch(NoResultException e) {
			System.out.println("La consulta no arroja resultados");
		}
	}

}
