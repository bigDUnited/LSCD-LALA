public interface Facade {
	ReservationSummaryDTO makeReservation (String journeyId, int numOfPeople, String vehicleType);
	JourneysDTO getJourneys (String ferryLineId);
	AvailabilityDTO getAvailability (String journeyId);
	FerryLinesDTO listFerryLines();
	JourneysDTO createJourney (Date date, String ferryId, String ferryLineId);
	boolean deleteJourney (String journeyId);
}
