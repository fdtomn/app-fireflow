package org.fireflow.engine.calendar;

import java.io.Serializable;
import java.util.Date;

public class WfVacation implements Serializable {

	/** 
	* @Fields serialVersionUID
	*/ 
	private static final long serialVersionUID = 1L;
	
	/**
	 * 主键
	 */
	private String id;
	
	/**
	 * 所属年份
	 */
	private String years;
	
	/**
	 * 节假日日期
	 */
	private Date vacationDate;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getYears() {
		return years;
	}

	public void setYears(String years) {
		this.years = years;
	}

	public Date getVacationDate() {
		return vacationDate;
	}

	public void setVacationDate(Date vacationDate) {
		this.vacationDate = vacationDate;
	}

}
