package JSON2Services.JSON2Services.Entity;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
@Document(collection = "step2")
public class Step2 {
	private int id;
	private String taskName;
	private Boolean taskActive;
	private Boolean isTaskCompleted;
	private Boolean isTaskDependent;
	private Boolean showAccordion;
	private String dependencyReason;
	private String actionAssignedTo;
	private String empSignedOfferLetter;
	private Date projectStartDate;
	private Date placementDate;
	private String applicationType;
	private String urgentSituation;
	private Date docsCollectingStartDate;
	private Boolean employerRelationDocuments;
	private String vendorLetterStatus;
	private String clientLetterStatus;
	private String empVerifiedWrkLocation;
	private String rectrSentPlacDet;
	private String rectrSentVenAgreeSignedCopy;

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

	public Boolean getShowAccordion() {
		return showAccordion;
	}

	public void setShowAccordion(Boolean showAccordion) {
		this.showAccordion = showAccordion;
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

	public String getEmpSignedOfferLetter() {
		return empSignedOfferLetter;
	}

	public void setEmpSignedOfferLetter(String empSignedOfferLetter) {
		this.empSignedOfferLetter = empSignedOfferLetter;
	}

	public Date getProjectStartDate() {
		return projectStartDate;
	}

	public void setProjectStartDate(Date projectStartDate) {
		this.projectStartDate = projectStartDate;
	}

	public Date getPlacementDate() {
		return placementDate;
	}

	public void setPlacementDate(Date placementDate) {
		this.placementDate = placementDate;
	}

	public String getApplicationType() {
		return applicationType;
	}

	public void setApplicationType(String applicationType) {
		this.applicationType = applicationType;
	}

	public String getUrgentSituation() {
		return urgentSituation;
	}

	public void setUrgentSituation(String urgentSituation) {
		this.urgentSituation = urgentSituation;
	}

	public Date getDocsCollectingStartDate() {
		return docsCollectingStartDate;
	}

	public void setDocsCollectingStartDate(Date docsCollectingStartDate) {
		this.docsCollectingStartDate = docsCollectingStartDate;
	}

	public Boolean getEmployerRelationDocuments() {
		return employerRelationDocuments;
	}

	public void setEmployerRelationDocuments(Boolean employerRelationDocuments) {
		this.employerRelationDocuments = employerRelationDocuments;
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

	public String getEmpVerifiedWrkLocation() {
		return empVerifiedWrkLocation;
	}

	public void setEmpVerifiedWrkLocation(String empVerifiedWrkLocation) {
		this.empVerifiedWrkLocation = empVerifiedWrkLocation;
	}

	public String getRectrSentPlacDet() {
		return rectrSentPlacDet;
	}

	public void setRectrSentPlacDet(String rectrSentPlacDet) {
		this.rectrSentPlacDet = rectrSentPlacDet;
	}

	public String getRectrSentVenAgreeSignedCopy() {
		return rectrSentVenAgreeSignedCopy;
	}

	public void setRectrSentVenAgreeSignedCopy(String rectrSentVenAgreeSignedCopy) {
		this.rectrSentVenAgreeSignedCopy = rectrSentVenAgreeSignedCopy;
	}

	public Step2(int id, String taskName, Boolean taskActive, Boolean isTaskCompleted, Boolean isTaskDependent,
			Boolean showAccordion, String dependencyReason, String actionAssignedTo, String empSignedOfferLetter,
			Date projectStartDate, Date placementDate, String applicationType, String urgentSituation,
			Date docsCollectingStartDate, Boolean employerRelationDocuments, String vendorLetterStatus,
			String clientLetterStatus, String empVerifiedWrkLocation, String rectrSentPlacDet,
			String rectrSentVenAgreeSignedCopy) {
		super();
		this.id = id;
		this.taskName = taskName;
		this.taskActive = taskActive;
		this.isTaskCompleted = isTaskCompleted;
		this.isTaskDependent = isTaskDependent;
		this.showAccordion = showAccordion;
		this.dependencyReason = dependencyReason;
		this.actionAssignedTo = actionAssignedTo;
		this.empSignedOfferLetter = empSignedOfferLetter;
		this.projectStartDate = projectStartDate;
		this.placementDate = placementDate;
		this.applicationType = applicationType;
		this.urgentSituation = urgentSituation;
		this.docsCollectingStartDate = docsCollectingStartDate;
		this.employerRelationDocuments = employerRelationDocuments;
		this.vendorLetterStatus = vendorLetterStatus;
		this.clientLetterStatus = clientLetterStatus;
		this.empVerifiedWrkLocation = empVerifiedWrkLocation;
		this.rectrSentPlacDet = rectrSentPlacDet;
		this.rectrSentVenAgreeSignedCopy = rectrSentVenAgreeSignedCopy;
	}

	public Step2() {
		super();
		// TODO Auto-generated constructor stub
	}

}
