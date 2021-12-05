	package com.caceis.capacity.service;

import org.springframework.web.multipart.MultipartFile;

public interface FileService {
	
	public boolean processFile(MultipartFile file);
	

}
