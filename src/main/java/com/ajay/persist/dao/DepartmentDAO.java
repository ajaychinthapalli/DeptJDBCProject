package com.ajay.persist.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.ajay.persist.contract.IDeptDAO;
import com.ajay.persist.domain.DepartmentDO;
import com.ajay.persist.exceptions.PersistException;
import com.ajay.persist.util.DataBaseUtil;

public class DepartmentDAO implements IDeptDAO {

	public DepartmentDO getDeptByPK(Integer deptId) throws PersistException {
		DepartmentDO deptDo = null;
		Connection xeHrDbConnObj = null;
		Statement deptSelectStmt = null;
		ResultSet deptResultSet = null;
		try {
			xeHrDbConnObj = DataBaseUtil.getDBConnection();
			deptSelectStmt = xeHrDbConnObj.createStatement();
			String strSql = "SELECT * FROM DEPARTMENTS WHERE DEPARTMENT_ID = "
					+ deptId;
			deptResultSet = deptSelectStmt.executeQuery(strSql);
			deptDo = new DepartmentDO();
			while (deptResultSet.next()) {
				deptDo.setDeptId(deptResultSet.getInt("DEPARTMENT_ID"));
				deptDo.setDeptName(deptResultSet.getString("DEPARTMENT_NAME"));
				deptDo.setLocationId(deptResultSet.getInt("LOCATION_ID"));
				deptDo.setManagerId(deptResultSet.getInt("MANAGER_ID"));
			}
		} catch (SQLException e) {
			throw new PersistException(
					"Excception in Department DAO Processing Code ", e);
		} finally {
			DataBaseUtil.closeResultset(deptResultSet);
			DataBaseUtil.closeStatement(deptSelectStmt);
			DataBaseUtil.closeConnection(xeHrDbConnObj);
		}
		return deptDo;
	}

}
