package com.cruzandre.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cruzandre.forum.controller.dto.TopicoDTO;
import com.cruzandre.forum.model.Curso;
import com.cruzandre.forum.model.Topico;

@RestController
public class TopicosController {

	@RequestMapping("/topicos")
	public List<TopicoDTO> lista() {
		Topico topico = new Topico("Duvida", "Duvida com Spring", new Curso("Spring", "Programação"));
		
		return TopicoDTO.converter(Arrays.asList(topico, topico, topico));
	}
}
