package DAOs.impl;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import DAOs.EMF;
import DAOs.interfaces.GenericDAO;

@Transactional
public class GenericDAOHibernateJPA<T> implements GenericDAO<T>{
	
	private EntityManager entityManager = EMF.getEMF().createEntityManager();
	private EntityTransaction transaction = entityManager.getTransaction();
	protected Class<T> persistentClass;
	
	@PersistenceContext
	public void setEntityManajer(EntityManager em) {
		this.entityManager = em;
	}
	
	public EntityManager getEntityManager() {
		return this.entityManager;
	}
	
	
	
	public EntityTransaction getTransaction() {
		return transaction;
	}

	public void setTransaction(EntityTransaction transaction) {
		this.transaction = transaction;
	}

	public GenericDAOHibernateJPA(Class<T> clase) {
		this.persistentClass = clase;
	}
	
	public Class<T> getPersistentClass(){
		return this.persistentClass;
	}
	
	@Override
	public T persistir(T entity) {
		transaction.begin();
		this.getEntityManager().persist(entity);
		transaction.commit();
		return entity;
	}
	
	@Override
	public T actualizar(T entity) {
		transaction.begin();
		this.getEntityManager().merge(entity);
		transaction.commit();
		return entity;
	}
	
	@Override
	public void borrar(T entity) {
		transaction.begin();
		this.getEntityManager().remove(entity);
		transaction.commit();
	}
	
	@Override 
	public T borrar(Serializable id) {
		T entity = this.getEntityManager().find(this.getPersistentClass(), id);
		if(entity != null) {
			transaction.begin();
			this.borrar(entity);
			transaction.commit();
		}
		return entity;
	}
	
	
	@Override
	public List<T> recuperarTodos(String column){
		transaction.begin();
		Query consulta = this.getEntityManager()
				.createQuery("select e from " + getPersistentClass().getSimpleName() + " e order by e." + column);
		List<T> resultadoConsulta = (List<T>)consulta.getResultList();
		transaction.commit();
		return resultadoConsulta;
	}
	
	@Override
	public boolean existe(Serializable id) {
		return recuperar(id) != null;
	}
	
	@Override
	public T recuperar(Serializable id) {
		T resultado = null;
		try {
			transaction.begin();
			Query consulta = this.getEntityManager().
					createNamedQuery("select e from "+getPersistentClass().getSimpleName() + " e where id = :id ");
			consulta.setParameter("id", id);
			transaction.commit();
			resultado = (T)consulta.getSingleResult();
		} catch (NoResultException e){
			System.out.println("La consulta no arroja resultados");
		}
		return resultado;
	}

}
