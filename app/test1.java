import javax.persistence.Column;
import javax.persistence.Id;


public class test1 {
	
	public test1(Long id,String name){
		this.id = id;
		this.name = name;
	}
	
	@Id
	@Column(name="memberId")
	private Long id;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name="memberName")
	private String name;

}

