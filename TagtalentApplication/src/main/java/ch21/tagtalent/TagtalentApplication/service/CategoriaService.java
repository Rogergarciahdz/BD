package ch21.tagtalent.TagtalentApplication.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ch21.tagtalent.TagtalentApplication.model.Categoria;
import ch21.tagtalent.TagtalentApplication.repository.CategoriaRepository;

@Service
public class CategoriaService {
	private final CategoriaRepository categoriaRepository;
	@Autowired
	public CategoriaService(CategoriaRepository categoriaRepository) {
		this.categoriaRepository = categoriaRepository;
	}//constructor
	
	public List<Categoria> getAllCategoria(){
		return categoriaRepository.findAll();
	}//getAllCategoria
	
	public Categoria getCategoria(Long id) {
		return categoriaRepository.findById(id).orElseThrow(
				()-> new IllegalArgumentException("La categoría con el id "+ 
						id + "no existe."));
	}//getCategoria
	
	public Categoria deleteCategoria(Long id) {
		Categoria tmp = null;
		if(categoriaRepository.existsById(id)) {
			tmp= categoriaRepository.findById(id).get();
			categoriaRepository.deleteById(id);
			}//if
		return tmp;
	}//deleteCategoria
	
	public Categoria addCategoria(Categoria categoria) {
		return categoriaRepository.save(categoria);
	}//addCategoria
	
	public Categoria updateCategoria(Long id, String nombre) {
		Categoria tmp = null;
		if(categoriaRepository.existsById(id)) {
			tmp= categoriaRepository.findById(id).get();
			if (nombre!=null) tmp.setNombre(nombre);
			categoriaRepository.save(tmp);
		}else {
			System.out.println("Upadate - La categoría con el id " + id + "no existe");
		}//else
		return tmp;
	}//updateCategoria
	
}//class CategoriaService
