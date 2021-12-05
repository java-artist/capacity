package com.caceis.capacity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caceis.capacity.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Integer> {

	Task findById(long id);

}
