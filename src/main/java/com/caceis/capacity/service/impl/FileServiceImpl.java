package com.caceis.capacity.service.impl;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.caceis.capacity.constants.Constants;
import com.caceis.capacity.entity.Task;
import com.caceis.capacity.service.FileService;
import com.caceis.capacity.service.TaskService;

@Service
public class FileServiceImpl implements FileService {

	@Autowired
	private TaskService taskService;

	private static final Logger log = LoggerFactory.getLogger(FileService.class);

	@Override
	public boolean processFile(MultipartFile file) {
		
		int amountOfLines = 0;

		log.info("Processando arquivo: [{}]", file);

		try (InputStream in = file.getInputStream();
				Scanner sc = new Scanner(file.getInputStream(), Charset.defaultCharset())) {

			while (sc.hasNextLine()) {

				String line = sc.nextLine();

				String[] column = line.split(Constants.SEMICOLON);

				Task task = new Task();
				task.setId(Integer.parseInt(column[0]));
				task.setTitle(column[1]);

				taskService.addTask(task);
				
				amountOfLines++;
			}

			log.info("Registros inseridos com sucesso, total: [{}]", amountOfLines);
			return true;

		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}
}
