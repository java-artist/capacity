package com.caceis.capacity.service;

import java.util.List;

import com.caceis.capacity.entity.Project;
import com.caceis.capacity.response.ProjectResponse;

import javassist.NotFoundException;

public interface ProjectService {
	
	public Project add(Project project);
	public List<Project> getAll();
	public Project get(int id) throws NotFoundException;

}
