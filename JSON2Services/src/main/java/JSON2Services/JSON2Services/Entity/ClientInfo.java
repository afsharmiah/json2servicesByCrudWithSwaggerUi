package JSON2Services.JSON2Services.Entity;

public class ClientInfo {
	private String clientName;
	private String managerName;
	private Address address;

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public ClientInfo(String clientName, String managerName, Address address) {
		super();
		this.clientName = clientName;
		this.managerName = managerName;
		this.address = address;
	}

	public ClientInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

}
