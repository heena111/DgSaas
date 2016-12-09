package com.dataguise.saas.dao.util;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author Harinder Singh Bedi
 *
 * @param <T>
 */
@Repository
public class DgHibernateUtil<T> {
	
	/**
	 * 
	 */
	@Autowired
	private SessionFactory sessionFactory;

	/**
	 * @param entity
	 * @return
	 */
	public Serializable create(final T entity) {
		return sessionFactory.getCurrentSession().save(entity);
	}
	/**
	 * @param entity
	 * @return
	 */
	public T update(final T entity) {
		sessionFactory.getCurrentSession().update(entity);
		return entity;
	}
	/**
	 * @param entity
	 */
	public void delete(final T entity) {
		sessionFactory.getCurrentSession().delete(entity);
	}
	/**
	 * @param id
	 * @param entityClass
	 */
	public void delete(Serializable id, Class<T> entityClass) {
		T entity = fetchById(id, entityClass);
		delete(entity);
	}

	/**
	 * @param entityClass
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<T> fetchAll(Class<T> entityClass) {
		return sessionFactory.getCurrentSession().createQuery(" FROM "+entityClass.getName()).list();
	}

	/**
	 * @param query
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public List fetchAll(String query) {
		return sessionFactory.getCurrentSession().createSQLQuery(query).list();
	}

	/**
	 * @param id
	 * @param entityClass
	 * @return
	 */
	public T fetchById(Serializable id, Class<T> entityClass) {
		return (T)sessionFactory.getCurrentSession().get(entityClass, id);
	}

	public Long fetchIdIfConditionFulfilled(String query,Map<String,Object> parameters){
		Query hqlQuery=sessionFactory.getCurrentSession().createQuery(query);
		Iterator iterator = parameters.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<String,Object> pair = (Map.Entry)iterator.next();
			hqlQuery.setParameter(pair.getKey(), pair.getValue());
		}
		Object Id=hqlQuery.uniqueResult();
		if(Id==null)
			return 0L;

		return (Long)Id;
	}

} 