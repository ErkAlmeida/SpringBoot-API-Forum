package br.com.alura.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.demo.model.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long>{

}
