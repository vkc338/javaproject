package inheritance_bydefault;

import javax.persistence.Entity;

@Entity
public class Karvenagar extends CJC
{
	private String RegularBatchno;

	public String getRegularBatchno() {
		return RegularBatchno;
	}

	public void setRegularBatchno(String regularBatchno) {
		RegularBatchno = regularBatchno;
	}
	

}
