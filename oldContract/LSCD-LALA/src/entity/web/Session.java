package entity.web;

import java.util.Date;

public class Session {

    private String sessionId;
    private String username;
    private Date sessionTime;

    public Session( String sessionId, String username ) {
        this.sessionId = sessionId;
        this.username = username;
        sessionTime = new Date();
    }

    public Date getSessionTime() {
        return sessionTime;
    }

    public String getSessionId() {
        return sessionId;
    }

    public String getUsername() {
        return username;
    }
   
}
