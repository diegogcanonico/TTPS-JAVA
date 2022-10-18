package DAOs.impl;

import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import DAOs.interfaces.CategoriaDAO;
import modelo.Categoria;


public class CategoriaDAOImpl extends GenericDAOHibernateJPA<Categoria> implements CategoriaDAO{
	
	public CategoriaDAOImpl() {
		super(Categoria.class);
	}
	
	@Override
	public Categoria getCategoria(String nombre) {
		TypedQuery <Categoria> consulta = this.getEntityManager().createQuery("select u from Categoria u where nombre = :nombre ", Categoria.class);
		consulta.setParameter("nombre", nombre);
		Categoria resultado = null;
		try {
			resultado = consulta.getSingleResult();
		} catch(NoResultException e) {
			System.out.println("La consulta no arroja resultados");
		}
		return resultado;
	}
	
	
	public void borrar(String nombre) {
		TypedQuery <Categoria> consulta = this.getEntityManager().createQuery("select u from Categoria u where nombre = :nombre ", Categoria.class);
		consulta.setParameter("nombre", nombre);
		try {
			Categoria resultado = consulta.getSingleResult();
			this.getEntityManager().remove(resultado);
			
		} catch(NoResultException e) {
			System.out.println("La consulta no arroja resultados");
		}
		
	}

}
