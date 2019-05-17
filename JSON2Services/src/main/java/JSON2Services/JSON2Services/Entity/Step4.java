package JSON2Services.JSON2Services.Entity;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
@Document(collection = "step4")
public class Step4 {

	private int id;
	private String taskName;

	private Boolean taskActive;

	private String actionAssignedTo;

	private Boolean isTaskCompleted;

	private Boolean isTaskDependent;

	private Boolean showAccordion;

	private String dependencyReason;

	private String dependencies;

	private Boolean recvdVendorLtrFrmEmp;

	private String tmStRecvdVendorLtrFrmEmp;

	private String tmEdRecvdVendorLtrFrmEmp;

	private Boolean recvdClntLtrFrmEmp;

	private String tmStRecvdClntLtrFrmEmp;

	private String tmEdRecvdClntLtrFrmEmp;

	private String otherPendngDocs;

	private String tmStOtherPendngDocs;

	private String tmEdOtherPendngDocs;

	private String jobTitleIsCorrect;

	private String empHasDependents;

	private Boolean recvdAllH4DocsFrmEmp;

	private String tmStRecvdAllH4DocsFrmEmp;

	private String tmEdRecvdAllH4DocsFrmEmp;

	private Boolean recvdAllH4DepDocsFrmEmp;

	private String tmStRecvdAllH4DepDocsFrmEmp;

	private String tmEdRecvdAllH4DepDocsFrmEmp;

	private Boolean recvdAllH1bDocsFrmEmp;

	private String tmStRecvdAllH1bDocsFrmEmp;

	private String tmEdRecvdAllH1bDocsFrmEmp;

	private Boolean anyPendingDocuments;

	private String pendingDocumentsList;

	private String dueDateFrPendgDocs;

	private Boolean hrRecvdAllDocsFromEmp;

	private String tmStHrRecvdAllDocsFromEmp;

	private String tmEdHrRecvdAllDocsFromEmp;

	private Boolean hrApprovesTheDocsReceived;

	private String tmStHrHRApprovesTheDocsReceived;

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

