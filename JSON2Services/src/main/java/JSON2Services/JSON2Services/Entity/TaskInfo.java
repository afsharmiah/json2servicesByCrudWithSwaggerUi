package JSON2Services.JSON2Services.Entity;

import java.util.Date;

public class TaskInfo {

	private int taskPrioirty;
	private String applicationType;
	private Date taskCreatedDate;
	private Boolean isTaskCreated;
	private Boolean isTaskPending;
	private Boolean isTaskCompleted;

	public int getTaskPrioirty() {
		return taskPrioirty;
	}

	public void setTaskPrioirty(int taskPrioirty) {
		this.taskPrioirty = taskPrioirty;
	}

	public String getApplicationType() {
		return applicationType;
	}

	public void setApplicationType(String applicationType) {
		this.applicationType = applicationType;
	}

	public Date getTaskCreatedDate() {
		return taskCreatedDate;
	}

	public void setTaskCreatedDate(Date taskCreatedDate) {
		this.taskCreatedDate = taskCreatedDate;
	}

	public Boolean getIsTaskCreated() {
		return isTaskCreated;
	}

	public void setIsTaskCreated(Boolean isTaskCreated) {
		this.isTaskCreated = isTaskCreated;
	}

	public Boolean getIsTaskPending() {
		return isTaskPending;
	}

	public void setIsTaskPending(Boolean isTaskPending) {
		this.isTaskPending = isTaskPending;
	}

	public Boolean getIsTaskCompleted() {
		return isTaskCompleted;
	}

	public void setIsTaskCompleted(Boolean isTaskCompleted) {
		this.isTaskCompleted = isTaskCompleted;
	}

	public TaskInfo(int taskPrioirty, String applicationType, Date taskCreatedDate, Boolean isTaskCreated,
			Boolean isTaskPending, Boolean isTaskCompleted) {
		super();
		this.taskPrioirty = taskPrioirty;
		this.applicationType = applicationType;
		this.taskCreatedDate = taskCreatedDate;
		this.isTaskCreated = isTaskCreated;
		this.isTaskPending = isTaskPending;
		this.isTaskCompleted = isTaskCompleted;
	}

	public TaskInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

}
