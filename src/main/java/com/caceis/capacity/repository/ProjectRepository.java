package com.caceis.capacity.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.caceis.capacity.dto.ProjectsDto;
import com.caceis.capacity.entity.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer> {

	@Query(value="select new com.caceis.capacity.dto.ProjectsDto(p.id,p.name,t.uuid,t.title) FROM Task t INNER JOIN t.project p")
	List<ProjectsDto> getProjectsAndTasks();
	
	
	
	
}
