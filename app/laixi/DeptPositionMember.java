package laixi;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity(name="deptPositionMember")
@Cacheable
public class DeptPositionMember implements Serializable{

	@Id
	@Column(name="dpmId")
	private Long dpmId;

	@Column(name="memberId")
	private Long memberId;
	
	
	@Column(name="positionId")
	private Long positionId;
	
	
	@Column(name="createTime")
	private Date createTime;
	
	@Column(name="fullTime")
	private Integer fullTime;
	
	
	@Column(name="defPosition")
	private Integer defPosition;
	
	@Column(name="sort")
	private Integer sort;
	
	
	@Column(name="externalMember")
	private Integer externalMember;
	
	@Column(name="externalMemberId")
	private Long externalMemberId;
	
	@Column(name="isAdmin")
	private Integer isAdmin;
	
	@Column(name="deptId")
	private Long deptId;
	
	
	@Column(name="orgId")
	private Long orgId;
	
	public Long getDpmId() {
		return dpmId;
	}


	public void setDpmId(Long dpmId) {
		this.dpmId = dpmId;
	}


	public Long getMemberId() {
		return memberId;
	}


	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}


	public Long getPositionId() {
		return positionId;
	}


	public void setPositionId(Long positionId) {
		this.positionId = positionId;
	}


	public Date getCreateTime() {
		return createTime;
	}


	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}


	public Integer getFullTime() {
		return fullTime;
	}


	public void setFullTime(Integer fullTime) {
		this.fullTime = fullTime;
	}


	public Integer getDefPosition() {
		return defPosition;
	}


	public void setDefPosition(Integer defPosition) {
		this.defPosition = defPosition;
	}


	public Integer getSort() {
		return sort;
	}


	public void setSort(Integer sort) {
		this.sort = sort;
	}


	public Integer getExternalMember() {
		return externalMember;
	}


	public void setExternalMember(Integer externalMember) {
		this.externalMember = externalMember;
	}


	public Long getExternalMemberId() {
		return externalMemberId;
	}


	public void setExternalMemberId(Long externalMemberId) {
		this.externalMemberId = externalMemberId;
	}


	public Integer getIsAdmin() {
		return isAdmin;
	}


	public void setIsAdmin(Integer isAdmin) {
		this.isAdmin = isAdmin;
	}


	public Long getDeptId() {
		return deptId;
	}


	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}


	public Long getOrgId() {
		return orgId;
	}


	public void setOrgId(Long orgId) {
		this.orgId = orgId;
	}
}
