package com.weixin.web.entity;
// Generated 2014-6-27 15:52:44 by Hibernate Tools 3.2.2.GA

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Trole generated by hbm2java
 */
@Entity
@Table(name = "trole")
public class Trole implements java.io.Serializable {

	@Id
	@Column(name = "ID", nullable = false, length = 36)
	private String id;
	
	@Column(name = "ROLENAME")
	private String roleName;
	

	@Column(name = "ROLENUMBER")
	private String roleNumber;

	@Column(name = "ISCANCEL")
	private String isCancel;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "trole", targetEntity = TuserRole.class)
	private Set tuserRoles = new HashSet(0);
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "trole", targetEntity = TrolePrivilege.class)
	private Set trolePrivileges = new HashSet(0);

	public Trole() {
	}

	public Trole(String id) {
		this.id = id;
	}

	public Trole(String id, String roleName, String roleNumber,
			String isCancel, Set tuserRoles, Set trolePrivileges) {
		this.id = id;
		this.roleName = roleName;
		this.roleNumber = roleNumber;
		this.isCancel = isCancel;
		this.tuserRoles = tuserRoles;
		this.trolePrivileges = trolePrivileges;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleNumber() {
		return this.roleNumber;
	}

	public void setRoleNumber(String roleNumber) {
		this.roleNumber = roleNumber;
	}

	public String getIsCancel() {
		return this.isCancel;
	}

	public void setIsCancel(String isCancel) {
		this.isCancel = isCancel;
	}

	public Set getTuserRoles() {
		return this.tuserRoles;
	}

	public void setTuserRoles(Set tuserRoles) {
		this.tuserRoles = tuserRoles;
	}

	public Set getTrolePrivileges() {
		return this.trolePrivileges;
	}

	public void setTrolePrivileges(Set trolePrivileges) {
		this.trolePrivileges = trolePrivileges;
	}

}
