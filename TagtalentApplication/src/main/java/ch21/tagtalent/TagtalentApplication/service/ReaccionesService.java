package ch21.tagtalent.TagtalentApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ch21.tagtalent.TagtalentApplication.model.Reacciones;
import ch21.tagtalent.TagtalentApplication.repository.ReaccionesRepository;

@Service
public class ReaccionesService {
	private final ReaccionesRepository reaccionesRepository;
	@Autowired
	public ReaccionesService(ReaccionesRepository reaccionesRepository) {
		this.reaccionesRepository = reaccionesRepository;
	}//constructor
	
	public List<Reacciones> getAllReacciones(){
		return reaccionesRepository.findAll();
	}//getAllReacciones
	
	public Reacciones getReaccion(Long id) {
		return reaccionesRepository.findById(id).orElseThrow(
				()-> new IllegalArgumentException("La reacción con el id "+ 
						id + "no existe."));
	}//getReaccion
	
	public Reacciones deleteReaccion(Long id) {
		Reacciones tmp = null;
		if(reaccionesRepository.existsById(id)) {
			tmp= reaccionesRepository.findById(id).get();
			reaccionesRepository.deleteById(id);
		}//if
		return tmp;
	}//deleteReaccion
		
	public Reacciones addReaccion(Reacciones reacciones) {
		return reaccionesRepository.save(reacciones);
	}//addReaccion
	

}//ReaccionesService
