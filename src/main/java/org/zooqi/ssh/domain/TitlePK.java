package org.zooqi.ssh.domain;

import java.io.Serializable;
import java.sql.Date;

/**
 * Created by zooqi on 2016/9/18.
 */
public class TitlePK implements Serializable {

	private static final long serialVersionUID = 4533134781173627590L;

	private int empNo;
	private String title;
	private Date fromDate;

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		TitlePK titlePK = (TitlePK) o;

		if (empNo != titlePK.empNo)
			return false;
		if (title != null ? !title.equals(titlePK.title) : titlePK.title != null)
			return false;
		if (fromDate != null ? !fromDate.equals(titlePK.fromDate) : titlePK.fromDate != null)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = empNo;
		result = 31 * result + (title != null ? title.hashCode() : 0);
		result = 31 * result + (fromDate != null ? fromDate.hashCode() : 0);
		return result;
	}
}
