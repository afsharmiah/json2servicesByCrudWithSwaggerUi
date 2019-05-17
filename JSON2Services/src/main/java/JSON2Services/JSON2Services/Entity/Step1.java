package JSON2Services.JSON2Services.Entity;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
@Document(collection = "step1")
public class Step1 {
	private int id;
	private String taskName;
	private Boolean taskActive;
	private Boolean showAccordion;
	private Boolean isTaskCompleted;
	private Boolean isTaskDependent;
	private String dependencyReason;
	private String actionAssignedTo;
	private Boolean verifiedWrkLocation;
	private Boolean offerLetterSigned;
	private Boolean vendorLetterSubmitted;
	private Boolean clientLetterSubmitted;
	private Boolean rolesRespSubmittedByEmp;
	private String rolesRespDraft;
	private String vendorLetterStatus;
	private String clientLetterStatus;
	private Boolean submittedAllH4DocsByEmp;
	private Boolean submittedAllH4DepDocsByEmp;
	private Boolean submittedAllH1bDocsByEmp;
	private EmpDetails empdetails;

	public String toString() {
		ObjectMapper o = new ObjectMapper();
		try {
			o.writeValueAsString(this);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}

	public Step1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Step1(int id, String taskName, Boolean taskActive, Boolean showAccordion, Boolean isTaskCompleted,
			Boolean isTaskDependent, String dependencyReason, String actionAssignedTo, Boolean verifiedWrkLocation,
			Boolean offerLetterSigned, Boolean vendorLetterSubmitted, Boolean clientLetterSubmitted,
			Boolean rolesRespSubmittedByEmp, String rolesRespDraft, String vendorLetterStatus,
			String clientLetterStatus, Boolean submittedAllH4DocsByEmp, Boolean submittedAllH4DepDocsByEmp,
			Boolean submittedAllH1bDocsByEmp, EmpDetails empdetails) {
		super();
		this.id = id;
		this.taskName = taskName;
		this.taskActive = taskActive;
		this.showAccordion = showAccordion;
		this.isTaskCompleted = isTaskCompleted;
		this.isTaskDependent = isTaskDependent;
		this.dependencyReason = dependencyReason;
		this.actionAssignedTo = actionAssignedTo;
		this.verifiedWrkLocation = verifiedWrkLocation;
		this.offerLetterSigned = offerLetterSigned;
		this.vendorLetterSubmitted = vendorLetterSubmitted;
		this.clientLetterSubmitted = clientLetterSubmitted;
		this.rolesRespSubmittedByEmp = rolesRespSubmittedByEmp;
		this.rolesRespDraft = rolesRespDraft;
		this.vendorLetterStatus = vendorLetterStatus;
		this.clientLetterStatus = clientLetterStatus;
		this.submittedAllH4DocsByEmp = submittedAllH4DocsByEmp;
		this.submittedAllH4DepDocsByEmp = submittedAllH4DepDocsByEmp;
		this.submittedAllH1bDocsByEmp = submittedAllH1bDocsByEmp;
		this.empdetails = empdetails;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public Boolean getTaskActive() {
		return taskActive;
	}

	public void setTaskActive(Boolean taskActive) {
		this.taskActive = taskActive;
	}

	public Boolean getShowAccordion() {
		return showAccordion;
	}

	public void setShowAccordion(Boolean showAccordion) {
		this.showAccordion = showAccordion;
	}

	public Boolean getIsTaskCompleted() {
		return isTaskCompleted;
	}

	public void setIsTaskCompleted(Boolean isTaskCompleted) {
		this.isTaskCompleted = isTaskCompleted;
	}

	public Boolean getIsTaskDependent() {
		return isTaskDependent;
	}

	public void setIsTaskDependent(Boolean isTaskDependent) {
		this.isTaskDependent = isTaskDependent;
	}

	public String getDependencyReason() {
		return dependencyReason;
	}

	public void setDependencyReason(String dependencyReason) {
		this.dependencyReason = dependencyReason;
	}

	public String getActionAssignedTo() {
		return actionAssignedTo;
	}

	public void setActionAssignedTo(String actionAssignedTo) {
		this.actionAssignedTo = actionAssignedTo;
	}

	public Boolean getVerifiedWrkLocation() {
		return verifiedWrkLocation;
	}

	public void setVerifiedWrkLocation(Boolean verifiedWrkLocation) {
		this.verifiedWrkLocation = verifiedWrkLocation;
	}

	public Boolean getOfferLetterSigned() {
		return offerLetterSigned;
	}

	public void setOfferLetterSigned(Boolean offerLetterSigned) {
		this.offerLetterSigned = offerLetterSigned;
	}

	public Boolean getVendorLetterSubmitted() {
		return vendorLetterSubmitted;
	}

	public void setVendorLetterSubmitted(Boolean vendorLetterSubmitted) {
		this.vendorLetterSubmitted = vendorLetterSubmitted;
	}

	public Boolean getClientLetterSubmitted() {
		return clientLetterSubmitted;
	}

	public void setClientLetterSubmitted(Boolean clientLetterSubmitted) {
		this.clientLetterSubmitted = clientLetterSubmitted;
	}

	public Boolean getRolesRespSubmittedByEmp() {
		return rolesRespSubmittedByEmp;
	}

	public void setRolesRespSubmittedByEmp(Boolean rolesRespSubmittedByEmp) {
		this.rolesRespSubmittedByEmp = rolesRespSubmittedByEmp;
	}

	public String getRolesRespDraft() {
		return rolesRespDraft;
	}

	public void setRolesRespDraft(String rolesRespDraft) {
		this.rolesRespDraft = rolesRespDraft;
	}

	public String getVendorLetterStatus() {
		return vendorLetterStatus;
	}

	public void setVendorLetterStatus(String vendorLetterStatus) {
		this.vendorLetterStatus = vendorLetterStatus;
	}

	public String getClientLetterStatus() {
		return clientLetterStatus;
	}

	public void setClientLetterStatus(String clientLetterStatus) {
		this.clientLetterStatus = clientLetterStatus;
	}

	public Boolean getSubmittedAllH4DocsByEmp() {
		return submittedAllH4DocsByEmp;
	}

	public void setSubmittedAllH4DocsByEmp(Boolean submittedAllH4DocsByEmp) {
		this.submittedAllH4DocsByEmp = submittedAllH4DocsByEmp;
	}

	public Boolean getSubmittedAllH4DepDocsByEmp() {
		return submittedAllH4DepDocsByEmp;
	}

	public void setSubmittedAllH4DepDocsByEmp(Boolean submittedAllH4DepDocsByEmp) {
		this.submittedAllH4DepDocsByEmp = submittedAllH4DepDocsByEmp;
	}

	public Boolean getSubmittedAllH1bDocsByEmp() {
		return submittedAllH1bDocsByEmp;
	}

	public void setSubmittedAllH1bDocsByEmp(Boolean submittedAllH1bDocsByEmp) {
		this.submittedAllH1bDocsByEmp = submittedAllH1bDocsByEmp;
	}

	public EmpDetails getEmpdetails() {
		return empdetails;
	}

	public void setEmpdetails(EmpDetails empdetails) {
		this.empdetails = empdetails;
	}

}
