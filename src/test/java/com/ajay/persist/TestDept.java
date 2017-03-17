package com.ajay.persist;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ajay.persist.contract.IDeptDAO;
import com.ajay.persist.dao.DepartmentDAO;
import com.ajay.persist.domain.DepartmentDO;
import com.ajay.persist.exceptions.PersistException;

public class TestDept {

	private IDeptDAO deptDaoObj = null;

	@Before
	public void setUp() throws Exception {
		deptDaoObj = new DepartmentDAO();
	}

	@After
	public void tearDown() throws Exception {
		deptDaoObj = null;
	}

	@Test
	public void testGetDeptByPkSeq1() {
		Integer deptId = 100;
		DepartmentDO expDeptDo = new DepartmentDO();
		expDeptDo.setDeptId(100);
		try {
			DepartmentDO actDeptDo = deptDaoObj.getDeptByPK(deptId);
			System.out.println(actDeptDo);
			assertEquals(expDeptDo, actDeptDo);
		} catch (PersistException e) {
			e.printStackTrace();
			fail("Exception in processing deptDao");
		}
	}
}
