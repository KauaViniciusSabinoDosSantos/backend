package br.itb.projeto.ironworksgym.model.entity;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Mensagem")
public class Mensagem {

	@Id
	@GeneratedValue
		(strategy = GenerationType.IDENTITY)
	private long ID;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private LocalDateTime Data_Mensagem;
	private String Emissor;
	private String Email;
	private String Telefone;
	private String Texto;
	private String StatusMensagem;
	public long getID() {
		return ID;
	}
	public void setID(long iD) {
		ID = iD;
	}
	public LocalDateTime getData_Mensagem() {
		return Data_Mensagem;
	}
	public void setData_Mensagem(LocalDateTime data_Mensagem) {
		Data_Mensagem = data_Mensagem;
	}
	public String getEmissor() {
		return Emissor;
	}
	public void setEmissor(String emissor) {
		Emissor = emissor;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getTelefone() {
		return Telefone;
	}
	public void setTelefone(String telefone) {
		Telefone = telefone;
	}
	public String getTexto() {
		return Texto;
	}
	public void setTexto(String texto) {
		Texto = texto;
	}
	public String getStatusMensagem() {
		return StatusMensagem;
	}
	public void setStatusMensagem(String statusMensagem) {
		StatusMensagem = statusMensagem;
	}
	
	
	
	
	
}
