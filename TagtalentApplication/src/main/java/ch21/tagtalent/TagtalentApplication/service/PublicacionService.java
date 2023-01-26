package ch21.tagtalent.TagtalentApplication.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ch21.tagtalent.TagtalentApplication.model.Publicacion;
import ch21.tagtalent.TagtalentApplication.repository.PublicacionRepository;

@Service
public class PublicacionService {
	private final PublicacionRepository publicacionRepository;
	@Autowired
	public PublicacionService(PublicacionRepository publicacionRepository) {
		this.publicacionRepository = publicacionRepository;
	}//constructor
	
	public List<Publicacion> getAllPublicaciones(){
		return publicacionRepository.findAll();
	}//getAllPublicaciones
	
	public Publicacion getPublicacion(Long id) {
		return publicacionRepository.findById(id).orElseThrow(
				()-> new IllegalArgumentException("La publicación con el id "+ 
						id + "no existe."));
	}//getPublicacion
	
	public Publicacion deletePublicacion(Long id) {
		Publicacion tmp = null;
		if(publicacionRepository.existsById(id)) {
			tmp= publicacionRepository.findById(id).get();
			publicacionRepository.deleteById(id);
		}//if
		return tmp;
	}//deletePublicacion
	
	public Publicacion addPublicacion(Publicacion publicacion) {
		return publicacionRepository.save(publicacion);
	}//addPublicacion
	
	public Publicacion updatePublicacion (Long id, String titulo, String descripcion, String img, Date fecha, int num_reacciones) {
		Publicacion tmp = null;
		if(publicacionRepository.existsById(id)) {
			tmp= publicacionRepository.findById(id).get();
			if (titulo!=null) tmp.setTitulo(titulo);
			if (descripcion!=null) tmp.setDescripcion(descripcion);
			if (img!=null) tmp.setImg(img);
			if (num_reacciones!=0) tmp.setNum_reacciones(num_reacciones);
			publicacionRepository.save(tmp);
		}else {
			System.out.println("Upadate - La categoría con el id " + id + "no existe");
		}//else
		return tmp;
		
	}//updatePublicacion
}//class PublicacionService
