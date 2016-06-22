package org.fiveware.test.service;

import org.fiveware.test.model.TaskDTO;
import org.fiveware.test.model.repository.TaskRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
	
	@Autowired
	private TaskRepositoryInterface taskRepositoryInterface;

	public void save(TaskDTO taskDTO) {
		taskRepositoryInterface.save(taskDTO);
	}

}
