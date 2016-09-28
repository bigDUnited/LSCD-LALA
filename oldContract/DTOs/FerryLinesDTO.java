import java.util.List;

public class FerryLinesDTO {
	List<FerryLineSummary> ferryLinesList;
	
	public class FerryLineSummary {
		String ferryId;
		String ferryName;
		String ferryLineId;
		String from;
		String to;
	}
}

