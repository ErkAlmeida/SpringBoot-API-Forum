package br.com.alura.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.demo.controller.dto.TopicoDto;
import br.com.alura.demo.model.Curso;
import br.com.alura.demo.model.Topico;

@RestController
public class TopicosController {

	@RequestMapping("/topicos")
	public List<TopicoDto> lista(){
		
		Topico topico = new Topico("Duuvida", "Mokando dados",new Curso("Spring","Programação"));
		
		return TopicoDto.converter(Arrays.asList(topico,topico,topico));
	}
}
