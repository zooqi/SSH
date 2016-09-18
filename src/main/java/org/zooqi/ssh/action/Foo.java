package org.zooqi.ssh.action;

import java.util.List;

import org.zooqi.ssh.dao.Dao;
import org.zooqi.ssh.domain.Title;

import com.opensymphony.xwork2.ActionSupport;

public class Foo extends ActionSupport {

	private Dao dao;
	private static final long serialVersionUID = 1077977139332543640L;

	public void setDao(Dao dao) {
		this.dao = dao;
	}

	@SuppressWarnings("unchecked")
	@Override
	public String execute() {
		List<Title> list = (List<Title>) dao.list("from Title", 0, 1);
		System.out.println(list.get(0).getTitle());
		return SUCCESS;
	}
}
