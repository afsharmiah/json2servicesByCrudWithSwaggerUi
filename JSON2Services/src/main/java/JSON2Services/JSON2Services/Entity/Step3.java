package JSON2Services.JSON2Services.Entity;

import java.sql.Date;

import org.springframework.boot.jackson.JsonComponent;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@JsonComponent
@Document(collection = "step3")
public class Step3 {
	@Id
	private int id;
	private String taskName;

	private Boolean taskActive;

	private Boolean isTaskCompleted;

	private Boolean isTaskDependent;

	private Boolean showAccordion;

	private String dependencyReason;

	private String actionAssignedTo;

	private String dependencies;

	private String empVerWorkLocation;

	private String tmStEmpVerWorkLocation;

	private String tmEdEmpVerWorkLocation;

	private Boolean rolesRespSubmittedByEmp;

	private String tmStRolesRespSubmittedByEmp;

	private String tmEdRolesRespSubmittedByEmp;

	private Boolean rolesRespVerified;

	private String tmStRolesRespVerified;

	private String tmEdRolesRespVerified;

	private Boolean infoUptdToPortalByBiz;

	private String tmStInfoUptdToPortalByBiz;

	private String tmEdInfoUptdToPortalByBiz;

	private Boolean reviewUnCertLCA;

	private String tmStReviewUnCertLCA;

	private String tmEdReviewUnCertLCA;

	private Boolean lcaFiledForCert;

	private String tmStLcaFiledForCert;

	private String tmEdLcaFiledForCert;

	private Date appliedDateLCA;

	private Date approvedDateLCA;

	private Date expectedApprovalDate;

	private String taskCompletedTotalTime;

	private String taskStartedTotalTime;

	private Boolean lcaSentToEmployee;

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

	public String getDependencies() {
		return dependencies;
	}

	public void setDependencies(String dependencies) {
		this.dependencies = dependencies;
	}

	public String getEmpVerWorkLocation() {
		return empVerWorkLocation;
	}

	public void setEmpVerWorkLocation(String empVerWorkLocation) {
		this.empVerWorkLocation = empVerWorkLocation;
	}

	public String getTmStEmpVerWorkLocation() {
		return tmStEmpVerWorkLocation;
	}

	public void setTmStEmpVerWorkLocation(String tmStEmpVerWorkLocation) {
		this.tmStEmpVerWorkLocation = tmStEmpVerWorkLocation;
	}

	public String getTmEdEmpVerWorkLocation() {
		return tmEdEmpVerWorkLocation;
	}

	public void setTmEdEmpVerWorkLocation(String tmEdEmpVerWorkLocation) {
		this.tmEdEmpVerWorkLocation = tmEdEmpVerWorkLocation;
	}

	public Boolean getRolesRespSubmittedByEmp() {
		return rolesRespSubmittedByEmp;
	}

	public void setRolesRespSubmittedByEmp(Boolean rolesRespSubmittedByEmp) {
		this.rolesRespSubmittedByEmp = rolesRespSubmittedByEmp;
	}

	public String getTmStRolesRespSubmittedByEmp() {
		return tmStRolesRespSubmittedByEmp;
	}

	public void setTmStRolesRespSubmittedByEmp(String tmStRolesRespSubmittedByEmp) {
		this.tmStRolesRespSubmittedByEmp = tmStRolesRespSubmittedByEmp;
	}

	public String getTmEdRolesRespSubmittedByEmp() {
		return tmEdRolesRespSubmittedByEmp;
	}

	public void setTmEdRolesRespSubmittedByEmp(String tmEdRolesRespSubmittedByEmp) {
		this.tmEdRolesRespSubmittedByEmp = tmEdRolesRespSubmittedByEmp;
	}

	public Boolean getRolesRespVerified() {
		return rolesRespVerified;
	}

	public void setRolesRespVerified(Boolean rolesRespVerified) {
		this.rolesRespVerified = rolesRespVerified;
	}