	public Step4() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Step4(int id, String taskName, Boolean taskActive, String actionAssignedTo, Boolean isTaskCompleted,
			Boolean isTaskDependent, Boolean showAccordion, String dependencyReason, String dependencies,
			Boolean recvdVendorLtrFrmEmp, String tmStRecvdVendorLtrFrmEmp, String tmEdRecvdVendorLtrFrmEmp,
			Boolean recvdClntLtrFrmEmp, String tmStRecvdClntLtrFrmEmp, String tmEdRecvdClntLtrFrmEmp,
			String otherPendngDocs, String tmStOtherPendngDocs, String tmEdOtherPendngDocs, String jobTitleIsCorrect,
			String empHasDependents, Boolean recvdAllH4DocsFrmEmp, String tmStRecvdAllH4DocsFrmEmp,
			String tmEdRecvdAllH4DocsFrmEmp, Boolean recvdAllH4DepDocsFrmEmp, String tmStRecvdAllH4DepDocsFrmEmp,
			String tmEdRecvdAllH4DepDocsFrmEmp, Boolean recvdAllH1bDocsFrmEmp, String tmStRecvdAllH1bDocsFrmEmp,
			String tmEdRecvdAllH1bDocsFrmEmp, Boolean anyPendingDocuments, String pendingDocumentsList,
			String dueDateFrPendgDocs, Boolean hrRecvdAllDocsFromEmp, String tmStHrRecvdAllDocsFromEmp,
			String tmEdHrRecvdAllDocsFromEmp, Boolean hrApprovesTheDocsReceived, String tmStHrHRApprovesTheDocsReceived,
			String tmEdHrHRApprovesTheDocsReceived, Boolean hrSentDocsToAttorney, String tmStHrHRSentDocsToAttorney,
			String tmEdHrHRSentDocsToAttorney) {
		super();
		this.id = id;
		this.taskName = taskName;
		this.taskActive = taskActive;
		this.actionAssignedTo = actionAssignedTo;
		this.isTaskCompleted = isTaskCompleted;
		this.isTaskDependent = isTaskDependent;
		this.showAccordion = showAccordion;
		this.dependencyReason = dependencyReason;
		this.dependencies = dependencies;
		this.recvdVendorLtrFrmEmp = recvdVendorLtrFrmEmp;
		this.tmStRecvdVendorLtrFrmEmp = tmStRecvdVendorLtrFrmEmp;
		this.tmEdRecvdVendorLtrFrmEmp = tmEdRecvdVendorLtrFrmEmp;
		this.recvdClntLtrFrmEmp = recvdClntLtrFrmEmp;
		this.tmStRecvdClntLtrFrmEmp = tmStRecvdClntLtrFrmEmp;
		this.tmEdRecvdClntLtrFrmEmp = tmEdRecvdClntLtrFrmEmp;
		this.otherPendngDocs = otherPendngDocs;
		this.tmStOtherPendngDocs = tmStOtherPendngDocs;
		this.tmEdOtherPendngDocs = tmEdOtherPendngDocs;
		this.jobTitleIsCorrect = jobTitleIsCorrect;
		this.empHasDependents = empHasDependents;
		this.recvdAllH4DocsFrmEmp = recvdAllH4DocsFrmEmp;
		this.tmStRecvdAllH4DocsFrmEmp = tmStRecvdAllH4DocsFrmEmp;
		this.tmEdRecvdAllH4DocsFrmEmp = tmEdRecvdAllH4DocsFrmEmp;
		this.recvdAllH4DepDocsFrmEmp = recvdAllH4DepDocsFrmEmp;
		this.tmStRecvdAllH4DepDocsFrmEmp = tmStRecvdAllH4DepDocsFrmEmp;
		this.tmEdRecvdAllH4DepDocsFrmEmp = tmEdRecvdAllH4DepDocsFrmEmp;
		this.recvdAllH1bDocsFrmEmp = recvdAllH1bDocsFrmEmp;
		this.tmStRecvdAllH1bDocsFrmEmp = tmStRecvdAllH1bDocsFrmEmp;
		this.tmEdRecvdAllH1bDocsFrmEmp = tmEdRecvdAllH1bDocsFrmEmp;
		this.anyPendingDocuments = anyPendingDocuments;
		this.pendingDocumentsList = pendingDocumentsList;
		this.dueDateFrPendgDocs = dueDateFrPendgDocs;
		this.hrRecvdAllDocsFromEmp = hrRecvdAllDocsFromEmp;
		this.tmStHrRecvdAllDocsFromEmp = tmStHrRecvdAllDocsFromEmp;
		this.tmEdHrRecvdAllDocsFromEmp = tmEdHrRecvdAllDocsFromEmp;
		this.hrApprovesTheDocsReceived = hrApprovesTheDocsReceived;
		this.tmStHrHRApprovesTheDocsReceived = tmStHrHRApprovesTheDocsReceived;
		this.tmEdHrHRApprovesTheDocsReceived = tmEdHrHRApprovesTheDocsReceived;
		this.hrSentDocsToAttorney = hrSentDocsToAttorney;
		this.tmStHrHRSentDocsToAttorney = tmStHrHRSentDocsToAttorney;
		this.tmEdHrHRSentDocsToAttorney = tmEdHrHRSentDocsToAttorney;
	}

	private String tmEdHrHRApprovesTheDocsReceived;

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

	public String getActionAssignedTo() {
		return actionAssignedTo;
	}

