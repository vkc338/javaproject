package inheritence_single_table;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="cjc_Akurdi")
public class Akurdi extends CJC
{
	private String WeekendBatchno;

	public String getWeekendBatchno() {
		return WeekendBatchno;
	}

	public void setWeekendBatchno(String weekendBatchno) {
		WeekendBatchno = weekendBatchno;
	}
	
	
}