	public String getTmStRolesRespVerified() {
		return tmStRolesRespVerified;
	}

	public void setTmStRolesRespVerified(String tmStRolesRespVerified) {
		this.tmStRolesRespVerified = tmStRolesRespVerified;
	}

	public String getTmEdRolesRespVerified() {
		return tmEdRolesRespVerified;
	}

	public void setTmEdRolesRespVerified(String tmEdRolesRespVerified) {
		this.tmEdRolesRespVerified = tmEdRolesRespVerified;
	}

	public Boolean getInfoUptdToPortalByBiz() {
		return infoUptdToPortalByBiz;
	}

	public void setInfoUptdToPortalByBiz(Boolean infoUptdToPortalByBiz) {
		this.infoUptdToPortalByBiz = infoUptdToPortalByBiz;
	}

	public String getTmStInfoUptdToPortalByBiz() {
		return tmStInfoUptdToPortalByBiz;
	}

	public void setTmStInfoUptdToPortalByBiz(String tmStInfoUptdToPortalByBiz) {
		this.tmStInfoUptdToPortalByBiz = tmStInfoUptdToPortalByBiz;
	}

	public String getTmEdInfoUptdToPortalByBiz() {
		return tmEdInfoUptdToPortalByBiz;
	}

	public void setTmEdInfoUptdToPortalByBiz(String tmEdInfoUptdToPortalByBiz) {
		this.tmEdInfoUptdToPortalByBiz = tmEdInfoUptdToPortalByBiz;
	}

	public Boolean getReviewUnCertLCA() {
		return reviewUnCertLCA;
	}

	public void setReviewUnCertLCA(Boolean reviewUnCertLCA) {
		this.reviewUnCertLCA = reviewUnCertLCA;
	}

	public String getTmStReviewUnCertLCA() {
		return tmStReviewUnCertLCA;
	}

	public void setTmStReviewUnCertLCA(String tmStReviewUnCertLCA) {
		this.tmStReviewUnCertLCA = tmStReviewUnCertLCA;
	}

	public String getTmEdReviewUnCertLCA() {
		return tmEdReviewUnCertLCA;
	}

	public void setTmEdReviewUnCertLCA(String tmEdReviewUnCertLCA) {
		this.tmEdReviewUnCertLCA = tmEdReviewUnCertLCA;
	}

	public Boolean getLcaFiledForCert() {
		return lcaFiledForCert;
	}

	public void setLcaFiledForCert(Boolean lcaFiledForCert) {
		this.lcaFiledForCert = lcaFiledForCert;
	}

	public String getTmStLcaFiledForCert() {
		return tmStLcaFiledForCert;
	}

	public void setTmStLcaFiledForCert(String tmStLcaFiledForCert) {
		this.tmStLcaFiledForCert = tmStLcaFiledForCert;
	}

	public String getTmEdLcaFiledForCert() {
		return tmEdLcaFiledForCert;
	}

	public void setTmEdLcaFiledForCert(String tmEdLcaFiledForCert) {
		this.tmEdLcaFiledForCert = tmEdLcaFiledForCert;
	}

	public Date getAppliedDateLCA() {
		return appliedDateLCA;
	}

	public void setAppliedDateLCA(Date appliedDateLCA) {
		this.appliedDateLCA = appliedDateLCA;
	}

	public Date getApprovedDateLCA() {
		return approvedDateLCA;
	}

	public void setApprovedDateLCA(Date approvedDateLCA) {
		this.approvedDateLCA = approvedDateLCA;
	}

	public Date getExpectedApprovalDate() {
		return expectedApprovalDate;
	}

	public void setExpectedApprovalDate(Date expectedApprovalDate) {
		this.expectedApprovalDate = expectedApprovalDate;
	}

	public String getTaskCompletedTotalTime() {
		return taskCompletedTotalTime;
	}

	public void setTaskCompletedTotalTime(String taskCompletedTotalTime) {
		this.taskCompletedTotalTime = taskCompletedTotalTime;
	}

