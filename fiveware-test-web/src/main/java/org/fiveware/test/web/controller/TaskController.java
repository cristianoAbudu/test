package org.fiveware.test.web.controller;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.fiveware.test.model.TaskDTO;
import org.fiveware.test.service.TaskService;
import org.fiveware.test.web.controller.response.TaskPutResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {
	
	private Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	@Autowired
	private TaskService taskService;
	
	@RequestMapping(value = "/task")
	public TaskPutResult put(@RequestBody TaskDTO taskDTO) {
		TaskPutResult taskPutResult = new TaskPutResult();
		try{
			taskService.save(taskDTO);
			taskPutResult.setMessage("Task criada com sucesso.");
		}catch(Exception e){
			logger.log(Level.SEVERE,e.getMessage(), e);
			taskPutResult.setMessage("Erro ao criar task.");
			taskPutResult.setErrorMessage(e.getMessage());
		}
		return taskPutResult;
	}

}
