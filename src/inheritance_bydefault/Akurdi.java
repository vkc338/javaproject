package inheritance_bydefault;

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
