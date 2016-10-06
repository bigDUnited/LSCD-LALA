package dto;

public class LocationDTO {
	private int locationId;
	private String name;

	public LocationDTO(int locationId, String name) {
		super();
		this.locationId = locationId;
		this.name = name;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	public int getLocationId() {
		return locationId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
