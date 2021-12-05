package com.caceis.capacity.dto;

public class ProjectsDto {

	private Integer projectId;
	private String projectName;
	private String taskUUID;
	private String taskTitle;

	public ProjectsDto(Integer projectId, String projectName, String taskUUID, String taskTitle) {
		this.projectId = projectId;
		this.projectName = projectName;
		this.taskUUID = taskUUID;
		this.taskTitle = taskTitle;
	}

	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getTaskUUID() {
		return taskUUID;
	}

	public void setTaskUUID(String taskUUID) {
		this.taskUUID = taskUUID;
	}

	public String getTaskTitle() {
		return taskTitle;
	}

	public void setTaskTitle(String taskTitle) {
		this.taskTitle = taskTitle;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + projectId;
		result = prime * result + ((projectName == null) ? 0 : projectName.hashCode());
		result = prime * result + ((taskTitle == null) ? 0 : taskTitle.hashCode());
		result = prime * result + ((taskUUID == null) ? 0 : taskUUID.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProjectsDto other = (ProjectsDto) obj;
		if (projectId != other.projectId)
			return false;
		if (projectName == null) {
			if (other.projectName != null)
				return false;
		} else if (!projectName.equals(other.projectName))
			return false;
		if (taskTitle == null) {
			if (other.taskTitle != null)
				return false;
		} else if (!taskTitle.equals(other.taskTitle))
			return false;
		if (taskUUID == null) {
			if (other.taskUUID != null)
				return false;
		} else if (!taskUUID.equals(other.taskUUID))
			return false;
		return true;
	}

}
