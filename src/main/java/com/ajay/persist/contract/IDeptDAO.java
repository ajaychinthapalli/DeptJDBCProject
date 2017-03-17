package com.ajay.persist.contract;

import com.ajay.persist.domain.DepartmentDO;
import com.ajay.persist.exceptions.PersistException;

public interface IDeptDAO {

	public DepartmentDO getDeptByPK(Integer deptId) throws PersistException;

}
