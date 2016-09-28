package entity;

public class Client {
    private String cpr;
    private String ticketId;
    private String userId;
    
    public Client (String cpr, String ticketId, String userId) {
    	this.cpr = cpr;
    	this.ticketId = ticketId;
    	this.userId = userId;
    }
    
    public String getCpr () {
    	return cpr;
    }
    
    public String getTicketId () {
    	return ticketId;
    }
    
    public String getUserId () {
    	return userId;
    }
}
