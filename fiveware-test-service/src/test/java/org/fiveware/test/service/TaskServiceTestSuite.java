package org.fiveware.test.service;

import junit.framework.Assert;

import org.fiveware.test.model.EnumTaskAvaliacao;
import org.fiveware.test.model.EnumTaskStatus;
import org.fiveware.test.model.TaskDTO;
import org.junit.Test;

public class TaskServiceTestSuite {
	
	@Test
	public void saveTaskTest(){
		TaskDTO taskDTO = new TaskDTO();
		
		taskDTO.setDescricao("Terminar teste Fireware");
		taskDTO.setRealizada(false);
		taskDTO.setStatus(EnumTaskStatus.NO_PRAZO);
		taskDTO.setAvaliacao(EnumTaskAvaliacao.OTIMO);//I hope so :)
		
		try{
			new TaskService().save(taskDTO);
		}catch(Exception e){
			Assert.fail();
		}
		
	}
}
