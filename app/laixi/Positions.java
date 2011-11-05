package laixi;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.hxrainbow.hxbos.metadb.orm.mdb.MDBAttribute;
import com.hxrainbow.hxbos.metadb.orm.mdb.MDBStore;

@Entity(name="position")
@Cacheable
public class Positions implements Serializable {

	@Id
	@Column(name="positionId")
	private Long positionId;
	@Column(name="positionName")
	private String positionName;
	@Column(name="sort")
	private Integer sort;
	@Column(name="externalPosition")
	private Integer externalPosition;
	@Column(name="externalPositionId")
	private Long externalPositionId;
	@Column(name="supervisor")
	private Integer supervisor;
	@Column(name="deptId")
	private Long deptId;
	@Column(name="orgId")
	private Long orgId;
	@Column(name="levelId")
	private Long levelId;
	@Column(name="typeId")
	private Long typeId;
	
	
	@OneToMany(targetEntity=DeptPositionMember.class)
	@JoinColumn(name="positionId",referencedColumnName="positionId")
	@MapKeyColumn(name="memberId")
	private Map<Long, DeptPositionMember> dpmMap=new HashMap<Long, DeptPositionMember>();
	
	public Map<Long, DeptPositionMember> getDpmMap() {
		return dpmMap;
	}
	
	public DeptPositionMember getDpm(Long name){
		return	getDpmMap().get(name);
	}
	
	public void setDpmMap(Map<Long, DeptPositionMember> dpmMap) {
		this.dpmMap = dpmMap;
	}
	public Long getPositionId() {
		return positionId;
	}
	public void setPositionId(Long positionId) {
		this.positionId = positionId;
	}
	public String getPositionName() {
		return positionName;
	}
	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}
	public Integer getSort() {
		return sort;
	}
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	public Integer getExternalPosition() {
		return externalPosition;
	}
	public void setExternalPosition(Integer externalPosition) {
		this.externalPosition = externalPosition;
	}
	public Long getExternalPositionId() {
		return externalPositionId;
	}
	public void setExternalPositionId(Long externalPositionId) {
		this.externalPositionId = externalPositionId;
	}
	public Integer getSupervisor() {
		return supervisor;
	}
	public void setSupervisor(Integer supervisor) {
		this.supervisor = supervisor;
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
	public Long getLevelId() {
		return levelId;
	}
	public void setLevelId(Long levelId) {
		this.levelId = levelId;
	}
	public Long getTypeId() {
		return typeId;
	}
	public void setTypeId(Long typeId) {
		this.typeId = typeId;
	}
	
	
	
	
}
