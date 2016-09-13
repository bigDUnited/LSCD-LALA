public interface Facade {
	Session logIn (String username, String passwordHash);
	ticket createReservation (String journeyId, listOfClients, listOfVehicles, sessionId);
}
