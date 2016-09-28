package Facade;

import entity.Client;
import entity.Ticket;
import entity.Vehicle;
import entity.VehicleType;
import entity.web.Session;
import facade.Facade;
import facade.FacadeInterface;
import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class Facade_Test {

    //facade
    private static FacadeInterface facade;

    @BeforeClass
    public static void setUpClass() {
        facade = new Facade();
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testLogIn() {
        String username = "Galena";
        String password = "$2a$04$rxTtOOsRuq1qTBFAB3903eEGPKW.GqfV3KwVYkXavuJ./MqNPwvea";

        Session session = facade.logIn( username, password );

        assertEquals( username, session.getUsername() );
    }

    @Test
    public void testCreateReservation() {
        String journeyId = "1";
        
        String ticketId = "1";
        String userId = "1";

        String licencePlate = "111-111-111";

        String model = "Volvo";
        String restrains = "{\"width\": \"6000\",\"height\": \"2000\",\"weight\": \"2000\"}";

        String sessionId = "j6oAOxCWZh/CD723LGeXlf";

        List<Client> clients = Arrays.asList( new Client( journeyId, ticketId, userId ) );
        List<Vehicle> vehicles = Arrays.asList( new Vehicle( licencePlate, new VehicleType( model, restrains ) ) );

        Ticket ticket = facade.createReservation( journeyId, clients, vehicles, sessionId );

        assertEquals( clients.get( 0 ), ticket.getListOfClients().get( 0 ) );
        assertEquals( vehicles.get( 0 ), ticket.getListOfVehicles().get( 0 ) );
    }

}
