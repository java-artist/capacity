package com.caceis.capacity.response;

public class TaskResponse {

	private String uuid;
	private String name;
	
	public TaskResponse(String uuid, String name) {
		this.uuid = uuid;
		this.name = name;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
