package org.zooqi.ssh.domain;

import java.sql.Date;

/**
 * Created by zooqi on 2016/9/18.
 */
public class Title {
    private int empNo;
    private String title;
    private Date fromDate;
    private Date toDate;

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

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Title title1 = (Title) o;

        if (empNo != title1.empNo) return false;
        if (title != null ? !title.equals(title1.title) : title1.title != null) return false;
        if (fromDate != null ? !fromDate.equals(title1.fromDate) : title1.fromDate != null) return false;
        if (toDate != null ? !toDate.equals(title1.toDate) : title1.toDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = empNo;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (fromDate != null ? fromDate.hashCode() : 0);
        result = 31 * result + (toDate != null ? toDate.hashCode() : 0);
        return result;
    }
}
