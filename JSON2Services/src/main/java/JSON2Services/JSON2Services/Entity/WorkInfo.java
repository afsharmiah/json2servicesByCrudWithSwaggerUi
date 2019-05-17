package JSON2Services.JSON2Services.Entity;

public class WorkInfo {
	private WorkLocation workLocation;

	public WorkLocation getWorkLocation() {
		return workLocation;
	}

	public void setWorkLocation(WorkLocation workLocation) {
		this.workLocation = workLocation;
	}

	public WorkInfo(WorkLocation workLocation) {
		super();
		this.workLocation = workLocation;
	}

	public WorkInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

}
