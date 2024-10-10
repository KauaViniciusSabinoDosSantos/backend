package br.itb.projeto.ironworksgym.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Equipamento")
public class Equipamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long ID;
	private String Nome;
	private int Quantidade;
	private String StatusEquipamento;

	
	public Equipamento() {
	}

	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public int getQuantidade() {
		return Quantidade;
	}

	public void setQuantidade(int quantidade) {
		Quantidade = quantidade;
	}

	public String getStatusEquipamento() {
		return StatusEquipamento;
	}

	public void setStatusEquipamento(String statusEquipamento) {
		StatusEquipamento = statusEquipamento;
	}

	
}