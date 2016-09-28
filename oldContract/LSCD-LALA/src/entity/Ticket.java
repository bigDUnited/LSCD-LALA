package entity;

import java.util.ArrayList;
import java.util.List;

public class Ticket {

	private String ticketId;
	private List<Client> listOfClients;
	private List<Vehicle> listOfVehicles;

	public Ticket(String ticketId, ArrayList<Client> clients, ArrayList<Vehicle> vehicles) {
		this.ticketId = ticketId;
		listOfClients = clients;
		listOfVehicles = vehicles;
	}

	public String getTicketId() {
		return ticketId;
	}

	public List<Client> getListOfClients() {
		return listOfClients;
	}

	public List<Vehicle> getListOfVehicles() {
		return listOfVehicles;
	}
}
