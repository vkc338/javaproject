package inheritence_single_table;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="CJC_karvenagar")
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
