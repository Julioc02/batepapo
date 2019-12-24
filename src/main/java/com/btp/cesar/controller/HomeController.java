package com.btp.cesar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.btp.cesar.model.Conversa;
import com.btp.cesar.repository.DadosRepository;

@Controller
public class HomeController {
	@Autowired
	DadosRepository dados;
	
		@GetMapping("/batepapo")
		public String Retorne() {
			return "batepapo";
		}
		
		 @GetMapping("/conversas")
		 public ModelAndView listar() {
            ModelAndView modelAndView = new ModelAndView("pg2");
            modelAndView.addObject("DadosRepository", dados.findAll());
            modelAndView.addObject(new Conversa());
            return modelAndView;
	     }
		 
		@PostMapping("/salvar")
		public String salvar(Conversa conversa) {
			dados.save(conversa);
			return "redirect:/conversas";
		}
}
