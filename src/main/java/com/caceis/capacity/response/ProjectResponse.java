package com.caceis.capacity.response;

import java.util.List;

public class ProjectResponse {
	
	private int id;
	private String name;
	private List<TaskResponse> tasks;
	
	public ProjectResponse(int id, String name, List<TaskResponse> tasks) {
		this.id = id;
		this.name = name;
		this.tasks = tasks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<TaskResponse> getTasks() {
		return tasks;
	}

	public void setTasks(List<TaskResponse> tasks) {
		this.tasks = tasks;
	}
	
}

