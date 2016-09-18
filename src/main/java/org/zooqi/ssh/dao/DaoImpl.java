package org.zooqi.ssh.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;
@Transactional
public class DaoImpl implements Dao {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public List<?> list(String hql, Object[] param) {
		return list(hql, param, 0, Integer.MAX_VALUE);
	}

	@Override
	public List<?> list(String hql) {
		return list(hql, null, 0, Integer.MAX_VALUE);
	}

	@Override
	public List<?> list(String hql, Object[] param, int offset, int lenth) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(hql);
		setParameter(query, param);
		query.setFirstResult(offset);
		query.setMaxResults(lenth);
		return query.list();
	}

	@Override
	public List<?> list(String hql, int offset, int lenth) {
		return list(hql, null, offset, lenth);
	}

	@Override
	public void save(Object object) {
		Session session = sessionFactory.getCurrentSession();
		session.save(object);
	}

	@Override
	public void delete(Object object) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(object);
	}

	@Override
	public void update(Object object) {
		Session session = sessionFactory.getCurrentSession();
		session.update(object);
	}

	@Override
	public int update(String hql, Object[] param) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(hql);
		setParameter(query, param);
		return query.executeUpdate();
	}

	@Override
	public int update(String hql) throws RuntimeException {
		return update(hql, null);
	}

	@Override
	public int count(String hql, Object[] param) {
		return list(hql, param).size();
	}

	@Override
	public int count(String hql) {
		return count(hql, null);
	}

	/**
	 * 为Query对象设置参数
	 * 
	 * @param query
	 *            Query对象
	 * @param param
	 *            HQL语句中占位符所代表的参数列表
	 */
	private void setParameter(Query query, Object[] param) {
		if ((param != null) && (param.length != 0)) {
			for (int i = 0; i < param.length; i++) {
				query.setParameter(i, param[i]);
			}
		}
	}
}
