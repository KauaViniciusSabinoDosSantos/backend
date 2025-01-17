package br.itb.projeto.ironworksgym.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.itb.projeto.ironworksgym.model.entity.Mensagem;

@Repository
public interface MensagemRepository extends JpaRepository<Mensagem, Long> {

}