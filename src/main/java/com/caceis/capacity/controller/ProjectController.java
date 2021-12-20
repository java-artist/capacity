package com.caceis.capacity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.caceis.capacity.entity.Project;
import com.caceis.capacity.response.ProjectResponse;
import com.caceis.capacity.service.ProjectService;

import javassist.NotFoundException;

@RestController
public class ProjectController {
	
	private final String CONTEXT = "projects";

	
	@Autowired
	ProjectService projectService;
	
	@PostMapping(CONTEXT)
	public ResponseEntity<Project> add(@RequestBody Project project) {
		
		this.projectService.add(project);
		return ResponseEntity.status(HttpStatus.CREATED).body(project);

	}

	@GetMapping(CONTEXT+"/{id}")
	public Project get(@PathVariable int id) {
		
		try {
			return this.projectService.get(id);
		} catch (NotFoundException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());

		}
	}

	@CrossOrigin
	@GetMapping(CONTEXT)
	public ResponseEntity<List<Project>> getAll() {
			return ResponseEntity.ok(this.projectService.getAll());
	}
}
