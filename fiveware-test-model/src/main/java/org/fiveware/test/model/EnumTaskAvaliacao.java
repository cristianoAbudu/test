package org.fiveware.test.model;

public enum EnumTaskAvaliacao {
	RUIM(0, "Ruim"),
	REGULAR(3, "Regular"),
	BOM(5, "Bom"),
	OTIMO(10, "Ótimo");
	
	private int codigo;
	private String descricao;
	
	private EnumTaskAvaliacao(int codigo, String descricao) {
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
