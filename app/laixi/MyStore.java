package laixi;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.hxrainbow.hxbos.metadb.orm.model.BaseModel;

@Entity(name="entityStore")
public class MyStore extends BaseModel {

	private static final long serialVersionUID = 3258720221942016323L;

	@Id
	@Column(name="storeId")
	private int id;
	@Column(name="storeName")
	private String name;
	@Column(name="ownerType")
	private String ownerType;
	@Column(name="status")
	private String status;
	@Column(name="createTime")
	private Date createTime;
	@Column(name="updateTime")
	private Date updateTime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOwnerType() {
		return ownerType;
	}
	public void setOwnerType(String ownerType) {
		this.ownerType = ownerType;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
	
}
