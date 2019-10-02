package inheritence_join_table;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="Student_ID")
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
