package org.fiveware.test.model.repository;

import javax.transaction.Transactional;

import org.fiveware.test.model.TaskDTO;
import org.fiveware.test.model.TaskEntity;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class TaskRepositoryInterfaceImpl implements TaskRepositoryInterface {

	@Autowired
    private SessionFactory sessionFactory;
	
	@Override
	public void save(TaskDTO taskDTO) {
    	TaskEntity taskEntity = new TaskEntity();
    	
    	taskEntity.setAvaliacao(taskDTO.getAvaliacao().getCodigo());
    	taskEntity.setCodigo(taskDTO.getCodigo());
    	taskEntity.setDescricao(taskDTO.getDescricao());
    	taskEntity.setRealizada(taskDTO.getRealizada());
    	taskEntity.setStatus(taskDTO.getStatus().getCodigo());
    	
		sessionFactory.getCurrentSession().persist(taskEntity);
    }
}

