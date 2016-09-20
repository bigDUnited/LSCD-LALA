import java.util.List;

public class FerryLinesDTO {
	List<FerryLineSummary> ferryLinesList;
	
	public class FerryLineSummary {
		String ferryLineId;
		String from;
		String to;
		String ferryName;
	}
}

