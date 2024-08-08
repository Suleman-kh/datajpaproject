package in.suleman.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="emp")
public class Userdata {
	@Id
	@Column(name="id")
	private int id;

	@Column(name="name")
	private String name;
	
	@Column(name="contact_No")
	private String number;

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	

	

}
