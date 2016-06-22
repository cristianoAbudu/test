package org.fiveware.test.web.controller;

import junit.framework.Assert;

import org.fiveware.test.model.EnumTaskAvaliacao;
import org.fiveware.test.model.EnumTaskStatus;
import org.fiveware.test.model.TaskDTO;
import org.fiveware.test.web.controller.TaskController;
import org.junit.Test;

public class TaskControllerTestSuite {
	
	@Test
	public void requisicaoSimplesTest(){
		TaskDTO taskDTO = new TaskDTO();
		
		taskDTO.setDescricao("Terminar teste Fireware");
		taskDTO.setRealizada(false);
		taskDTO.setStatus(EnumTaskStatus.NO_PRAZO);
		taskDTO.setAvaliacao(EnumTaskAvaliacao.OTIMO);//I hope so :)
		
		
		Assert.assertEquals("Task criada com sucesso.", new TaskController().put(taskDTO).getMessage());
	}
} 
