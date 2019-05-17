package JSON2Services.JSON2Services.Entity;

import java.util.Date;

public class Recruiter {

	private Date projectStartDate;
	private Boolean empSignedOfferLetter;
	private Date placementDate;
	private String urgentSituation;
	private String applicationType;
	private Date docsCollectingStartDate;
	private String employerRelationDocuments;
	private String vendorLetterStatus;
	private String clientLetterStatus;
	private Boolean empVerifiedWrkLocation;
	private Date rectrSentPlacDate;
	private String rectrSentVenAgreeSignedCopy;

	public Date getProjectStartDate() {
		return projectStartDate;
	}

	public void setProjectStartDate(Date projectStartDate) {
		this.projectStartDate = projectStartDate;
	}

	public Boolean getEmpSignedOfferLetter() {
		return empSignedOfferLetter;
	}

	public void setEmpSignedOfferLetter(Boolean empSignedOfferLetter) {
		this.empSignedOfferLetter = empSignedOfferLetter;
	}

	public Date getPlacementDate() {
		return placementDate;
	}

	public void setPlacementDate(Date placementDate) {
		this.placementDate = placementDate;
	}

	public String getUrgentSituation() {
		return urgentSituation;
	}

	public void setUrgentSituation(String urgentSituation) {
		this.urgentSituation = urgentSituation;
	}

	public String getApplicationType() {
		return applicationType;
	}

	public void setApplicationType(String applicationType) {
		this.applicationType = applicationType;
	}

	public Date getDocsCollectingStartDate() {
		return docsCollectingStartDate;
	}

	public void setDocsCollectingStartDate(Date docsCollectingStartDate) {
		this.docsCollectingStartDate = docsCollectingStartDate;
	}

	public String getEmployerRelationDocuments() {
		return employerRelationDocuments;
	}

	public void setEmployerRelationDocuments(String employerRelationDocuments) {
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

	public Boolean getEmpVerifiedWrkLocation() {
		return empVerifiedWrkLocation;
	}

	public void setEmpVerifiedWrkLocation(Boolean empVerifiedWrkLocation) {
		this.empVerifiedWrkLocation = empVerifiedWrkLocation;
	}

	public Date getRectrSentPlacDate() {
		return rectrSentPlacDate;
	}

	public void setRectrSentPlacDate(Date rectrSentPlacDate) {
		this.rectrSentPlacDate = rectrSentPlacDate;
	}

	public String getRectrSentVenAgreeSignedCopy() {
		return rectrSentVenAgreeSignedCopy;
	}

	public void setRectrSentVenAgreeSignedCopy(String rectrSentVenAgreeSignedCopy) {
		this.rectrSentVenAgreeSignedCopy = rectrSentVenAgreeSignedCopy;
	}

	public Recruiter(Date projectStartDate, Boolean empSignedOfferLetter, Date placementDate, String urgentSituation,
			String applicationType, Date docsCollectingStartDate, String employerRelationDocuments,
			String vendorLetterStatus, String clientLetterStatus, Boolean empVerifiedWrkLocation,
			Date rectrSentPlacDate, String rectrSentVenAgreeSignedCopy) {
		super();
		this.projectStartDate = projectStartDate;
		this.empSignedOfferLetter = empSignedOfferLetter;
		this.placementDate = placementDate;
		this.urgentSituation = urgentSituation;
		this.applicationType = applicationType;
		this.docsCollectingStartDate = docsCollectingStartDate;
		this.employerRelationDocuments = employerRelationDocuments;
		this.vendorLetterStatus = vendorLetterStatus;
		this.clientLetterStatus = clientLetterStatus;
		this.empVerifiedWrkLocation = empVerifiedWrkLocation;
		this.rectrSentPlacDate = rectrSentPlacDate;
		this.rectrSentVenAgreeSignedCopy = rectrSentVenAgreeSignedCopy;
	}

	public Recruiter() {
		super();
		// TODO Auto-generated constructor stub
	}

}
