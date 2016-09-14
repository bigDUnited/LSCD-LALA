package entity;

import java.util.ArrayList;
import java.util.List;

public class Ticket {

    private long ticketId;
    private List<Client> listOfClients;
    private List<Vehicle> listOfVehicles;

    public Ticket( long ticketId, ArrayList<Client> clients, ArrayList<Vehicle> vehicles ) {
        this.ticketId = ticketId;
        listOfClients = clients;
        listOfVehicles = vehicles;
    }

    public long getTicketId() {
        return ticketId;
    }

    public void addClient( Client client ) {
        listOfClients.add( client );
    }

    public List<Client> getListOfClients() {
        return listOfClients;
    }

    public void addVehicle( Vehicle vehicle ) {
        listOfVehicles.add( vehicle );
    }

    public List<Vehicle> getListOfVehicles() {
        return listOfVehicles;
    }
}
