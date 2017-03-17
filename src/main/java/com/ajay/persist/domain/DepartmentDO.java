package com.ajay.persist.domain;

import java.io.Serializable;

public class DepartmentDO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1541846522520454250L;
	private Integer deptId;
	private String deptName;
	private Integer managerId;
	private Integer locationId;

	public DepartmentDO() {
		super();
	}

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Integer getManagerId() {
		return managerId;
	}

	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}

	public Integer getLocationId() {
		return locationId;
	}

	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((deptId == null) ? 0 : deptId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DepartmentDO other = (DepartmentDO) obj;
		if (deptId == null) {
			if (other.deptId != null)
				return false;
		} else if (!deptId.equals(other.deptId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DepartmentDO [deptId=" + deptId + ", deptName=" + deptName
				+ ", managerId=" + managerId + ", locationId=" + locationId
				+ "]";
	}

}
