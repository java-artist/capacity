package com.caceis.capacity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.caceis.capacity.service.FileService;

@RestController
public class FileController {
	
	private final static String CONTEXT ="file";
	

	@Autowired FileService fileService;
	
	@PostMapping(CONTEXT)
	public boolean processFile(@RequestParam MultipartFile file) {
		return fileService.processFile(file);
	}
	
}
