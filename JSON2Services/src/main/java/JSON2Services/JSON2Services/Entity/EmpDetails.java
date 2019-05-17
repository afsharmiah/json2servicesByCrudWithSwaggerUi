package JSON2Services.JSON2Services.Entity;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class EmpDetails {
	@Override
	public String toString() {
		ObjectMapper map = new ObjectMapper();
		try {
			return map.writeValueAsString(this);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}

	private int empId;
	private String firstName;
	private String lastName;
	private String primaryEmailId;
	private String secondaryEmailId;
	private int phoneNo;
	private Address address;
	private WorkInfo workInfo;
	private ClientInfo clientInfo;
	private VendorInfo vendorInfo;
	private Recruiter recruiter;
	private TaskInfo taskInfo;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPrimaryEmailId() {
		return primaryEmailId;
	}

	public void setPrimaryEmailId(String primaryEmailId) {
		this.primaryEmailId = primaryEmailId;
	}

	public String getSecondaryEmailId() {
		return secondaryEmailId;
	}

	public void setSecondaryEmailId(String secondaryEmailId) {
		this.secondaryEmailId = secondaryEmailId;
	}

	public int getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public WorkInfo getWorkInfo() {
		return workInfo;
	}

	public void setWorkInfo(WorkInfo workInfo) {
		this.workInfo = workInfo;
	}

	public ClientInfo getClientInfo() {
		return clientInfo;
	}

	public void setClientInfo(ClientInfo clientInfo) {
		this.clientInfo = clientInfo;
	}

	public VendorInfo getVendorInfo() {
		return vendorInfo;
	}

	public void setVendorInfo(VendorInfo vendorInfo) {
		this.vendorInfo = vendorInfo;
	}

	public Recruiter getRecruiter() {
		return recruiter;
	}

	public void setRecruiter(Recruiter recruiter) {
		this.recruiter = recruiter;
	}

	public TaskInfo getTaskInfo() {
		return taskInfo;
	}

	public void setTaskInfo(TaskInfo taskInfo) {
		this.taskInfo = taskInfo;
	}

	public EmpDetails(int empId, String firstName, String lastName, String primaryEmailId, String secondaryEmailId,
			int phoneNo, Address address, WorkInfo workInfo, WorkLocation workLocation, ClientInfo clientInfo,
			VendorInfo vendorInfo, Recruiter recruiter, TaskInfo taskInfo) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.primaryEmailId = primaryEmailId;
		this.secondaryEmailId = secondaryEmailId;
		this.phoneNo = phoneNo;
		this.address = address;
		this.workInfo = workInfo;
		this.clientInfo = clientInfo;
		this.vendorInfo = vendorInfo;
		this.recruiter = recruiter;
		this.taskInfo = taskInfo;
	}

	public EmpDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

}
