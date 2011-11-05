package laixi;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.OneToMany;

import com.hxrainbow.hxbos.metadb.orm.model.BaseModel;
@Entity(name="entity")
@Cacheable
public class MyEntity extends BaseModel implements Serializable{

	private static final long serialVersionUID = -2655990066796329113L;

	@Id
	@Column(name="entityId")
	private int id;
	@Column(name="entityName")
	private String name;
	@Column(name="entityType")
	private String type;
	@Column(name="author")
	private String author;
	@Column(name="description")
	private String description;
	@Column(name="createTime")
	private Date createTime;
	@Column(name="updateTime")
	private Date updateTime;
	@Column(name="displayName")
	private String displayName;
	@Column(name="isLogic")
	private int logic;
	
	@OneToMany(targetEntity=MyAttribute.class)
	@JoinColumn(name="entityId",referencedColumnName="entityId")
	@MapKeyColumn(name="attributeName")
	private Map<String,MyAttribute> attributeMap;
	@OneToMany(targetEntity=MyStore.class)
	@JoinColumn(name="entityId",referencedColumnName="entityId")
	@MapKeyColumn(name="storeName")
	private Map<String,MyStore> storeMap;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public int getLogic() {
		return logic;
	}
	public void setLogic(int logic) {
		this.logic = logic;
	}
	public Map<String, MyAttribute> getAttributeMap() {
		return attributeMap;
	}
	public void setAttributeMap(Map<String, MyAttribute> attributeMap) {
		this.attributeMap = attributeMap;
	}
	public Map<String, MyStore> getStoreMap() {
		return storeMap;
	}
	public void setStoreMap(Map<String, MyStore> storeMap) {
		this.storeMap = storeMap;
	}
	
	
}
