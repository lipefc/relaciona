oo~´~;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;ooooooooooooo~;;;;;;;;;;;;package br.com.iblue.relaciona.entity;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="usuario")
@SequenceGenerator(name="seq_usuario", sequenceName="seq_usuario", initialValue = 1, allocationSize = 1)
public class Usuario implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator="seq_usuario")
	@JsonProperty("idusuario")
	@Column(name="idusuario")
	private Long idUsuario;
	
	@JsonProperty("user-name")
	@Column(name="username", length=50)
	private String username;
	
	@JsonProperty("email")
	@Column(name="email", length=50, unique=true)
	private String email;
	
	@JsonProperty("uuid")
	@Column(name="uuid", unique=true)
	private String uuid;

	@OneToOne(mappedBy="usuario", cascade= {CascadeType.PERSIST})
	private Cliente cliente;
	
	public Usuario() {
		this.uuid = UUID.randomUUID().toString();
	}
	
	public Usuario(Long idUsuario, String username, String email) {
		super();
		this.idUsuario = idUsuario;
		this.username = username;
		this.email = email;
		this.uuid = UUID.randomUUID().toString();
	}

	@Override
	public String toString() {
		return "Cliente [idUsuario=" + idUsuario + ", username=" + username + ", email=" + email + ", uuid=" + uuid
				+ "]";
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
