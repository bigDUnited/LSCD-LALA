package facade;

import entity.Client;
import entity.Ticket;
import entity.Vehicle;
import entity.web.Session;
import java.util.List;

public class Facade implements FacadeInterface {

    @Override
    public Session logIn( String username, String passwordHash ) {
        throw new UnsupportedOperationException( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Ticket createReservation( String journeyId, List<Client> listOfClients, List<Vehicle> listOfVehicles, String sessionId ) {
        throw new UnsupportedOperationException( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }
    
}
