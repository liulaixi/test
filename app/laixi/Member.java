package laixi;

import java.util.Date;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.hxrainbow.hxbos.metadb.orm.obj.DataObject;

@Entity(name="member")
@Cacheable(true)
public class Member extends DataObject{
	
	private static final long serialVersionUID = 5623978733695246670L;
	@Id
	@Column(name="memberId")
	private int id;
	@Column(name="memberName")
	private String name;
	@Column(name="spell")
	private String spell;
	
	@Column(name="loginName")
	private String loginName;
	@Column(name="password")
	private String password;
	@Column(name="createTime")
	private Date createTime;
	@Column(name="updateTime")
	private Date updateTime;
	@Column(name="headPic")
	private String headPic;
	@Column(name="defOrg")
	private int defOrg;
	@Column(name="apiSession")
	private String apiSession;
	@Column(name="checkTime")
	private Date checkTime;
	@Column(name="portalSession")
	private String portalSession;
	@Column(name="adcUserId")
	private int adcUserId;
	@Column(name="sex")
	private int sex;
	@Column(name="jsyUserId")
	private int jsyUserId;
	@Column(name="loginOrg")
	private String loginOrg;
	@Column(name="jsyEcName")
	private String jsyEcname;

	//@Column(name="version")
	//private int version;
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
	public String getSpell() {
		return spell;
	}
	public void setSpell(String spell) {
		this.spell = spell;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	public String getHeadPic() {
		return headPic;
	}
	public void setHeadPic(String headPic) {
		this.headPic = headPic;
	}
	public int getDefOrg() {
		return defOrg;
	}
	public void setDefOrg(int defOrg) {
		this.defOrg = defOrg;
	}
	public String getApiSession() {
		return apiSession;
	}
	public void setApiSession(String apiSession) {
		this.apiSession = apiSession;
	}
	public Date getCheckTime() {
		return checkTime;
	}
	public void setCheckTime(Date checkTime) {
		this.checkTime = checkTime;
	}
	public String getPortalSession() {
		return portalSession;
	}
	public void setPortalSession(String portalSession) {
		this.portalSession = portalSession;
	}
	public int getAdcUserId() {
		return adcUserId;
	}
	public void setAdcUserId(int adcUserId) {
		this.adcUserId = adcUserId;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public int getJsyUserId() {
		return jsyUserId;
	}
	public void setJsyUserId(int jysUserId) {
		this.jsyUserId = jysUserId;
	}
	public String getLoginOrg() {
		return loginOrg;
	}
	public void setLoginOrg(String loginOrg) {
		this.loginOrg = loginOrg;
	}
	public String getJsyEcname() {
		return jsyEcname;
	}
	public void setJsyEcname(String jsyEcname) {
		this.jsyEcname = jsyEcname;
	}
/*	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}*/
	
	
}
