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

import br.com.novosares.model.Voo;
import br.com.novosares.repository.VooRepository;

@Controller
@RequestMapping("/voo")
public class VooController {

	@Autowired
	private VooRepository vooRepository;

	@GetMapping
	public ModelAndView home() {
		ModelAndView modelAndView = new ModelAndView("voo/exibir.html");

		List<Voo> voo = vooRepository.findAll();
		modelAndView.addObject("voo", voo);
		return modelAndView;

	}
	    
	@GetMapping("/cadastrar")
	public ModelAndView cadastrar() {
		ModelAndView modelAndView = new ModelAndView("voo/cadastro");

		modelAndView.addObject("voo", new Voo());
       
		return modelAndView;
	}

	@PostMapping("/cadastrar")
	public ModelAndView cadastrar(Voo voo) throws IOException {

		ModelAndView modelAndView = new ModelAndView("redirect:/voo");

		vooRepository.save(voo);

		return modelAndView;
	}

	@GetMapping("/{id}/editar")
	public ModelAndView editar(@PathVariable int id) {
		ModelAndView modelAndView = new ModelAndView("voo/cadastro");

		modelAndView.addObject("voo", vooRepository.getOne(id));

		return modelAndView;
	}

	@PostMapping("/{id}/editar")
	public String salvar(Voo voo) {
		vooRepository.save(voo);

	   return "redirect:/voo";
	   }

	@GetMapping("/{id}/excluir")
	public String excluir(@PathVariable int id) {
		vooRepository.deleteById(id);

		return "redirect:/voo";
	}
}
