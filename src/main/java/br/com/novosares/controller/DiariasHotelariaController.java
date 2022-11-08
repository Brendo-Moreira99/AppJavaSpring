package br.com.novosares.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import br.com.novosares.model.DiariasHotelaria;
import br.com.novosares.model.UF;
import br.com.novosares.repository.DiariasHotelariaRepository;

@Controller
@RequestMapping("/diarias")
public class DiariasHotelariaController {

	@Autowired
	private DiariasHotelariaRepository diariasHotelariaRepository;

	@GetMapping
	public ModelAndView home() {
		ModelAndView modelAndView = new ModelAndView("diarias/exibir.html");

		List<DiariasHotelaria> diariasHotelaria = diariasHotelariaRepository.findAll();
		modelAndView.addObject("diariasHotelaria", diariasHotelaria);
		return modelAndView;

	}
	    
	@GetMapping("/cadastrar")
	public ModelAndView cadastrar() {
		ModelAndView modelAndView = new ModelAndView("diarias/cadastro");

		modelAndView.addObject("diariasHotelaria", new DiariasHotelaria());
         modelAndView.addObject("ufs", UF.values());

		return modelAndView;
	}

	@PostMapping("/cadastrar")
	public ModelAndView cadastrar(DiariasHotelaria diariasHotelaria) throws IOException {

		ModelAndView modelAndView = new ModelAndView("redirect:/diarias");

		diariasHotelariaRepository.save(diariasHotelaria);

		return modelAndView;
	}

	@GetMapping("/{id}/editar")
	public ModelAndView editar(@PathVariable int id) {
		ModelAndView modelAndView = new ModelAndView("diarias/cadastro");

		modelAndView.addObject("DiariasHotelaria", diariasHotelariaRepository.getOne(id));
        modelAndView.addObject("ufs", UF.values());

		return modelAndView;
	}

	@PostMapping("/{id}/editar")
	public String salvar(DiariasHotelaria diariasHotelaria) {
		diariasHotelariaRepository.save(diariasHotelaria);

	   return "redirect:/diarias";
	   }

	@GetMapping("/{id}/excluir")
	public String excluir(@PathVariable int id) {
		diariasHotelariaRepository.deleteById(id);

		return "redirect:/diarias";
	}
}
