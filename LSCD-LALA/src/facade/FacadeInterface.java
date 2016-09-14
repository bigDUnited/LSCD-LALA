package facade;

import entity.Client;
import entity.Ticket;
import entity.Vehicle;
import java.util.List;
import javax.servlet.http.HttpSession;

public interface FacadeInterface {

    HttpSession logIn( String username, String passwordHash );

    Ticket createReservation( String journeyId, List<Client> listOfClients, List<Vehicle> listOfVehicles, String sessionId );

}
