package inheritence_join_table;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import javax.persistence.PrimaryKeyJoinColumn;
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
/*@PrimaryKeyJoinColumn(name="Studentid")*/

public class CJC 
{
	@Id
	@Column(name="Student_id")
	private int Sid;
	private String Name;
	private String Address;
	public int getSid() {
		return Sid;
	}
	public void setSid(int sid) {
		Sid = sid;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
}
