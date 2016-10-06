package interfaces;

import java.util.List;

import dto.JourneysDTO;
import dto.LocationDTO;
import dto.ReservationSummaryDTO;
import dto.RouteDTO;

public interface FacadeInterface {
	  List<LocationDTO> getLocations();
	  List<RouteDTO> getRoutes(int locationId);
	  JourneysDTO getJourney(int routeId);
		ReservationSummaryDTO makeReservation (String journeyId, int numOfPeople, String vehicleType);
	}
