package ch21.tagtalent.TagtalentApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ch21.tagtalent.TagtalentApplication.model.Categoria;
import ch21.tagtalent.TagtalentApplication.model.Usuario;
import ch21.tagtalent.TagtalentApplication.service.CategoriaService;

@RestController
@RequestMapping(path = "/categoria/")
public class CategoriaController {
private final CategoriaService categoriaService;
	@Autowired
	public CategoriaController (CategoriaService categoriaService) {
		this.categoriaService=categoriaService;
	}
	
	@GetMapping
	public List<Categoria>getAllCategoria(){
		return categoriaService.getAllCategoria();
	} 
	
	@GetMapping(path = "{catId}") 
	public Categoria getCategoria(@PathVariable("catId")Long id ) {
		return categoriaService.getCategoria(id);
	}
	
	
	@DeleteMapping
	public Categoria deleteCategoria(Long id) {
		return categoriaService.deleteCategoria(id);
		
	}
	
	
	@PostMapping
	public Categoria addCategoria(@RequestBody Categoria categoria ) {
		return categoriaService.addCategoria(categoria);
	}
	
	
	@PutMapping(path = "{catId}")//http://localhost:8080/api/productos/1
	public Categoria updatecaCategoria(@PathVariable("catId") Long Id,
		@RequestParam(required = false) String nombre)
		 {
		
		return categoriaService.updateCategoria(Id, nombre);
	}
	
	
}
