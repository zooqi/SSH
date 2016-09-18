package org.zooqi.ssh.dao;

import java.util.List;

public interface Dao {
	/**
	 * 执行一次查询
	 * 
	 * @param hql
	 *            HQL语句
	 * @param param
	 *            HQL语句中占位符所代表的参数列表
	 * @return 存放所有记录对象的List
	 */
	public List<?> list(String hql, Object[] param);

	/**
	 * 执行一次查询
	 * 
	 * @param hql
	 *            HQL语句
	 * @return 存放所有记录对象的List
	 */
	public List<?> list(String hql);

	/**
	 * 执行一次查询，可指定需要的记录
	 * 
	 * @param hql
	 *            HQL语句
	 * @param param
	 *            HQL语句中占位符所代表的参数列表
	 * @param offset
	 *            第一条记录所在位置，从0开始计数
	 * @param lenth
	 *            记录的条数
	 * @return 存放所有记录对象的List
	 */
	public List<?> list(String hql, Object[] param, int offset, int lenth);

	/**
	 * 执行一次查询，可指定需要的记录
	 * 
	 * @param hql
	 *            HQL语句
	 * @param offset
	 *            第一条记录所在位置，从0开始计数
	 * @param lenth
	 *            记录的条数
	 * @return 存放所有记录对象的List
	 */
	public List<?> list(String hql, int offset, int lenth);

	/**
	 * 保存一条记录
	 * 
	 * @param object
	 *            需要保存的记录对象
	 */
	public void save(Object object);

	/**
	 * 删除一条记录
	 * 
	 * @param object
	 *            需要删除的记录对象
	 */
	public void delete(Object object);

	/**
	 * 执行一次更新
	 * 
	 * @param object
	 *            需要更新的记录对象
	 */
	public void update(Object object);

	/**
	 * 执行一次更新
	 * 
	 * @param hql
	 *            HQL语句
	 * @param param
	 *            HQL语句中占位符所代表的参数列表
	 * @return 受影响的行数
	 */
	public int update(String hql, Object[] param);

	/**
	 * 执行一次更新
	 * 
	 * @param hql
	 *            HQL语句
	 * @return 受影响的行数
	 */
	public int update(String hql);

	/**
	 * 获得记录条数
	 * 
	 * @param hql
	 *            HQL语句
	 * @param param
	 *            HQL语句中占位符所代表的参数列表
	 * @return 记录条数
	 */
	public int count(String hql, Object[] param);

	/**
	 * 获得记录条数
	 * 
	 * @param hql
	 *            HQL语句
	 * @return 记录条数
	 */
	public int count(String hql);
}
