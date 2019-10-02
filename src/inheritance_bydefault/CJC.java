package inheritance_bydefault;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class CJC 
{
	@Id
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
