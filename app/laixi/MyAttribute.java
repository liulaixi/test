package laixi;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.hxrainbow.hxbos.metadb.orm.model.BaseModel;

@Entity(name="entityAttribute")
public class MyAttribute extends BaseModel {

	private static final long serialVersionUID = -4801007284463956727L;

	@Id
	@Column(name="attributeId")
	private int id;
	
	@Column(name="attributeName")
	private String name;
	@Column(name="attributeType")
	private String type;
	@Column(name="storeName")
	private String storeName;
	@Column(name="len")
	private int length;
	
	@Column(name="displayName")
	private String displayName;
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
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	
	
}
