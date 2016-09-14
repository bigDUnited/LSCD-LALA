package facade;

import entity.Client;
import entity.Ticket;
import entity.Vehicle;
import entity.web.Session;
import java.util.List;
public interface FacadeInterface {

    Session logIn( String username, String passwordHash );

    Ticket createReservation( String journeyId, List<Client> listOfClients, List<Vehicle> listOfVehicles, String sessionId );

}
