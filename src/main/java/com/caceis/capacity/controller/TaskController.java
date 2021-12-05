package com.caceis.capacity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.caceis.capacity.entity.Task;
import com.caceis.capacity.service.TaskService;

import javassist.NotFoundException;

@RestController
public class TaskController {

	@Autowired
	TaskService taskService;
	
	private final static String CONTEXT ="task";
	

	@PostMapping(CONTEXT)
	public ResponseEntity<Task> addTask(@RequestBody Task task) {
		
		this.taskService.addTask(task);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(task);

	}

	@GetMapping(CONTEXT)
	public Task getTask(@RequestParam long id) {
		
		try {
			return this.taskService.getTask(id);
		} catch (NotFoundException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());

		}
	}

}
