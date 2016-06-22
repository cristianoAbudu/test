package org.fiveware.test.model;

public enum EnumTaskStatus {
	
	NO_PRAZO(1,"No Prazo"), ATRASADA(2, "Atrasada"), CANCELADA(3, "Cancelada");
	
	private int codigo;
	private String descricao;
	
	private EnumTaskStatus(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}
	
}
