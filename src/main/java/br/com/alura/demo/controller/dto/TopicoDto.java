package br.com.alura.demo.controller.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import br.com.alura.demo.model.Topico;

public class TopicoDto {
	
	private Long id;
	private String titulo;
	private String mensagem;
	private LocalDateTime dataCricao;
	
	public TopicoDto(Topico topico) {
		this.id = topico.getId();
		this.titulo = topico.getMensagem();
		this.dataCricao = topico.getDataCriacao();
	}
	
	
	public Long getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}
	public String getMensagem() {
		return mensagem;
	}
	public LocalDateTime getDataCricao() {
		return dataCricao;
	}

	public static List<TopicoDto> converter(List<Topico> topicos) 
	{
		
		return topicos.stream().map(TopicoDto::new).collect(Collectors.toList());
	}
}
