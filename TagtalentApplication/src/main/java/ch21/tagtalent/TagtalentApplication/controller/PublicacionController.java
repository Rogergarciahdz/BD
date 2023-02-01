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

import ch21.tagtalent.TagtalentApplication.model.Publicacion;
import ch21.tagtalent.TagtalentApplication.model.Reacciones;
import ch21.tagtalent.TagtalentApplication.model.Usuario;
import ch21.tagtalent.TagtalentApplication.service.PublicacionService;

@RestController
@RequestMapping(path = "/publicacion/")
public class PublicacionController {
private final PublicacionService publicacionService;

@Autowired
public PublicacionController(PublicacionService publicacionService) {
	this.publicacionService=publicacionService;
}

@GetMapping
public List<Publicacion>getAllpPublicaciones(){
	return publicacionService.getAllPublicaciones();
}

@GetMapping (path ="{pubId}")
public Publicacion getPublicacion(Long id){
	return publicacionService.getPublicacion(id);
}

@DeleteMapping
public Publicacion deletePublicacion(@PathVariable("pubId") Long id) {
	return publicacionService.deletePublicacion(id);
}

@PostMapping
public Publicacion addPublicacion(@RequestBody Publicacion publicacion){
	return publicacionService.addPublicacion(publicacion);
}


@PutMapping(path = "{pubId}")//http://localhost:8080/publicaciones/1
public Publicacion updatePublicacion(@PathVariable("pubId") Long Id,
	@RequestParam(required = false) String titulo,
	@RequestParam(required = false) String descripcion,
	@RequestParam(required = false) String img,
	
	@RequestParam(required = false) int num_reacciones)
	 
{
	
	return publicacionService.updatePublicacion(Id, titulo, descripcion, img, num_reacciones);
}

}
