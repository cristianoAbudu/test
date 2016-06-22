package org.fiveware.test.web.controller;

import java.util.HashMap;
import java.util.Map;

import org.fiveware.test.model.EnumTaskAvaliacao;
import org.fiveware.test.model.EnumTaskStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		
		model.put("status", buildEnumStatusMap());
		model.put("avaliacao", buildEnumTaskAvaliacaoMap());
		
		return "task-create";
	}

	private Map<String, String> buildEnumTaskAvaliacaoMap() {
		Map<String, String> enumTaskAvaliacaoMap = new HashMap<String, String>();
		
		for(EnumTaskAvaliacao enumTaskAvaliacao : EnumTaskAvaliacao.values()){
			enumTaskAvaliacaoMap.put(enumTaskAvaliacao.toString(), enumTaskAvaliacao.getDescricao());
		}
		return enumTaskAvaliacaoMap;
	}

	private Map<String, String> buildEnumStatusMap() {
		Map<String, String> enumTaskStatusMap = new HashMap<String, String>();
		
		for(EnumTaskStatus enumTaskStatus : EnumTaskStatus.values()){
			enumTaskStatusMap.put(enumTaskStatus.toString(), enumTaskStatus.getDescricao());
		}
		return enumTaskStatusMap;
	}

}
