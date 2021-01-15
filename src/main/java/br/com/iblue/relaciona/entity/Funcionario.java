package br.com.iblue.relaciona.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="funcionario")
@PrimaryKeyJoinColumn(name="id")
public class Funcionario extends Pessoa implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Column(name="cargo", length=50)
	@JsonProperty("cargo")
	private String cargo;
	
	@Column(name="nivel", length=50)
	@JsonProperty("nivel")
	private String nivel;
	
	@Column(name="salario")
	@JsonProperty("salario")
	private Double salario;
	
	@Column(name="desconto")
	@JsonProperty("desconto")
	private Double desconto;
	
	@Column(name="acrescimo")
	@JsonProperty("acrescimo")
	private Double acrescimo;

	public Funcionario() {
		// TODO Auto-generated constructor stub
	}

	public Funcionario(String cargo, String nivel, Double salario, Double desconto, Double acrescimo) {
		super();
		this.cargo = cargo;
		this.nivel = nivel;
		this.salario = salario;
		this.desconto = desconto;
		this.acrescimo = acrescimo;
	}


	public Funcionario(Long id, String nome, String email, String cargo, String nivel, Double salario, Double desconto, Double acrescimo) {
		super(id, nome, email);
		this.cargo = cargo;
		this.nivel = nivel;
		this.salario = salario;
		this.desconto = desconto;
		this.acrescimo = acrescimo;
	}

	@Override
	public String toString() {
		return "Funcionario [cargo=" + cargo + ", nivel=" + nivel + ", salario=" + salario + ", desconto=" + desconto
				+ ", acrescimo=" + acrescimo + ", getId()=" + getId() + ", getNome()=" + getNome() + ", getEmail()="
				+ getEmail() + "]";
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Double getDesconto() {
		return desconto;
	}

	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}

	public Double getAcrescimo() {
		return acrescimo;
	}

	public void setAcrescimo(Double acrescimo) {
		this.acrescimo = acrescimo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
