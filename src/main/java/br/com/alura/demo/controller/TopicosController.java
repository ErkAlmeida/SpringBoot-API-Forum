package br.com.alura.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.demo.model.Curso;
import br.com.alura.demo.model.Topico;

@RestController
public class TopicosController {

	@RequestMapping("/topicos")
	public List<Topico> lista(){
		
		Topico topico = new Topico("Duuvida", "Mokando dados",new Curso("Spring","Programação"));
		
		return Arrays.asList(topico,topico,topico);
	}
}
