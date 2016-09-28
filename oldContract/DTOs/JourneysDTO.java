import java.util.Date;
import java.util.List;

public class JourneysDTO {
	List<JourneySummary> journeysList;
	String from;
	String to;
	
	public class JourneySummary {
		Date date; 
		String journeyId;
	}
}