	public void setActionAssignedTo(String actionAssignedTo) {
		this.actionAssignedTo = actionAssignedTo;
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

	public String getDependencies() {
		return dependencies;
	}

	public void setDependencies(String dependencies) {
		this.dependencies = dependencies;
	}

	public Boolean getRecvdVendorLtrFrmEmp() {
		return recvdVendorLtrFrmEmp;
	}

	public void setRecvdVendorLtrFrmEmp(Boolean recvdVendorLtrFrmEmp) {
		this.recvdVendorLtrFrmEmp = recvdVendorLtrFrmEmp;
	}

	public String getTmStRecvdVendorLtrFrmEmp() {
		return tmStRecvdVendorLtrFrmEmp;
	}

	public void setTmStRecvdVendorLtrFrmEmp(String tmStRecvdVendorLtrFrmEmp) {
		this.tmStRecvdVendorLtrFrmEmp = tmStRecvdVendorLtrFrmEmp;
	}

	public String getTmEdRecvdVendorLtrFrmEmp() {
		return tmEdRecvdVendorLtrFrmEmp;
	}

	public void setTmEdRecvdVendorLtrFrmEmp(String tmEdRecvdVendorLtrFrmEmp) {
		this.tmEdRecvdVendorLtrFrmEmp = tmEdRecvdVendorLtrFrmEmp;
	}

	public Boolean getRecvdClntLtrFrmEmp() {
		return recvdClntLtrFrmEmp;
	}

	public void setRecvdClntLtrFrmEmp(Boolean recvdClntLtrFrmEmp) {
		this.recvdClntLtrFrmEmp = recvdClntLtrFrmEmp;
	}

	public String getTmStRecvdClntLtrFrmEmp() {
		return tmStRecvdClntLtrFrmEmp;
	}

	public void setTmStRecvdClntLtrFrmEmp(String tmStRecvdClntLtrFrmEmp) {
		this.tmStRecvdClntLtrFrmEmp = tmStRecvdClntLtrFrmEmp;
	}

	public String getTmEdRecvdClntLtrFrmEmp() {
		return tmEdRecvdClntLtrFrmEmp;
	}

	public void setTmEdRecvdClntLtrFrmEmp(String tmEdRecvdClntLtrFrmEmp) {
		this.tmEdRecvdClntLtrFrmEmp = tmEdRecvdClntLtrFrmEmp;
	}

	public String getOtherPendngDocs() {
		return otherPendngDocs;
	}

	public void setOtherPendngDocs(String otherPendngDocs) {
		this.otherPendngDocs = otherPendngDocs;
	}

	public String getTmStOtherPendngDocs() {
		return tmStOtherPendngDocs;
	}

	public void setTmStOtherPendngDocs(String tmStOtherPendngDocs) {
		this.tmStOtherPendngDocs = tmStOtherPendngDocs;
	}

	public String getTmEdOtherPendngDocs() {
		return tmEdOtherPendngDocs;
	}

	public void setTmEdOtherPendngDocs(String tmEdOtherPendngDocs) {
		this.tmEdOtherPendngDocs = tmEdOtherPendngDocs;
	}

	public String getJobTitleIsCorrect() {
		return jobTitleIsCorrect;
	}

	public void setJobTitleIsCorrect(String jobTitleIsCorrect) {
		this.jobTitleIsCorrect = jobTitleIsCorrect;
	}

	public String getEmpHasDependents() {
		return empHasDependents;
	}

	public void setEmpHasDependents(String empHasDependents) {
		this.empHasDependents = empHasDependents;
	}

	public Boolean getRecvdAllH4DocsFrmEmp() {
		return recvdAllH4DocsFrmEmp;
	}

	public void setRecvdAllH4DocsFrmEmp(Boolean recvdAllH4DocsFrmEmp) {
		this.recvdAllH4DocsFrmEmp = recvdAllH4DocsFrmEmp;
	}

	public String getTmStRecvdAllH4DocsFrmEmp() {
		return tmStRecvdAllH4DocsFrmEmp;
	}

	public void setTmStRecvdAllH4DocsFrmEmp(String tmStRecvdAllH4DocsFrmEmp) {
		this.tmStRecvdAllH4DocsFrmEmp = tmStRecvdAllH4DocsFrmEmp;
	}

	public String getTmEdRecvdAllH4DocsFrmEmp() {
		return tmEdRecvdAllH4DocsFrmEmp;
	}

	public void setTmEdRecvdAllH4DocsFrmEmp(String tmEdRecvdAllH4DocsFrmEmp) {
		this.tmEdRecvdAllH4DocsFrmEmp = tmEdRecvdAllH4DocsFrmEmp;
	}

	public Boolean getRecvdAllH4DepDocsFrmEmp() {
		return recvdAllH4DepDocsFrmEmp;
	}

	public void setRecvdAllH4DepDocsFrmEmp(Boolean recvdAllH4DepDocsFrmEmp) {
		this.recvdAllH4DepDocsFrmEmp = recvdAllH4DepDocsFrmEmp;
	}

	public String getTmStRecvdAllH4DepDocsFrmEmp() {
		return tmStRecvdAllH4DepDocsFrmEmp;
	}

	public void setTmStRecvdAllH4DepDocsFrmEmp(String tmStRecvdAllH4DepDocsFrmEmp) {
		this.tmStRecvdAllH4DepDocsFrmEmp = tmStRecvdAllH4DepDocsFrmEmp;
	}

	public String getTmEdRecvdAllH4DepDocsFrmEmp() {
		return tmEdRecvdAllH4DepDocsFrmEmp;
	}

	public void setTmEdRecvdAllH4DepDocsFrmEmp(String tmEdRecvdAllH4DepDocsFrmEmp) {
		this.tmEdRecvdAllH4DepDocsFrmEmp = tmEdRecvdAllH4DepDocsFrmEmp;
	}

	public Boolean getRecvdAllH1bDocsFrmEmp() {
		return recvdAllH1bDocsFrmEmp;
	}

	public void setRecvdAllH1bDocsFrmEmp(Boolean recvdAllH1bDocsFrmEmp) {
		this.recvdAllH1bDocsFrmEmp = recvdAllH1bDocsFrmEmp;
	}

	public String getTmStRecvdAllH1bDocsFrmEmp() {
		return tmStRecvdAllH1bDocsFrmEmp;
	}

	public void setTmStRecvdAllH1bDocsFrmEmp(String tmStRecvdAllH1bDocsFrmEmp) {
		this.tmStRecvdAllH1bDocsFrmEmp = tmStRecvdAllH1bDocsFrmEmp;
	}

	public String getTmEdRecvdAllH1bDocsFrmEmp() {
		return tmEdRecvdAllH1bDocsFrmEmp;
	}

	public void setTmEdRecvdAllH1bDocsFrmEmp(String tmEdRecvdAllH1bDocsFrmEmp) {
		this.tmEdRecvdAllH1bDocsFrmEmp = tmEdRecvdAllH1bDocsFrmEmp;
	}

	public Boolean getAnyPendingDocuments() {
		return anyPendingDocuments;
	}

	public void setAnyPendingDocuments(Boolean anyPendingDocuments) {
		this.anyPendingDocuments = anyPendingDocuments;
	}

	public String getPendingDocumentsList() {
		return pendingDocumentsList;
	}

	public void setPendingDocumentsList(String pendingDocumentsList) {
		this.pendingDocumentsList = pendingDocumentsList;
	}

	public String getDueDateFrPendgDocs() {
		return dueDateFrPendgDocs;
	}

	public void setDueDateFrPendgDocs(String dueDateFrPendgDocs) {
		this.dueDateFrPendgDocs = dueDateFrPendgDocs;
	}

	public Boolean getHrRecvdAllDocsFromEmp() {
		return hrRecvdAllDocsFromEmp;
	}

	public void setHrRecvdAllDocsFromEmp(Boolean hrRecvdAllDocsFromEmp) {
		this.hrRecvdAllDocsFromEmp = hrRecvdAllDocsFromEmp;
	}

	public String getTmStHrRecvdAllDocsFromEmp() {
		return tmStHrRecvdAllDocsFromEmp;
	}

	public void setTmStHrRecvdAllDocsFromEmp(String tmStHrRecvdAllDocsFromEmp) {
		this.tmStHrRecvdAllDocsFromEmp = tmStHrRecvdAllDocsFromEmp;
	}

	public String getTmEdHrRecvdAllDocsFromEmp() {
		return tmEdHrRecvdAllDocsFromEmp;
	}

	public void setTmEdHrRecvdAllDocsFromEmp(String tmEdHrRecvdAllDocsFromEmp) {
		this.tmEdHrRecvdAllDocsFromEmp = tmEdHrRecvdAllDocsFromEmp;
	}

	public Boolean getHrApprovesTheDocsReceived() {
		return hrApprovesTheDocsReceived;
	}

	public void setHrApprovesTheDocsReceived(Boolean hrApprovesTheDocsReceived) {
		this.hrApprovesTheDocsReceived = hrApprovesTheDocsReceived;
	}

	public String getTmStHrHRApprovesTheDocsReceived() {
		return tmStHrHRApprovesTheDocsReceived;
	}

	public void setTmStHrHRApprovesTheDocsReceived(String tmStHrHRApprovesTheDocsReceived) {
		this.tmStHrHRApprovesTheDocsReceived = tmStHrHRApprovesTheDocsReceived;
	}

	public String getTmEdHrHRApprovesTheDocsReceived() {
		return tmEdHrHRApprovesTheDocsReceived;
	}

	public void setTmEdHrHRApprovesTheDocsReceived(String tmEdHrHRApprovesTheDocsReceived) {
		this.tmEdHrHRApprovesTheDocsReceived = tmEdHrHRApprovesTheDocsReceived;
	}

	public Boolean getHrSentDocsToAttorney() {
		return hrSentDocsToAttorney;
	}

	public void setHrSentDocsToAttorney(Boolean hrSentDocsToAttorney) {
		this.hrSentDocsToAttorney = hrSentDocsToAttorney;
	}

	public String getTmStHrHRSentDocsToAttorney() {
		return tmStHrHRSentDocsToAttorney;
	}

	public void setTmStHrHRSentDocsToAttorney(String tmStHrHRSentDocsToAttorney) {
		this.tmStHrHRSentDocsToAttorney = tmStHrHRSentDocsToAttorney;
	}

	public String getTmEdHrHRSentDocsToAttorney() {
		return tmEdHrHRSentDocsToAttorney;
	}

	public void setTmEdHrHRSentDocsToAttorney(String tmEdHrHRSentDocsToAttorney) {
		this.tmEdHrHRSentDocsToAttorney = tmEdHrHRSentDocsToAttorney;
	}

	private Boolean hrSentDocsToAttorney;

	private String tmStHrHRSentDocsToAttorney;

	private String tmEdHrHRSentDocsToAttorney;

}
