package com.caceis.capacity.service.impl;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caceis.capacity.entity.Task;
import com.caceis.capacity.repository.TaskRepository;
import com.caceis.capacity.service.TaskService;

import javassist.NotFoundException;

@Service
public class TaskServiceImpl implements TaskService {


	@Autowired
	TaskRepository taskRepository;

	
	private static final Logger log = LoggerFactory.getLogger(TaskService.class);


	public TaskServiceImpl(TaskRepository taskRepository) {
		this.taskRepository = taskRepository;
	}

	@Override
	public Task getTask(long id) throws NotFoundException{
		
		log.info("Buscando task com o id:{}", id);
	
		Task task = this.taskRepository.findById(id);
		
		if(task==null) {
			throw new NotFoundException("Não encontrada a task com o id:" + id);
		}else {
			log.info("encontrado a task: {}", task);
	
			return task;
			
		}
	
	}

	@Override
	public void addTask(Task task) {
		task.setUuid(UUID.randomUUID().toString());
		this.taskRepository.save(task);
	}

}
