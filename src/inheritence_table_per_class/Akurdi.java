package inheritence_table_per_class;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
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
