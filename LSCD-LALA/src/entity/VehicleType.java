package entity;

public class VehicleType {
	private String model;
	private String restraints;

	public VehicleType(String model, String restraints) {
		this.model = model;
		this.restraints = restraints;
	}

	public String getModel() {
		return model;
	}

	public VehicleType getRestraints() {
		return restraints;
	}
}
