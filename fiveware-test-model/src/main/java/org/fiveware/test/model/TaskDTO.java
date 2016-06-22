package org.fiveware.test.model;

public class TaskDTO {
	
	private Integer codigo;
	private String descricao;
	private Boolean realizada;
	private EnumTaskStatus status;
	private EnumTaskAvaliacao avaliacao;
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Boolean getRealizada() {
		return realizada;
	}
	public void setRealizada(Boolean realizada) {
		this.realizada = realizada;
	}
	public EnumTaskStatus getStatus() {
		return status;
	}
	public void setStatus(EnumTaskStatus status) {
		this.status = status;
	}
	public EnumTaskAvaliacao getAvaliacao() {
		return avaliacao;
	}
	public void setAvaliacao(EnumTaskAvaliacao avaliacao) {
		this.avaliacao = avaliacao;
	}
}
