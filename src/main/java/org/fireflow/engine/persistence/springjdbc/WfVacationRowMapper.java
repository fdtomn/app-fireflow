package org.fireflow.engine.persistence.springjdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.fireflow.engine.calendar.WfVacation;
import org.springframework.jdbc.core.RowMapper;

public class WfVacationRowMapper implements RowMapper {

	
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		WfVacation wfVacation=new WfVacation();
		wfVacation.setId(rs.getString("id"));
		wfVacation.setYears(rs.getString("years"));
		wfVacation.setVacationDate(rs.getTimestamp("vacation_date"));
		return wfVacation;
	}

}
