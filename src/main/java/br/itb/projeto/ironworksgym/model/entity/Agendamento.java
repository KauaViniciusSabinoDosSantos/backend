package br.itb.projeto.ironworksgym.model.entity;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Agendamento")
public class Agendamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long ID;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private LocalDate Data_Disponivel;
	private String Horario_Disponivel;

	@ManyToOne
	@JoinColumn(name = "Usuario_ID")
	private Usuario usuario;

	@ManyToOne
	@JoinColumn(name = "Equipamento_ID")
	private Equipamento equipamento;
	private String StatusAgendamento;


	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

	public LocalDate getData_Disponivel() {
		return Data_Disponivel;
	}

	public void setData_Disponivel(LocalDate data_Disponivel) {
		Data_Disponivel = data_Disponivel;
	}

	public String getHorario_Disponivel() {
		return Horario_Disponivel;
	}

	public void setHorario_Disponivel(String horario_Disponivel) {
		Horario_Disponivel = horario_Disponivel;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Equipamento getEquipamento() {
		return equipamento;
	}

	public void setEquipamento(Equipamento equipamento) {
		this.equipamento = equipamento;
	}

	public String getStatusAgendamento() {
		return StatusAgendamento;
	}

	public void setStatusAgendamento(String statusAgendamento) {
		StatusAgendamento = statusAgendamento;
	}

	
}