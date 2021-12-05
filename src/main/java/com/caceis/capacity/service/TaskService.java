package com.caceis.capacity.service;

import com.caceis.capacity.entity.Task;

import javassist.NotFoundException;

public interface TaskService {

	public Task getTask(long id) throws NotFoundException;

	public void addTask(Task task);
	
}
