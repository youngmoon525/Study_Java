package pack01.list;

public class DepartmentDTO {
	private int departmentId , managerId , locationId;
	private String departmentName;
	
	public DepartmentDTO(int departmentId, int managerId, int locationId, String departmentName) {
		this.departmentId = departmentId;
		this.managerId = managerId;
		this.locationId = locationId;
		this.departmentName = departmentName;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public int getLocationId() {
		return locationId;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	
	
}
