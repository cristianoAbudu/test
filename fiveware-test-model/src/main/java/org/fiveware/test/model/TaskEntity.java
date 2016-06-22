package org.fiveware.test.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FIVEWARE_TEST.TASK")
public class TaskEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codigo;
	 
	private String descricao;
	private Boolean realizada;
	private Integer status;
	private Integer avaliacao;
	
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
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getAvaliacao() {
		return avaliacao;
	}
	public void setAvaliacao(Integer avaliacao) {
		this.avaliacao = avaliacao;
	}
	
}
