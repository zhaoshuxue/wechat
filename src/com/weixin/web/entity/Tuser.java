package com.weixin.web.entity;
// Generated 2014-6-27 15:52:44 by Hibernate Tools 3.2.2.GA

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Tuser generated by hbm2java
 */
@Entity
@Table(name = "tuser")
public class Tuser implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "ID", nullable = false, length = 36)
	private String id;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "pid")
	private Tuser tuser;
	
	@Column(name = "USERNAME")
	private String userName;
	
	@Column(name = "PASSWORD")
	private String passWord;
	
	@Column(name = "USERNUMBER")
	private String userNumber;
	
	@Column(name = "CREATETIME")
	private String createTime;
	
	@Column(name = "ISCANCEL")
	private String isCancel;
	
	@Column(name = "REMARK")
	private String remark;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tuser", targetEntity = Tuser.class)
	private Set tusers = new HashSet(0);
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tuser")
	private Set<TuserRole> tuserRoles = new HashSet<TuserRole>(0);

	public Tuser() {
	}

	public Tuser(String id) {
		this.id = id;
	}

	public Tuser(String id, Tuser tuser, String userName, String passWord,
			String userNumber, String createTime, String isCancel,
			String remark, Set tusers, Set<TuserRole> tuserRoles) {
		this.id = id;
		this.tuser = tuser;
		this.userName = userName;
		this.passWord = passWord;
		this.userNumber = userNumber;
		this.createTime = createTime;
		this.isCancel = isCancel;
		this.remark = remark;
		this.tusers = tusers;
		this.tuserRoles = tuserRoles;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Tuser getTuser() {
		return this.tuser;
	}

	public void setTuser(Tuser tuser) {
		this.tuser = tuser;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return this.passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getUserNumber() {
		return this.userNumber;
	}

	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getIsCancel() {
		return this.isCancel;
	}

	public void setIsCancel(String isCancel) {
		this.isCancel = isCancel;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Set getTusers() {
		return this.tusers;
	}

	public void setTusers(Set tusers) {
		this.tusers = tusers;
	}

	public Set<TuserRole> getTuserRoles() {
		return this.tuserRoles;
	}

	public void setTuserRoles(Set<TuserRole> tuserRoles) {
		this.tuserRoles = tuserRoles;
	}

}