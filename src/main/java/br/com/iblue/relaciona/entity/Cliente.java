package br.com.iblue.relaciona.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="cliente")
@SequenceGenerator(name="seq_cliente", sequenceName="seq_cliente", initialValue = 1, allocationSize = 1)
public class Cliente implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator="seq_cliente")
	@JsonProperty("idcliente")
	@Column(name="idcliente")
	private Long idCliente;
	
	@JsonProperty("nome-cliente")
	@Column(name="nomecliente", length=50)
	private String nomeCliente;
	
	@JsonProperty("plano")
	@Column(name="plano", length=50)
	private String plano;
	
	@JsonProperty("valor")
	@Column(name="valor")
	private Double valor;

	@JsonProperty("uuid")
	@Column(name="uuid", unique=true)
	private String uuid;
	
	@OneToOne()
	@JoinColumn(name="idusuario", referencedColumnName="idusuario")
	private Usuario usuario;
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public Cliente(Long idCliente, String nomeCliente, String plano, Double valor, String uuid) {
		super();
		this.idCliente = idCliente;
		this.nomeCliente = nomeCliente;
		this.plano = plano;
		this.valor = valor;
		this.uuid = uuid;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nomeCliente=" + nomeCliente + ", plano=" + plano + ", valor="
				+ valor + ", uuid=" + uuid + "]";
	}

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getPlano() {
		return plano;
	}

	public void setPlano(String plano) {
		this.plano = plano;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}