	public String getTaskStartedTotalTime() {
		return taskStartedTotalTime;
	}

	public void setTaskStartedTotalTime(String taskStartedTotalTime) {
		this.taskStartedTotalTime = taskStartedTotalTime;
	}

	public Boolean getLcaSentToEmployee() {
		return lcaSentToEmployee;
	}

	public void setLcaSentToEmployee(Boolean lcaSentToEmployee) {
		this.lcaSentToEmployee = lcaSentToEmployee;
	}

	public Step3(int id, String taskName, Boolean taskActive, Boolean isTaskCompleted, Boolean isTaskDependent,
			Boolean showAccordion, String dependencyReason, String actionAssignedTo, String dependencies,
			String empVerWorkLocation, String tmStEmpVerWorkLocation, String tmEdEmpVerWorkLocation,
			Boolean rolesRespSubmittedByEmp, String tmStRolesRespSubmittedByEmp, String tmEdRolesRespSubmittedByEmp,
			Boolean rolesRespVerified, String tmStRolesRespVerified, String tmEdRolesRespVerified,
			Boolean infoUptdToPortalByBiz, String tmStInfoUptdToPortalByBiz, String tmEdInfoUptdToPortalByBiz,
			Boolean reviewUnCertLCA, String tmStReviewUnCertLCA, String tmEdReviewUnCertLCA, Boolean lcaFiledForCert,
			String tmStLcaFiledForCert, String tmEdLcaFiledForCert, Date appliedDateLCA, Date approvedDateLCA,
			Date expectedApprovalDate, String taskCompletedTotalTime, String taskStartedTotalTime,
			Boolean lcaSentToEmployee) {
		super();
		this.id = id;
		this.taskName = taskName;
		this.taskActive = taskActive;
		this.isTaskCompleted = isTaskCompleted;
		this.isTaskDependent = isTaskDependent;
		this.showAccordion = showAccordion;
		this.dependencyReason = dependencyReason;
		this.actionAssignedTo = actionAssignedTo;
		this.dependencies = dependencies;
		this.empVerWorkLocation = empVerWorkLocation;
		this.tmStEmpVerWorkLocation = tmStEmpVerWorkLocation;
		this.tmEdEmpVerWorkLocation = tmEdEmpVerWorkLocation;
		this.rolesRespSubmittedByEmp = rolesRespSubmittedByEmp;
		this.tmStRolesRespSubmittedByEmp = tmStRolesRespSubmittedByEmp;
		this.tmEdRolesRespSubmittedByEmp = tmEdRolesRespSubmittedByEmp;
		this.rolesRespVerified = rolesRespVerified;
		this.tmStRolesRespVerified = tmStRolesRespVerified;
		this.tmEdRolesRespVerified = tmEdRolesRespVerified;
		this.infoUptdToPortalByBiz = infoUptdToPortalByBiz;
		this.tmStInfoUptdToPortalByBiz = tmStInfoUptdToPortalByBiz;
		this.tmEdInfoUptdToPortalByBiz = tmEdInfoUptdToPortalByBiz;
		this.reviewUnCertLCA = reviewUnCertLCA;
		this.tmStReviewUnCertLCA = tmStReviewUnCertLCA;
		this.tmEdReviewUnCertLCA = tmEdReviewUnCertLCA;
		this.lcaFiledForCert = lcaFiledForCert;
		this.tmStLcaFiledForCert = tmStLcaFiledForCert;
		this.tmEdLcaFiledForCert = tmEdLcaFiledForCert;
		this.appliedDateLCA = appliedDateLCA;
		this.approvedDateLCA = approvedDateLCA;
		this.expectedApprovalDate = expectedApprovalDate;
		this.taskCompletedTotalTime = taskCompletedTotalTime;
		this.taskStartedTotalTime = taskStartedTotalTime;
		this.lcaSentToEmployee = lcaSentToEmployee;
	}

	public Step3() {
		super();
		// TODO Auto-generated constructor stub
	}

}
