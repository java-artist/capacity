package com.caceis.capacity.service.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caceis.capacity.dto.ProjectsDto;
import com.caceis.capacity.entity.Project;
import com.caceis.capacity.repository.ProjectRepository;
import com.caceis.capacity.response.ProjectResponse;
import com.caceis.capacity.service.ProjectService;

import javassist.NotFoundException;

@Service
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	private ProjectRepository projectRepository;
	
	
	public ProjectServiceImpl(ProjectRepository projectRepository) {
		this.projectRepository = projectRepository;
	}

	@Override
	public List<Project> getAll() {
		return projectRepository.findAll();
	}

	
	@Override
	public Project add(Project project) {
		return projectRepository.save(project);
	}

	@Override
	public Project get(int id) throws NotFoundException {
		return projectRepository.findById(id)
		.orElseThrow(() -> new NotFoundException("Not found the project id: "+id));
		
	}

	@Override
	public List<ProjectResponse> getAllProjectWithTasks() {
		List<ProjectsDto> results = projectRepository.getProjectsAndTasks();

		return Collections.EMPTY_LIST;
		
		
//		return getProjectsIds(results).stream()
//				.map(project -> 
//					new ProjectResponse(
//						project.getProjectId(),
//						project.getProjectName(), 
//						getTasks(results, project.getProjectId())))
//				.collect(Collectors.toList());
	}

}
