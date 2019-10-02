package inheritence_join_table;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="Student_ID")
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
